package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.rafaelgaldino.Pilha;
import controller.PalindromoController;

public class Main {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		PalindromoController pC = new PalindromoController();
		
		String inverte = null;
		boolean validaStr;
		
		String entrada = JOptionPane.showInputDialog("Digite uma cadeia de caracteres");

		try {
			inverte = pC.invertePalavra(p, entrada);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		validaStr = pC.comparaPalavras(entrada, inverte);
		
		if(validaStr) {
			System.out.println("A string " +entrada+ " � igual a "+inverte+ " ent�o � um pal�ndromo");
		}else {
			System.out.println("A string " +entrada+ " n�o � igual a "+inverte+ " ent�o n�o � um pal�ndromo");
		}
	}

}
