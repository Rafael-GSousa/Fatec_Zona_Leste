package view;

import javax.swing.JOptionPane;

import controller.EquacaoController;

public class Main_Ex05 {

	public static void main(String[] args) {
		EquacaoController eqCont = new EquacaoController();
		
		String a = JOptionPane.showInputDialog(null, "Digite o valor de A");
		double valorA = Double.parseDouble(a);
		
		String b = JOptionPane.showInputDialog(null, "Digite o valor de B");
		double valorB = Double.parseDouble(b);
		
		String c = JOptionPane.showInputDialog(null, "Digite o valor de c");
		double valorC = Double.parseDouble(c);

		
		double x1 = eqCont.raiz1(valorA, valorB, valorC);
		double x2 = eqCont.raiz2(valorA, valorB, valorC);
		
		System.out.println("X1 = " + x1);
		System.out.println("X2 = " + x2);
		
	}

}
