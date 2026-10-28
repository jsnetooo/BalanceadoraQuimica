package com.example.calculadoraareatriangulo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AreaTrianguloController {

    @FXML
    private Label lbAltura;

    @FXML
    private Label lbBase;

    @FXML
    private Label lbResultado;

    @FXML
    private TextField tfAltura;

    @FXML
    private TextField tfBase;

    @FXML
    void cliqueCalcular(ActionEvent event) {
            String baseString = tfBase.getText().replace(",", ".");
            String alturaString = tfAltura.getText().replace(",", ".");

            if (baseString.isBlank() || alturaString.isBlank()) {
                lbResultado.setText("Não é possível calcular se tiver campos vazios!");
                lbResultado.setStyle("#eb0e0e");
                tfBase.clear();
                tfAltura.clear();
            } else{
            try {
                double base = Double.parseDouble(baseString);
                double altura = Double.parseDouble(alturaString);
                if (base <= 0 || altura <= 0) {
                    lbResultado.setText("Não é possível calcular com medidas não positivas;");
                    lbResultado.setStyle("#eb0e0e");
                    tfBase.clear();
                    tfAltura.clear();
                } else {
                    double area = base * altura / 2;
                    lbResultado.setText("A área do triângulo é " + area);
                }
            } catch (NumberFormatException nfe) {
                lbResultado.setText("Digite apenas números!");
                lbResultado.setStyle("#eb0e0e");
                tfAltura.clear();
                tfBase.clear();
            }

        }
    }
    }

