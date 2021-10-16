module com.moamen {

    requires org.apache.httpcomponents.core5.httpcore5;
    requires javafx.fxml;

    exports com.moamen;

    opens com.moamen.controllers to javafx.fxml;
}