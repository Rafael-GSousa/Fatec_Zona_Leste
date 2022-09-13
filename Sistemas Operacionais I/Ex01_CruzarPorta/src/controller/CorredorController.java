package controller;

import java.util.concurrent.Semaphore;

public class CorredorController extends Thread{
    private static int  posChegada;
    private int idPessoa;
    private Semaphore semaforo;

    public CorredorController(int idPessoa , Semaphore semaforo) {
        this.idPessoa = idPessoa;
        this.semaforo = semaforo;
    }


    @Override
    public void run() {
    pessoasCaminhando();
    
//    In�cio da se��o cr�tica 
        try {
            semaforo.acquire();
            cruzarPorta();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaforo.release();
        }
        
//      Fim da se��o cr�tica
    }
    private void pessoasCaminhando() {
        int distanciaTotal = 200;
        int distanciaPercorrida = 0;
        int tempo = (int)((Math.random()*1001)+1000);
        int pessoaAnda = (int)((Math.random()*2000)+4000)/tempo;

        while(distanciaPercorrida < distanciaTotal){
            distanciaPercorrida += pessoaAnda;
            try {
                sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A pessoa #" + this.idPessoa + " j� andou " + distanciaPercorrida + " metros.");

        }
        posChegada++;

    }

    private void cruzarPorta() {
        System.out.println("A pessoa #" + this.idPessoa + " cruzou a porta!");
        System.out.println("A pessoa #" + this.idPessoa + " foi o " + this.posChegada + "� a cruzar a porta!");
    }
}