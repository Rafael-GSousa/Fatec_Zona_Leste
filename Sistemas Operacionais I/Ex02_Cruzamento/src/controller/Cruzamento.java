  
package controller;

import java.util.concurrent.Semaphore;

public class Cruzamento extends Thread{

	private int idCarro;
	private Semaphore semaforo;
	private String sentido;
	private static int opc;
	
	
	public Cruzamento(int idCarro , Semaphore semaforo ) {
		this.idCarro = idCarro;
		this.semaforo = semaforo;
				
	}
	
	@Override
	public void run() {
		try {
			semaforo.acquire();
			cruzamento();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			semaforo.release();
		}
	}
	
	private void cruzamento() {
		int distanciaTotal = 15;
		int distanciaPercorrida = 0;
		int deslocamento = 3;
		int tempo = 1000;
		
		opc++;
		
		switch (opc) {
		case 1:
			sentido = "Leste ao Oeste";
			break;
			
		case 2:
			sentido = "Sul ao Norte";
			break;
			
		case 3:
			sentido = "Oeste ao Leste";
			break;
			
		case 4:
			sentido = "Norte ao Sul";
			break;
		}
		
		System.out.println("O Carro " + idCarro + " está cruzando pelo sentido " + sentido);
		
		while (distanciaPercorrida < distanciaTotal) {
			distanciaPercorrida += deslocamento;
			try {
				sleep(tempo);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
        System.out.println("O Carro " + idCarro + " atravessou o cruzamento no sentido " + sentido);
		
		if(opc == 4) {
			opc=0;
		}
	}

}