package com.moamen.controllers;

import com.moamen.constants.HTTPMethod;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import org.apache.hc.core5.http.config.NamedElementChain;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {


    @FXML
    private TextField requestUrl;
    @FXML
    private TextArea requestBody;
    @FXML
    private ComboBox<String> requestHttpVerb;
    @FXML
    private TextArea outputRaw;
    @FXML
    private VBox requestHeaders;


    @FXML
    private void addRequestHeader(ActionEvent event) {
        try {
            var header = (NamedElementChain.Node) FXMLLoader.load(getClass().getResource("/widgets/Header.fxml"));
            var headers = requestHeaders.getChildren();
            headers.add(headers.size() - 2, header);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void submitHandler() throws IOException {
        var url = requestUrl.getText().trim();
        if (url.isEmpty()) {
            // TODO : error handling
            return;
        }

        try(final Close)

        outputRaw.setText("something");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        requestHttpVerb.getItems().addAll(
                HTTPMethod.GET,
                HTTPMethod.POST,
                HTTPMethod.PUT,
                HTTPMethod.DELETE);
        requestHttpVerb.getSelectionModel().selectFirst();
    }
}
