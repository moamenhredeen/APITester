package com.moamen.controllers;

import com.moamen.constants.HTTPMethod;
import com.moamen.repository.ProjectRepository;
import com.moamen.services.RestClient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private RestClient restClient;
    private ProjectRepository projectRepository;


    @FXML
    private TextField requestUrl;
    // @FXML
    // private CodeArea requestBody;
    @FXML
    private ComboBox<String> requestHttpVerb;
    @FXML
    private TextArea outputRaw;
    @FXML
    private VBox requestHeaders;


    @FXML
    private void addRequestHeader(ActionEvent event) {
        try {
            var header = (Node) FXMLLoader.load(getClass().getResource("/widgets/Header.fxml"));
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
        projectRepository.test();
        outputRaw.setText("something");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        requestHttpVerb.getItems().addAll(
                HTTPMethod.GET,
                HTTPMethod.POST,
                HTTPMethod.PUT,
                HTTPMethod.DELETE);
    }

}
