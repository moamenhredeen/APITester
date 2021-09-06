package com.moamen.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;

public class HeaderController{

    @FXML
    private void removeRequestHeader(ActionEvent event){
        var header = ((Parent) event.getTarget()).getParent();
        System.out.println(header);
    }

}
