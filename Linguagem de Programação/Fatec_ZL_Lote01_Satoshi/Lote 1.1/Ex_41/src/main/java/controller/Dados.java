package controller;

public class Dados {
    public Dados(){
        super();
    }

    public void dado(int d1, int d2){
        System.out.println("D1 + D2 = 7");
        for(int i = 1; i <= d1; i++){
            for(int j = 1; j <= d2; j++){
                if((i + j) == 7 || (j + i) == 7){
                    System.out.println(i + " + " + j + " = " + (i + j));
                }
            }
        }
    }
}
