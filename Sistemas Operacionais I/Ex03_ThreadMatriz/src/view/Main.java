package view;
import java.util.Random;

import controller.ThreadMatriz;

public class Main {
	
public static void main(String[] args) {
        
		Random random = new Random();

        int[][] threadMatriz = new int[3][5];
        System.out.println("MATRIZ: \n ");
        for (int op = 0; op < 3; op++) {
            for (int col = 0; col < 5; col++) {
				threadMatriz[op][col] = random.nextInt(100);
				System.out.print(threadMatriz[op][col] + "\t");
            }
        }
        System.out.println("\n\n--------------------------------------------------------------------------------------------------");
        System.out.println("\n RESULTADO: ");
        
        for (int op = 0; op < 3; op++) {
            Thread somaMatriz = new ThreadMatriz(threadMatriz, op);
            somaMatriz.start();
        }
    }

}