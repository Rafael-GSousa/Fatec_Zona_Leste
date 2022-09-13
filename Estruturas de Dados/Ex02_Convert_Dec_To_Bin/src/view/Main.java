package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Main {

	public static void main(String[] args) {
		
		ConverteController cCont = new ConverteController();
		
		int dec = 0;
		String decimal = "";
		String valor = "";
		decimal = JOptionPane.showInputDialog("Insira um valor inteiro decimal");
		dec = Integer.parseInt(decimal);
		valor = cCont.decToBin(dec);
		
		System.out.println("\n\nDecimal ==> " + dec);
		System.out.println("Binário ==> " + valor);

	}

}
