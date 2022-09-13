package view;

import java.util.concurrent.Semaphore;
import controller.ThreadFormula1;

public class Main {

	public static String[] textoVoltas = { "Escuderia 1 | Carro 1 | Melhor volta: ",
			"Escuderia 1 | Carro 2 | Melhor volta: ", "Escuderia 2 | Carro 1 | Melhor volta: ",
			"Escuderia 2 | Carro 2 | Melhor volta: ", "Escuderia 3 | Carro 1 | Melhor volta: ",
			"Escuderia 3 | Carro 2 | Melhor volta: ", "Escuderia 4 | Carro 1 | Melhor volta: ",
			"Escuderia 4 | Carro 2 | Melhor volta: ", "Escuderia 5 | Carro 1 | Melhor volta: ",
			"Escuderia 5 | Carro 2 | Melhor volta: ", "Escuderia 6 | Carro 1 | Melhor volta: ",
			"Escuderia 6 | Carro 2 | Melhor volta: ", "Escuderia 7 | Carro 1 | Melhor volta: ",
			"Escuderia 7 | Carro 2 | Melhor volta: " };
	public static int[] valorVoltas = new int[14];

	public static void main(String[] args) {
		int largadaCarros = 5;
		int carrosEscuderia = 1;
		Semaphore semaforoLargada = new Semaphore(largadaCarros);
		Semaphore semaforoEscuderia = new Semaphore(carrosEscuderia);

		for (int idEscuderia = 1; idEscuderia < 8; idEscuderia++) {
			Thread escuderia = new ThreadFormula1(idEscuderia, semaforoLargada, semaforoEscuderia);
			escuderia.start();
		}

	}

}