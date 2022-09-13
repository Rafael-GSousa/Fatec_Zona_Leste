package controller;

import br.edu.fateczl.rafaelgaldino.Pilha;

public class PalindromoController {

	public PalindromoController() {
		super();
	}
	
	public String invertePalavra(Pilha p, String string){
		String invertido = "";
			 p.push(string);
			if(!p.isEmpty()) {
				try {
				invertido = p.pop();
				invertido = invertePalavra(p,string.substring(1)) + string.charAt(0);
				}catch(Exception e) {
					System.err.print("");
				}

			}
			
		return invertido;
	}
	
	public boolean comparaPalavras(String normal, String invertida) {
		if(normal.equals(invertida)) {
			return true;
		}else {
			return false;
		}
	}

}
