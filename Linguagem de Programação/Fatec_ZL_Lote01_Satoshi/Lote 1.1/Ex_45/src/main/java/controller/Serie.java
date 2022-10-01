package controller;


public class Serie {
    public Serie(){
        super();
    }

    public void sr(){
        int dividendoA = 1, divisorA = 1, dividendoB = 1, divisorB = 1;
        double sr = 1;
        System.out.print("Série ==> ");
        for (int i = 1; i <= 15; i++) {
            System.out.print(dividendoA + "/" + divisorA + " ");
            dividendoA++;
            divisorA = (int) Math.pow(dividendoA, 2);
        }

        System.out.print("\nResultado da série ==> ");
        while (dividendoB < 15) {
            if(dividendoB % 2 == 0){
                dividendoB = (-(dividendoB)) + 1;
            }else{
                dividendoB = (-(dividendoB)) - 1;
            }
            divisorB = (int) Math.pow(dividendoB, 2);
            sr = sr + ((double)dividendoB / divisorB);
            System.out.print(sr + " ");
        }

    }
}
