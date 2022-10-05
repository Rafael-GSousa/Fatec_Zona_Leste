package controler;


public class ConcatenaVetor {
    public ConcatenaVetor(){
        super();
    }

    public void criaVetor(int[] v3, int[] v1, int[] v2){

        //Criando o vetor 1 e o vetor 2  no mesmo for
        for(int i = 0; i < 3; i++){
            v1[i] = (int) ((Math.random() *10) + 1);
            v2[i] = (int) ((Math.random() *10) + 1);
        }
        //Adicionando o vetor 1 ao vetor 3 (índices 0, 1 e 2)
        for (int i = 0; i < 3; i++) {
            v3[i] = v1[i];
        }
        //Adicionando o vetor 2 ao vetor 3 (índices 3, 4 e 5). Somando 3 índices para cada iteração do for
        //para que não haja conflito com o vetor 1.
        for (int i = 0; i < 3; i++) {
            v3[i + 3] = v2[i];
        }
    }
    public void mostraVetor(int[] v3, int[] v1, int[] v2){
        System.out.print("V1 ==> ");
        for(int i = 0; i < 3; i++){
            System.out.print(v1[i] + " ");
        }
        System.out.print("\nV2 ==> ");
        for(int i = 0; i < 3; i++){
            System.out.print(v2[i] + " ");
        }

        System.out.print("\nV3 ==> ");
        for(int i = 0; i < 6; i++){
            System.out.print(v3[i] + " ");
        }
    }
}
