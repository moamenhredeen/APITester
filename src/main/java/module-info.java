module com.moamen {
    requires okhttp3;
    requires javafx.controls;
    requires javafx.fxml;
    exports com.moamen;
    exports com.moamen.controllers;
    opens   com.moamen.controllers to javafx.fxml;
}