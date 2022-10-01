package view;

import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller cont = new Controller();

        int num = 0, menor = 100, maior = 0;

        cont.mostra(num, menor, maior);
    }
}
