package com.moamen.controllers;

import com.moamen.services.HTTPMethod;
import com.moamen.services.RestClient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class MainViewController implements Initializable {
    private RestClient restClient = new RestClient();

    @FXML
    private ComboBox<String> comboBoxHttpVerbs;

    @FXML
    private TextField textFieldUrl;

    @FXML
    private TextArea outputRaw;

    @FXML
    private void sendRequest() throws IOException {
        var url = textFieldUrl.getText().trim();

        if(url.isEmpty()){
            return ;
        }

        var httpVerb = comboBoxHttpVerbs.getValue();
        String res = "error";
        switch (httpVerb){
            case HTTPMethod.GET:
                res = restClient.getRequest(url);
                break;
            case HTTPMethod.POST:
                res = restClient.getRequest(url);
                break;
        }

        outputRaw.setText(res);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBoxHttpVerbs.getItems().addAll(
                HTTPMethod.GET,
                HTTPMethod.POST,
                HTTPMethod.PUT,
                HTTPMethod.DELETE);
        comboBoxHttpVerbs.getSelectionModel().selectFirst();

    }
}
