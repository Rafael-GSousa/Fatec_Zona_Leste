package view;

import javax.swing.JOptionPane;

import controller.IdController;

public class Main_Ex29 {

	public static void main(String[] args) {
		
		IdController idCont = new IdController();
		
		int anoN, mesN, diaN;
		
		anoN = Integer.parseInt(JOptionPane.showInputDialog("Ano nascimento"));
		mesN = Integer.parseInt(JOptionPane.showInputDialog("Mês nascimento"));
		diaN = Integer.parseInt(JOptionPane.showInputDialog("Dia nascimento"));
		
		if(idCont.validarData(anoN, mesN, diaN)) {
			idCont.idade(anoN, mesN, diaN);
		}else {
			System.err.println("Data inválida!");
		}
		

	}

}
