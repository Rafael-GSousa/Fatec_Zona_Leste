package view;

import javax.swing.JOptionPane;

import controller.ComprimentoController;

public class Main_Ex11 {

	public static void main(String[] args) {
		
		ComprimentoController compCont = new ComprimentoController();
		
		String r = JOptionPane.showInputDialog("Digite o valor do raio da circunferência");
		double raio = Double.parseDouble(r);
		
		JOptionPane.showMessageDialog(null, "O comprimento da circunferência, com raio de " + raio + " m³, é de " + compCont.compCirc(raio));

	}

}
