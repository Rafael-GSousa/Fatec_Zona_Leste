package view;

import java.util.concurrent.Semaphore;

import controller.Cruzamento;

public class Main {

	public static void main(String[] args) {
		
		int permissão = 1;
		Semaphore semaforo = new Semaphore(permissão);
		
		for (int idCarro = 0 ; idCarro < 4 ; idCarro++) {
			Thread tCarro = new Cruzamento(idCarro + 1, semaforo);
			tCarro.start();
		}
	}
}