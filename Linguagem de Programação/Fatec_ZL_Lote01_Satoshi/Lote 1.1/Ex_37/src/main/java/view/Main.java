package view;

import controller.Fibonacci;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor!"));

        fb.fibo(n);
    }
}
