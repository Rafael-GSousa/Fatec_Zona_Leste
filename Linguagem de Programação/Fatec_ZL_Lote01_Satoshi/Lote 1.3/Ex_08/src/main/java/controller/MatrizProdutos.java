package controller;

public class MatrizProdutos {
    public MatrizProdutos(){
        super();
    }

    public void mat(int[][] mat){
        int cont = 1;
        int prod1 = 0, prod2 = 0, prod3 = 0;
        int qtdSemana1 = 0, qtdSemana2 = 0, qtdSemana3 = 0, qtdSemana4 = 0;
        int totalMes = 0;

        System.out.println("=== Matriz Inicial ===");
        for(int i = 0; i < 4; i++){
            System.out.print(cont + "ª Semana ==> ");
            cont++;
            for(int j = 0; j < 3; j++){
                mat[i][j] = (int)((Math.random() * 10)+1);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("======================");

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                qtdSemana1 = mat[0][0] + mat[0][1] + mat[0][2];
                qtdSemana2 = mat[1][0] + mat[1][1] + mat[1][2];
                qtdSemana3 = mat[2][0] + mat[2][1] + mat[2][2];
                qtdSemana4 = mat[3][0] + mat[3][1] + mat[3][2];
                totalMes = qtdSemana1 + qtdSemana2 + qtdSemana3 + qtdSemana4;
            }
            prod1 = mat[0][0] + mat[1][0] + mat[2][0] + mat[3][0];
            prod2 = mat[0][1] + mat[1][1] + mat[2][1] + mat[3][1];
            prod3 = mat[0][2] + mat[1][2] + mat[2][2] + mat[3][2];
        }


        System.out.println("=== Cada Produto Vendido no Mês ===");
        System.out.println("Produto 1 ==> " + prod1);
        System.out.println("Produto 2 ==> " + prod2);
        System.out.println("Produto 3 ==> " + prod3);
        System.out.println("============================");
        System.out.println("=== Total de Produtos Vendidos na Semana ===");
        System.out.println("semana 1 ==> "+ qtdSemana1);
        System.out.println("semana 2 ==> "+ qtdSemana2);
        System.out.println("semana 3 ==> "+ qtdSemana3);
        System.out.println("semana 4 ==> "+ qtdSemana4);
        System.out.println("============================");
        System.out.println("Total mês ==> " + totalMes);


    }
}
