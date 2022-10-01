package controller;

public class Controller {
    public Controller(){
        super();
    }

    private int maior(int num, int maior){
        if(num > maior){
            return num;
        }else {
            return maior;
        }
    }

    private int menor(int num, int menor){
        if(num < menor){
            return num;
        }else {
            return menor;
        }
    }

    public void mostra(int num, int menor, int maior) {
        System.out.print("Números ==> ");
        for (int i = 1; i <= 10; i++){
            num = (int) ((Math.random() * 100) + 1);
            System.out.print(num + " ");
                maior = maior(num,maior);
                menor = menor(num,menor);
        }
        System.out.println("\nMaior ==> "+ maior);
        System.out.println("Menor ==> " + menor);
    }
}

