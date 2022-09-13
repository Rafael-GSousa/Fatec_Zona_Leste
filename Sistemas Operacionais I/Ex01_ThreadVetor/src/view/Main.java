package view;
import controller.ThreadVetor;

public class Main {
	
	public static void main(String[] args) {

        int threadVet[] = new int[1000];
           
        for (int op = 0; op < threadVet.length; op++) {
			threadVet[op] = (int)(Math.random() * 100)+1;
        }

        ThreadVetor nPar = new ThreadVetor(2, threadVet);
        nPar.start();

        ThreadVetor nImpar = new ThreadVetor(1, threadVet);
        nImpar.start();
    }

}