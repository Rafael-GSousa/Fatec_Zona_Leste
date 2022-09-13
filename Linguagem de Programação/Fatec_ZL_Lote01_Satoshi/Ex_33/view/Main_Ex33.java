package view;

import javax.swing.JOptionPane;

import controller.TabuadaController;

public class Main_Ex33 {

	public static void main(String[] args) {
		
		TabuadaController tabCont = new TabuadaController();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		
		tabCont.tabuada(num);

	}

}
