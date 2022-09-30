package view;

import controller.Primos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Primos primos = new Primos();

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(" N1 "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(" N2 "));

        primos.primo(n1, n2);
    }
}
