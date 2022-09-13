package controller;
import java.util.Random;

public class ThreadCorrida extends Thread{

	private 
    int tamanhoMax;
    int distanciaMax;
    int idSapo;
    Random random = new Random();
    static int posicao = 1;
    
	
	public ThreadCorrida(int distanciaMax, int tamanhoMax, int idSapo) {
        this.tamanhoMax = tamanhoMax;
        this.distanciaMax = distanciaMax;
        this.idSapo = idSapo;

	}

	public void run() {
        corridaSapo();
	}

    private void corridaSapo(){

        int distancia = 0;
        int pulo;
        
        while(distancia < distanciaMax){
            pulo = random.nextInt(tamanhoMax + 1);
            distancia += pulo;
            System.out.println(" O Sapo " + idSapo + " pulou: " + pulo + " metros e faltam: " + (distanciaMax - distancia) + " metros \n");
        }
        System.out.println("============== O Sapo "+ idSapo + " chegou na " + posicao + "º posição. =================== \n");
        posicao++;
    }
    
}