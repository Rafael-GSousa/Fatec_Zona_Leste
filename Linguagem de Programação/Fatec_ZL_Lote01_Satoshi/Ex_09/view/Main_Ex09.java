package view;

import javax.swing.JOptionPane;

import controller.SomaQuadradosController;

public class Main_Ex09 {

	public static void main(String[] args) {
		SomaQuadradosController somaQuad = new SomaQuadradosController();
		
		String v1, v2;
		int val1, val2;
		
		v1 = JOptionPane.showInputDialog("Digite um n�mero inteiro!");
		val1 = Integer.parseInt(v1);
		
		v2 = JOptionPane.showInputDialog("Digite outro n�mero inteiro!");
		val2 = Integer.parseInt(v2);
		
		JOptionPane.showMessageDialog(null, "A soma dos quadrados de " + val1 + " e "
		+ val2 + " � igual a " + somaQuad.somaQuadrados(val1, val2));

	}

}
