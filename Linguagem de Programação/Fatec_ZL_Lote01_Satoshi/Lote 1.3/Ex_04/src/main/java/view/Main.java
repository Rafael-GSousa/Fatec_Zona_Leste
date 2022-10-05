package view;

import controller.Media;

public class Main {
    public static void main(String[] args) {
        Media media = new Media();

        double[] v = new double[30];

        media.geraVetor(v);
        media.mostra(v);
    }
}
