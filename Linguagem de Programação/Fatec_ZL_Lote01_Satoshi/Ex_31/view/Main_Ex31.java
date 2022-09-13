package view;

import javax.swing.JOptionPane;

import controller.FatorialController;

public class Main_Ex31 {

	public static void main(String[] args) {
		
		FatorialController fatCont = new FatorialController();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Valor"));
		
		fatCont.fatorial(num);

	}

}
