package controller;

public class Graos {
    public Graos(){
        super();
    }

    public void calc(int casa){
        int pot = 0;
        long graos = 0;
        for(int i = 1; i <= casa; i++){
            graos = (long) Math.pow(2, pot);
            pot++;
        }
        System.out.print(graos + " na casa 64.");


    }
}
