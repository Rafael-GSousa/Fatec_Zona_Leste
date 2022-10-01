package controller;

public class Vetor50 {
    public Vetor50(){
        super();
    }
    public void vet50() {
        StringBuilder bufferA = new StringBuilder();
        StringBuilder bufferB = new StringBuilder();
        int[] vector = new int[5];
        int cont = 0;
        double soma = 0, somaImpares = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)((Math.random() * 200) + 1);
            if(validaA(vector[i])){
                soma = soma(soma, vector[i]);
                bufferA.append(vector[i]).append(" ");
                cont++;
            }
            if(validaB(vector[i])){
                bufferB.append(vector[i]).append(" ");
                somaImpares = somaImpares(somaImpares, vector[i]);
            }
        }

        System.out.print("Valores entre 10 e 200 ==> " + bufferA);
        System.out.print("\nSoma dos valores entre 10 e 200 ==> " + soma);
        System.out.print("\nQuantidade de valores entre 10 e 200 ==> " + cont);
        System.out.print("\nMédia dos valores entre 10 e 200 ==> " + (soma / cont));
        System.out.print("\nValores ímpares ==> " + bufferB);
        System.out.print("\nSoma dos valores ímpares ==> " + somaImpares);

    }
    private boolean validaA(int i) {
        return i >= 10 && i <= 200;
    }
    private boolean validaB(int i) {
        return i % 2 == 1;
    }
    private double soma(double soma, int i ) {
        return (soma + i);
    }
    private double somaImpares(double somaImpares, int i ) {
        return (somaImpares + i);
    }

}

