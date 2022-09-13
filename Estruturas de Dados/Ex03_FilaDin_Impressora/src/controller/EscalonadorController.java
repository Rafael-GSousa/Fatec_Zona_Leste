package controller;

import br.edu.fateczl.rafaelgaldino.Fila;

public class EscalonadorController {

	public EscalonadorController() {
		super();
	}

	public void escalonar(Fila fila) {
		while (!fila.isEmpty()) {
			try {
				String processo = fila.remove();

				String dadosProcesso[] = processo.split(";");

				int qtdProcesso = Integer.parseInt(dadosProcesso[1]);
				qtdProcesso--;

				if (qtdProcesso >= 1) {
					fila.insert(dadosProcesso[0] + ";" + qtdProcesso);
				}
			} catch (Exception error) {
				error.printStackTrace();
			}
		}
	}

}