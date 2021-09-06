package com.moamen.controllers;

import com.moamen.services.HTTPMethod;
import com.moamen.services.RestClient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class MainController implements Initializable {

    private RestClient client = new RestClient();

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
            var header = (Node) FXMLLoader.load(getClass().getResource("/widgets/Header.fxml"));
            var headers = requestHeaders.getChildren();
            headers.add(headers.size() - 2, header);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void submitHandler() {
        var url = requestUrl.getText().trim();
        if (url.isEmpty()) {
            // TODO : error handling
            return;
        }

        CompletableFuture.supplyAsync(() -> {
            String res = null;
            try {
                res = client.getRequest(url);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return res;
        }).thenAcceptAsync((res) -> outputRaw.setText(res));
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
