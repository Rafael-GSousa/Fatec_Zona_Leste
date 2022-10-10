package controller;

public class Matriz {
    public Matriz(){
        super();
    }

    public void matriz(int[][] mat){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                mat[i][j] = (int) ((Math.random() * 10) + 1);
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 0){
                    System.out.println("|" + mat[0][0] + "      |");
                }
                if(i == 1 && j == 1){
                    mat[1][1] = mat[0][0] * 4;
                    System.out.println("|  " + mat[1][1] + "    |");
                }
                if(i == 2 && j == 2){
                    mat[2][2] = mat[1][1] * 4;
                    System.out.println("|    " + mat[2][2] + "  |");
                }
                if(i == 3 && j == 3){
                    mat[3][3] = mat[2][2] * 4;
                    System.out.println("|      " + mat[3][3] + "|");
                }
            }
        }
    }
}
