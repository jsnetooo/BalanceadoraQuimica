package com.example.calculadoraareatriangulo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TrianguloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TrianguloApplication.class.getResource("area-triangulo.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setMaximized(true);
        stage.setTitle("Área do Triângulo");
        stage.setScene(scene);
        stage.show();
    }
}
