package controller;

public class Media {
    public Media() {
        super();
    }
    public void geraVetor(double[] v) {
        for (int i = 0; i < 30; i++) {
            v[i] =  ((Math.random() * 50) + 1);
        }
    }
    private double media(double soma) {

        return  soma / 30;
    }
    private int acima(double media, double[] v) {
        int cont = 0;
        for (int i = 0; i < 30; i++) {
            if (v[i] > media) {
                cont++;
            }
        }
        return cont;
    }
    public void mostra(double[] v){
        StringBuilder buffer = new StringBuilder();

        double soma = 0;

        buffer.append("Vetor de 30 posições (números reais) ==> \n");
        for(int i = 0; i < 30; i++){
            buffer.append("[").append(i).append("] = ").append(v[i]).append("\n");
            soma = soma + v[i];
        }

        buffer.append("\nSoma ==> ").append(soma).append("\n\n");

        buffer.append("\nMédia ==> ").append(media(soma)).append("\n\n");

        buffer.append("\nQuantidade acima da média ==> ").append(acima(media(soma), v)).append("\n\n");

        buffer.append("Posições abaixo da media ==> \n");
        for(int i = 0; i < 30; i++){
            if(v[i] < media(soma)){
                buffer.append("[").append(i).append("] = ").append(v[i]).append("\n");
            }
        }

        System.out.println(buffer);

    }
}
