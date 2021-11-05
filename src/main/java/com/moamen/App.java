package com.moamen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/widgets/App.fxml"));

        var scene = new Scene(root, 1200, 600);
        stage.setScene(scene);
        stage.setTitle("API TESTER");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}