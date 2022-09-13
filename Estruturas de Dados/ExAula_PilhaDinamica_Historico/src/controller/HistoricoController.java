package controller;

import br.edu.fateczl.rafaelgaldino.Pilha;

public class HistoricoController {

	public HistoricoController() {
		super();
	}
	
	public void insereEndereco(Pilha p, String site) {
		boolean valido = validaSite(site);
		if(valido) {
			p.push(site);
		}else {
			System.err.println("Site inválido");
		}
	}
	
	public void removeEndereco(Pilha p) throws Exception{
		if(p.isEmpty()) {
			System.err.println("Não há sites no histórico");
		}else {
			String removido = p.pop();
			System.out.println("Site: " + removido + " removido do histórico");
		}
	}
	
	public void consultaUltimo(Pilha p) throws Exception {
		if(p.isEmpty()) {
			System.err.println("Não há sites no histórico");
		}else {
			String top = p.top();
			System.out.println("Último site visitado: " + top);
		}
	}

	private boolean validaSite(String site) {
		String[] vetSite = site.split("\\.");
		if(vetSite[0].equals("http://www") && vetSite.length >= 3) {
			return true;
		}else {
			return false;
		}
	}
}

