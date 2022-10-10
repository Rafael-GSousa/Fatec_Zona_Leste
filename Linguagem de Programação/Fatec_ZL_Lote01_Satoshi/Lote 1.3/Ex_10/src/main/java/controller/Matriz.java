package controller;

public class Matriz {
    public Matriz(){
        super();
    }

    public void matriz(int[][]mat){
        int soma = 0;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 8; j++){
                mat[0][j] = j + 1;
                mat[1][j] = (int) Math.pow(2, j);
                if(i == 1) {
                    soma = soma + mat[i][j];
                }
            }
        }

        StringBuilder buffer = new StringBuilder();
        buffer.append("casa ==> | ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 8; j++){
                buffer.append(mat[i][j]).append(" | ");
            }
            buffer.append("\n");
            if(i == 0) {
                buffer.append("valor ==> | ");
            }
            if(i == 1){
                buffer.append("\nsoma dos valores ==> ").append(soma);
            }
        }
        System.out.println(buffer);
    }
}
