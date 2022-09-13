  
package view;

import controller.Compra;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        final int permissao = 1;
        Semaphore semaforo = new Semaphore(permissao);

        for (int idThread = 0; idThread < 299; idThread++) {
            Thread t = new Compra(idThread, semaforo);
            t.start();
        }

    }

}
