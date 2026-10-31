module com.example.balanceadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.balanceadora to javafx.fxml;
    exports com.example.balanceadora;
}