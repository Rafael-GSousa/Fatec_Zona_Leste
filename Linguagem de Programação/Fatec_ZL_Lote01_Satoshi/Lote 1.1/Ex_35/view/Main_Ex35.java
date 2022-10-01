package view;

import javax.swing.JOptionPane;

import controller.SerieFatorial;

public class Main_Ex35 {

	public static void main(String[] args) {
		
		SerieFatorial sCont = new SerieFatorial();
		
		double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		
		sCont.serieFat((int) num);

	}

}
