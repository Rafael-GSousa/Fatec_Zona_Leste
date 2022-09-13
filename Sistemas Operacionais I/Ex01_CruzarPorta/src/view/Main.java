  
package view;

import controller.CorredorController;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaforo=new Semaphore(1);
        for (int idPessoa=1;idPessoa<5;idPessoa++){
            Thread t=new CorredorController(idPessoa,semaforo);
            t.start();
        }
    }
}