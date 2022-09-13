package controller;

public class ThreadMatriz extends Thread{

	int [][] threadMatriz;
    int vLinha;

    public ThreadMatriz(int[][] threadMatriz, int vLinha) {
        this.threadMatriz = threadMatriz;
        this.vLinha = vLinha;
    }

    public void run() {
        somaMatriz(threadMatriz, vLinha);
    }

    private void somaMatriz(int[][] threadMatriz, int vLinha){
        int soma = 0;
        for (int op = 0; op < 5; op++) {
            soma = soma + threadMatriz[vLinha][op];
        }
        System.out.println("\n \n O ID: " + getId() + " da soma da linha: " + (vLinha + 1) + " da matriz é: " + soma );
    }
}