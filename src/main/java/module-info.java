module com.example.calculadoraareatriangulo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculadoraareatriangulo to javafx.fxml;
    exports com.example.calculadoraareatriangulo;
}