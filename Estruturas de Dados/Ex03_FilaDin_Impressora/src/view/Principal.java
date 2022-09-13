package view;

import br.edu.fateczl.rafaelgaldino.Fila;
import controller.EscalonadorController;

public class Principal {

	public static void main(String[] args) {
		EscalonadorController escalonador = new EscalonadorController();
		Fila filaProcessos = new Fila();
		String processos[] = {"notepad.exe;14",  "write.exe;35",  "chrome.exe;27",  "acrobat.exe;52","firefox.exe;18","word.exe;25"};
		
		for (String processo : processos) {
			filaProcessos.insert(processo);
		}

		escalonador.escalonar(filaProcessos);
	}

}
