package view;

import javax.swing.JOptionPane;

import controller.TrocaController;

public class Main_Ex06 {

	public static void main(String[] args) {
		
		TrocaController tCont = new TrocaController();
		
		String a, b;
		double val1, val2;
		
		a = JOptionPane.showInputDialog("Digite o primeiro valor");
		val1 = Double.parseDouble(a);
		
		b = JOptionPane.showInputDialog("Digite o segundo valor");
		val2 = Double.parseDouble(b);
		
		System.out.println("Normal >>>> " + val1 + " " + val2);
		tCont.inverteValor(val1, val2);
		

	}

}
