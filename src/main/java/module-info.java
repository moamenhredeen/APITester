module com.moamen {

    requires javafx.fxml;
    requires javafx.controls;
    requires lombok;
    requires java.net.http;
    requires ormlite.core;
    requires ormlite.jdbc;
    requires java.sql;
    requires java.compiler;
    requires org.fxmisc.richtext;
    requires reactfx;
    requires com.fasterxml.jackson.core;
    requires com.jfoenix;

    exports com.moamen;

    opens com.moamen.controllers to javafx.fxml;
}