package view;

import javax.swing.JOptionPane;

import controller.AlimentoController;

public class Main_Ex13 {

	public static void main(String[] args) {
		
		AlimentoController aCont = new AlimentoController();
		
		String a = JOptionPane.showInputDialog("Insira a quantidade de alimentos em Kg");
		double alimento = Double.parseDouble(a);
		
		System.out.println(alimento + "Kg de alimento vai durar " + aCont.qtdDias(alimento) + " dias");

	}

}
