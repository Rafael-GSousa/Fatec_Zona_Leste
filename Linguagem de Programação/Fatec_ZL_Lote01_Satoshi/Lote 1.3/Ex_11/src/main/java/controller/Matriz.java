package controller;

public class Matriz {
    public Matriz(){
        super();
    }

    public void matriz(int[][]mat){

        for(int i = 0; i < 8; i ++){
            for(int j = 0; j < 8; j++){
                if(i == 0 || i == 7 || j == 0 || j == 7){
                    mat[i][j] = 1;
                }else if(i == 1 || i == 6 || j == 1 || j == 6){
                    mat[i][j] = 2;
                }else if(i == 2 || i == 5 || j == 2 || j == 5){
                    mat[i][j] = 3;
                }
                else{
                    mat[i][j] = 4;
                }
            }
        }

        for (int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}
