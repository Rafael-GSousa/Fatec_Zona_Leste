package controller;

public class Serie {
    public Serie() {
        super();
    }

    public void serie() {
        int dividendoA = 1, divisorA = 1, dividendoB = 1, divisorB = 1;
        double sr;
        System.out.print("Série ==> ");
        for (int i = 1; i <= 50; i++) {
            System.out.print(dividendoA + "/" + divisorA + " ");
            dividendoA++;
            divisorA+=2;
        }

        System.out.print("\nResultado da série ==> ");
        for (int j = 1; j <= 50; j++) {
            sr = (double)dividendoB / divisorB;
            System.out.print(sr + " ");
            dividendoB++;
            divisorB+=2;
        }


    }
}
