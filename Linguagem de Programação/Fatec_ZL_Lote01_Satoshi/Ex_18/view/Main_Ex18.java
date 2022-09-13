package view;

import javax.swing.JOptionPane;

import controller.DifController;

public class Main_Ex18 {

	public static void main(String[] args) {
		
		DifController difCont = new DifController();
		
		String a, b;
		int val1, val2;
		
		a = JOptionPane.showInputDialog("Digite um valor inteiro");
		val1 = Integer.parseInt(a);
		
		b = JOptionPane.showInputDialog("Digite outro valor inteiro");
		val2 = Integer.parseInt(b);
		
		System.out.println("A diferença entre " + difCont.validaMaior(val1, val2) + " e " 
		+ difCont.validaMenor(val1, val2) + " é " + difCont.difMaior(val1, val2));

	}

}
