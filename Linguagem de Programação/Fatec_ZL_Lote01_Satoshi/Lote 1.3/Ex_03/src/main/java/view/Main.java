package view;

import controler.ConcatenaVetor;

public class Main {
    public static void main(String[] args) {
        ConcatenaVetor concatVet = new ConcatenaVetor();

        int[] v1 = new int[3];
        int[] v2 = new int[3];
        int[] v3 = new int[6];


        concatVet.criaVetor(v3, v1, v2);
        concatVet.mostraVetor(v3, v1, v2);
    }
}
