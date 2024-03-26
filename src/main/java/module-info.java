module com.example.arduphonepc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.arduphonepc to javafx.fxml;
    exports com.example.arduphonepc;
}