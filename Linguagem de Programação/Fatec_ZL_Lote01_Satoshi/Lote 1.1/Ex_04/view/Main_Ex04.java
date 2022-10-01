package view;

import javax.swing.JOptionPane;

import controller.TemperaturaController;

public class Main_Ex04 {

	public static void main(String[] args) {
		TemperaturaController tempCont = new TemperaturaController();
		
		String inputCelsius = JOptionPane.showInputDialog(null, "Digite a temperatura em Celsius °C");
		double entradaCelsius = Double.parseDouble(inputCelsius);
		
		double tempFah = tempCont.calcTemp(entradaCelsius);
		
		System.out.println("Temperatura em Celsius (°C) = " + entradaCelsius + "\n"
		+ "Temperatura em Fahrenheit (F) = " + tempFah);

	}

}
