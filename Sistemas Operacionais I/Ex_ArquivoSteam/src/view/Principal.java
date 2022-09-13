package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import controller.SteamController;

public class Principal {

	public static void main(String[] args) {
		String path = "C:\\Users\\rafae\\Downloads\\Exercicio_Arquivos_Steam\\SteamCharts.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			SteamController procurarJogos = new SteamController(2019, "June", 389376.72);
			
			while(line != null) {
				if(line.contains("June") && line.contains("2019") && line.contains("389376.72")) {
					System.out.println(procurarJogos.toString());
				}
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		
		
		

	}

}