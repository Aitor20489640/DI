module demo01.src.main.java.com.example.demo01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens demo01.src.main.java.com.example.demo01 to javafx.fxml;
    exports demo01.src.main.java.com.example.demo01;
}