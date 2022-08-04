package com.moamen.controllers;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.springframework.stereotype.Component;

@Component
public class RequestHeadersView {
    public VBox headers;

    public void removeRequestHeader(final ActionEvent actionEvent) {
        if (this.headers.getChildren().size() > 1) {
            var header = ((Node) actionEvent.getTarget()).getParent();
            this.headers.getChildren().remove(header);
        }
    }

    public void addRequestHeader(final ActionEvent actionEvent) {
        var hbox = new HBox();
        var button = new Button();
        button.getStyleClass().add("btnDeleteHeader");
        button.setOnAction(this::removeRequestHeader);
        var key = new TextField();
        key.setPromptText("key");
        var value = new TextField();
        value.setPromptText("value");
        hbox.getChildren().addAll(key, value, button);
        hbox.getStyleClass().add("header");
        this.headers.getChildren().add(hbox);
    }

    public void deleteRequestHeaders(ActionEvent actionEvent) {
        this.headers.getChildren().remove(0, this.headers.getChildren().size()-1);
    }
}
