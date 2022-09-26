package controller;

public class Serie {
    public Serie(){
        super();
    }


    private int fat(int n) {
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }
        return fat;
    }

    public void calc(int n){

//        StringBuffer buffer0 = new StringBuffer();
//        StringBuffer buffer1 = new StringBuffer();
//        StringBuffer buffer2 = new StringBuffer();

        double sr;
        double serie;
        double soma = 1;

//        buffer0.append("N ==> ");
//        buffer1.append("1 / N! ==> ");
//        buffer2.append("Soma da série 1 + 1/1! + 1/2! + ... + 1/N! ==> 1");

        for(int i = 1; i <= n; i++){
            serie = fat(i);
            sr = 1 / serie;
            soma = soma + sr;
//            buffer0.append(i + "  ");
//            buffer1.append("1 / ");
//            buffer1.append(serie);
//            buffer1.append(" = ");
//            buffer1.append(sr);
//            buffer1.append("  ");
//
//            buffer2.append(" + " + sr);

        }
//        System.out.println(buffer0);
//        System.out.println(buffer1);
//        buffer2.append(" = " + soma);
//        System.out.println(buffer2);
        System.out.println("N ==> " + n + "\nResultado da série 1 + 1 / 1! + 1 / 2! + ... + 1 / N!  ==> " + soma);

    }
}
