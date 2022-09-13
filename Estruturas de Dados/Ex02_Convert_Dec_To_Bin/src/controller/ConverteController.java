package controller;

import br.edu.fateczl.rafaelgaldino.Pilha;

public class ConverteController {

	public ConverteController() {
		super();
	}
	
	
	public  String decToBin(int dec) {
		Pilha p = new Pilha();
		String binario = "";
		int resto = 0;
		
		while(dec > 0) {
			resto = dec % 2;
			p.push(resto);
			dec = dec / 2;
		}
		
		while(p.isEmpty() == false) {
			try {
				binario = binario + p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return binario;
		
	}

}
