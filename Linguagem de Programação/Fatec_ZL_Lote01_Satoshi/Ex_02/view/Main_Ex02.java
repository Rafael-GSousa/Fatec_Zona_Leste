package view;

import javax.swing.JOptionPane;

import controller.SalController;

public class Main_Ex02 {

	public static void main(String[] args) {
		SalController salCont = new SalController();
		
		String input = JOptionPane.showInputDialog(null, "Digite o valor do salário (incluindo os centavos)");
		
		double entrada = Double.parseDouble(input);
		
		double salario = salCont.calcSal(entrada);
		
		JOptionPane.showMessageDialog(null, "O salário de R$ " + entrada + ", com reajuste de 15%, é de R$ " + salario + ".");

	}

}
