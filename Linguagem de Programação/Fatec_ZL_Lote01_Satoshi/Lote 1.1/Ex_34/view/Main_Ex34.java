package view;

import javax.swing.JOptionPane;

import controller.SomaImpares;

public class Main_Ex34 {

	public static void main(String[] args) {
		
		SomaImpares sImp = new SomaImpares();
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("1º Valor"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("2º Valor"));
		
		sImp.somaImpares(num1, num2);

	}

}
