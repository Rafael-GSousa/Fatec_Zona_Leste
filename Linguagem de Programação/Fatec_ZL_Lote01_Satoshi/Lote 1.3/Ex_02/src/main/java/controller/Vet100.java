package controller;

public class Vet100 {
    public Vet100() {
        super();
    }
    public void mostra() {
        int[] vector = new int[100];
        int maior, menor,soma = 0, i;
        double media;


// Entrada dos elementos no vetor
        for(i = 0; i < vector.length;i++) {
            vector[i] = (int) ((Math.random() * 100) + 1);
            System.out.print("v[" + i + "]" + " = " + vector[i] + " ");
        }

// Inicializando as variáveis maior e menor com a 1ª posição do vetor
        maior = vector[0];
        menor = vector[0];

// Definindo o maior e o menor valor valor e realizando a soma dos elementos do vetor
        for(i = 0; i < vector.length; i++){

            if(vector[i] > maior){
                maior = vector[i];
            }

            if(vector[i] < menor){
                menor = vector[i];
            }

            soma = soma + vector[i];

        }

// Calculando a média dos valores do vetor
        media = (double) soma / vector.length;

        System.out.print("\nMaior ==> " + maior);
        System.out.print("\nMenor ==> " + menor);
        System.out.print("\nSoma dos elementos ==> " + soma);
        System.out.print("\nMédia ==> " + media);
    }

}
