package view;

import javax.swing.JOptionPane;

import controller.ComprimentoController;

public class Main_Ex11 {

	public static void main(String[] args) {
		
		ComprimentoController compCont = new ComprimentoController();
		
		String r = JOptionPane.showInputDialog("Digite o valor do raio da circunfer�ncia");
		double raio = Double.parseDouble(r);
		
		JOptionPane.showMessageDialog(null, "O comprimento da circunfer�ncia, com raio de " + raio + " m�, � de " + compCont.compCirc(raio));

	}

}
