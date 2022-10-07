package controller;

import java.util.Arrays;

public class Vet20 {
    public Vet20(){
        super();
    }

    public void vet20(int[] vet){
        System.out.print("Vetor normal ==> ");
        for(int i = 0; i < vet.length; i++){
            vet[i] = (int)((Math.random() * 20) + 1);
            System.out.print(vet[i] + " ");
        }

        Arrays.sort(vet);

        System.out.print("\nVetor ordenado ==> ");

        for (int j : vet) {
            System.out.print(j + " ");
        }


    }
}

