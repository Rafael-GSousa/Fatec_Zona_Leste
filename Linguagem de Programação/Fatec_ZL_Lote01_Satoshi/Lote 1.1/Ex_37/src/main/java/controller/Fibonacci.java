package controller;

public class Fibonacci {
    public Fibonacci(){
        super();
    }

    public void fibo(int n){
        int fiboAtual = 0;
        int fiboAnterior = 0;

        for(int i = 1; i <= n; i++){
            System.out.print(fiboAtual + " ");
            if(i == 1){
                fiboAtual = 1;
                fiboAnterior = 0;
            }else{
                fiboAtual += fiboAnterior;
                fiboAnterior = fiboAtual - fiboAnterior;
            }

        }
    }
}
