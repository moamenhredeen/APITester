package com.moamen.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class HttpRequestView implements Initializable {
    public TextArea requestBody;
    public TextField requestUrl;
    public ComboBox requestHttpVerb;
    public VBox headers;

    public void submitHandler(final ActionEvent actionEvent) {
    }



    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle) {
        this.requestHttpVerb.getItems().addAll("GET", "POST", "PUT", "DELETE");
        this.requestHttpVerb.getSelectionModel().select("GET");
    }
}
