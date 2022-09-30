package view;

import controller.Potencia;

//import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Potencia potencia = new Potencia();

        int base, expoente;

        System.out.println("Digite o valor da base");
        base = scan.nextInt();
        System.out.println("Digite o valor do expoente");
        expoente = scan.nextInt();

//        JOptionPane.showMessageDialog(null, "Base ==> " + base + "\nExpoente ==> " +
//                expoente + "\nResultado ==> " + potencia.mostraPotencia(base, expoente));

        System.out.println("\nBase ==> " + base + "\nExpoente ==> " +
                expoente + "\nResultado ==> " + potencia.mostraPotencia(base, expoente));
    }
}
