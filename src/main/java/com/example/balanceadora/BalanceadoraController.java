package com.example.balanceadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BalanceadoraController {

    @FXML
    private Label lbBase;

    @FXML
    private Label lbResultado;

    @FXML
    private TextField tfBase;

    @FXML
    void cliqueBalancear(ActionEvent event) {

    }

    @FXML
    void indice(ActionEvent event) {

        int inicio = tfBase.getSelection().getStart();
        int fim = tfBase.getSelection().getEnd();

        System.out.println("Início: " + inicio);
        System.out.println("Fim: " + fim);

        String selecionado = tfBase.getText().substring(inicio, fim);

        String resultado = selecionado
                .replace("0", "₀")
                .replace("1", "₁")
                .replace("2", "₂")
                .replace("3", "₃")
                .replace("4", "₄")
                .replace("5", "₅")
                .replace("6", "₆")
                .replace("7", "₇")
                .replace("8", "₈")
                .replace("9", "₉");
        tfBase.replaceText(inicio, fim, resultado);

    }
    @FXML
    void carga(ActionEvent event) {
        int inicio = tfBase.getSelection().getStart();
        int fim = tfBase.getSelection().getEnd();

        System.out.println("Início: " + inicio);
        System.out.println("Fim: " + fim);

        String selecionado = tfBase.getText().substring(inicio, fim);

        String resultado = selecionado
                .replace("0", "⁰")
                .replace("1", "¹")
                .replace("2", "²")
                .replace("3", "³")
                .replace("4", "⁴")
                .replace("5", "⁵")
                .replace("6", "⁶")
                .replace("7", "⁷")
                .replace("8", "⁸")
                .replace("9", "⁹")
                .replace("+", "⁺")
                .replace("-", "⁻");
        tfBase.replaceText(inicio, fim, resultado);
    }
}
