package view;

import controller.Serie;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Serie serie = new Serie();

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));

        serie.calc(n);
    }
}
