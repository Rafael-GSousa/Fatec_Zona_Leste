package controller;

import java.util.concurrent.Semaphore;

public class Compra extends Thread{
    private int maxIngresso = 4;
    private int minIngresso = 1;
    private static int ingressos = 100;
    private int idThread;
    private Semaphore semaforo;


    public Compra(int idThread, Semaphore semaforo) {
        this.idThread = idThread;
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        Login();
        compraBilhete();
        try {
            semaforo.acquire();
            validacao();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaforo.release();
        }

    }

    private void Login() {
        double tempoLog = ((Math.random()*1951)+50);
        if(tempoLog>1){
            System.err.println("Timeout para a pessoa #" + this.idThread + "! Login não realizado!\n");
        }else{
            System.out.println("A pessoa #"+this.idThread+" efetuou o login! \n");
            compraBilhete();
        }

    }

    private void compraBilhete() {
        int timeBuy = (int) ((Math.random() * 1001) + 2001);
        if(timeBuy>=2500){
            System.err.println("A pessoa " + this.idThread + " ultrapassou o tempo de sessão! Compra não realizada! \n");
        }else{
            try {
            sleep(timeBuy);
            }catch (Exception e){
                e.getStackTrace();
            }
        }
    }
    @SuppressWarnings("static-access")
	private void validacao() {
        try {
            semaforo.acquire();
            int buy = (int) ((Math.random() * this.maxIngresso) + this.minIngresso);
            if (ingressos > 0 && buy <= ingressos) {

                this.ingressos -= buy;
                System.out.println("A pessoa " + this.idThread + " comprou " +this.ingressos+ "\n");
                System.out.println("Há " + this.ingressos + " ingressos restantes \n");
            } else {
                System.err.println("Ingressos esgotados para a Thread #" + this.idThread + " \n");
            }
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            semaforo.release();
        }
    }
}