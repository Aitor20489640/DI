module com.example.demo01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo01 to javafx.fxml;
    exports com.example.demo01;
}