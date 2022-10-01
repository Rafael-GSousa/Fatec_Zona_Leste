package view;

import javax.swing.JOptionPane;

import controller.SerieController;

public class Main_Ex32 {

	public static void main(String[] args) {
		
		SerieController sCont = new SerieController();
		
		double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		
		sCont.serie(num);

	}

}
