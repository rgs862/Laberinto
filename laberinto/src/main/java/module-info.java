module com.back {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.back to javafx.fxml;
    exports com.back;
}
