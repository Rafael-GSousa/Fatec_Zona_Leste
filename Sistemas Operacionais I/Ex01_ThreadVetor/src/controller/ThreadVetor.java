  
package controller;

public class ThreadVetor extends Thread {

	private int threadVet[];
    private int n;
	
	public ThreadVetor(int n, int threadVet[]) {
        this.threadVet = threadVet;
        this.n = n;
	}

	public void run() {
        tVetor();
	}

    private void tVetor(){
        if (n % 2 == 0){
			double tempoInicial = System.nanoTime();
            for (int op = 0; op < threadVet.length; op ++){
                threadVet[op] = threadVet[op];
            }
            double tempoFinal = System.nanoTime();
            double tempoTotal = tempoFinal - tempoInicial;
            tempoTotal = tempoTotal / Math.pow(10, 9);
            System.out.println("O tempo do número " + n + " Par é: " + tempoTotal);
        }else{
            double tempoInicial = System.nanoTime();
            for (int op : threadVet){
                threadVet[op] = threadVet[op];
            }
            double tempoFinal = System.nanoTime();
            double tempoTotal = tempoFinal - tempoInicial;
            tempoTotal = tempoTotal / Math.pow(10, 9);
            System.out.println("O tempo do número " + n + " Impar é: " + tempoTotal);
        }
    }
}