package view;

import javax.swing.JOptionPane;

import controller.IdadeController;

public class Main_Ex12 {

	public static void main(String[] args) {
		
		IdadeController idadeC = new IdadeController();
		
		String nasc, atual;
		int ano_N = 0, ano_A = 0;
		
		nasc = JOptionPane.showInputDialog("Digite seu ano de nascimento");
		ano_N = Integer.parseInt(nasc);
		
		atual = JOptionPane.showInputDialog("Digite o ano atual");
		ano_A = Integer.parseInt(atual);
		
		JOptionPane.showMessageDialog(null, "Ano de nascimento >>> " + ano_N + 
		"\nAno atual >>> " + ano_A + "\nIdade daqui a 17 anos >>> " + idadeC.calcIdade(ano_N, ano_A));

	}

}
