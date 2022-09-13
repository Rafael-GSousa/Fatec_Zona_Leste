package view;
import controller.ThreadCorrida;

public class Main {
	
	public static void main(String[] args) {

        for (int op = 0; op < 5; op++) {
			Thread threadCorrida = new ThreadCorrida(100, 5, op);
			threadCorrida.start();
		}
    }

}