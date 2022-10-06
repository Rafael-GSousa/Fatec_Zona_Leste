package controller;

public class Vet20Soma {
    public Vet20Soma(){
        super();
    }

    public void vet20(int[]vet){
        int soma = 0, ordemInversa = 19;

        //Gerando vetor de posições com 20 numeros aleatórios de 1 a 100, índices em ordem crescente (0 a 19)
        System.out.print("Vetor em ordem crescente ==> ");
        for(int i = 0; i < 20; i++){
            vet[i] = (int)((Math.random()*100)+1);
            System.out.print(vet[i] + " ");
        }

        //Invertendo o vetor, índices em ordem descresente (19 a 0)
        System.out.print("\n\nVetor em ordem decrescente ==> ");
        for(int i = 19; i >= 0; i--){
            System.out.print(vet[i] + " ");
        }

        /*  Fazendo a soma do valor da 1ª posição (em ordem crescente) subtraindo pelo
            valor da 1ª posição (em ordem decrescente)
                Exemplo:
                    Crescente => 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
                    Decrescente => 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
                    Soma => (1 - 10) + (2 - 9) + (3 - 8) + (4 - 7) + (5 - 6) = -25 */
        for(int i = 0; i < 10; i++){
            soma = soma + (vet[i] - vet[ordemInversa]);
            ordemInversa--;
        }

        System.out.println("\n\nSoma dos 10 primeiros com os 10 últimos elementos do vetor ==> " + soma);
    }
}
