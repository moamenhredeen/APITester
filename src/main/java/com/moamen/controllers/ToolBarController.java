package com.moamen.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class ToolBarController implements Initializable {

    @FXML
    private void save(ActionEvent event) {
        System.out.println("save");
    }

    @FXML
    private void search(ActionEvent event) {
        System.out.println("search");
    }

    @FXML
    private void customize(ActionEvent event) {
        System.out.println("customize");
    }

    @FXML
    private void settings(ActionEvent event) {
        System.out.println("settings");
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
