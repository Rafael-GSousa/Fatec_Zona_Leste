package view;

import controller.MatrizProdutos;

public class Main {
    public static void main(String[] args) {
        MatrizProdutos matProd = new MatrizProdutos();

        int[][] mat = new int[4][3];
        matProd.mat(mat);
    }
}
