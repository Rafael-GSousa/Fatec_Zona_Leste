package controller;

public class Potencia {
    public Potencia(){
        super();
    }

    private long potencia(int base, int expoente){

        return (long) Math.pow(base, expoente);
    }

    public long mostraPotencia(int base, int expoente){
        long res = potencia(base, expoente);
        return res;
    }
}
