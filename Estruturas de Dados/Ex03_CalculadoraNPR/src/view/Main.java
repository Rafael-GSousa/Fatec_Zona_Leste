package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.rafaelgaldino.Pilha;
import controller.NPRController;

public class Main {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		NPRController nC = new NPRController();
		int res = 0;
		String s = "";
		
		while(!s.equals("sair")) {
			s = JOptionPane.showInputDialog("Calculadora notação pos-fixa\n"
	          		+ "Exemplo de uso:\n   5 9 + 2 * 6 5 ** \n"
	          		+ "Informe sua expressao:\n");
			if(!s.equals("sair")){
				if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^")) {
					try {
						res = nC.npr(p,s);
						System.out.println(res);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}else {
					int valor = Integer.parseInt(s);
					nC.insereValor(p, valor);
				}
			}
	    

	      }  
	}
}