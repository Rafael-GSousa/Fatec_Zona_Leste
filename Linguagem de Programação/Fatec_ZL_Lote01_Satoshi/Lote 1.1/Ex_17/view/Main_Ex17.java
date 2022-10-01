package view;

import javax.swing.JOptionPane;

import controller.LitrosController;

public class Main_Ex17 {

	public static void main(String[] args) {
		LitrosController lCont = new LitrosController();
		
		String tP, vM;
		double tPerc, vMedia, litros;
		
		tP = JOptionPane.showInputDialog("Tempo de percurso");
		tPerc = Double.parseDouble(tP);
		
		vM = JOptionPane.showInputDialog("Velocidade m�dia");
		vMedia = Double.parseDouble(vM);

		litros = lCont.calcLitros(tPerc, vMedia);
		
		System.out.println("Tempo de percurso = " + tPerc); 
		System.out.println("Velocidade m�dia = " + vMedia);
		System.out.println("Quantidade de litros gastos = " + litros);
	}

}
