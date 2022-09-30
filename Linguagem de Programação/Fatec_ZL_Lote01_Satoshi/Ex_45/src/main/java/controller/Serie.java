package controller;

public class Serie {
    public Serie(){
        super();
    }

    public void sr(){
        int dividendoA = 1, divisorA = 1, dividendoB = 1, divisorB = 1;
        double sr;
        System.out.print("Série ==> ");
        for (int i = 1; i <= 15; i++) {
            System.out.print(dividendoA + "/" + divisorA + " ");
            dividendoA++;
            divisorA = (int) Math.pow(dividendoA, 2);
        }

//        System.out.print("\nResultado da série ==> ");
//        for (int j = 1; j <= 15; j++) {
//            sr = (double)dividendoB / divisorB;
//            System.out.print(sr + " ");
//            dividendoB++;
//            divisorB+=2;
//        }

    }
}
