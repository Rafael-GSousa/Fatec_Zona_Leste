package view;

import java.util.Scanner;

import controller.MaiorController;

public class Main_Ex19 {

	public static void main(String[] args) {
		
		MaiorController mCont = new MaiorController();
		
		Scanner input = new Scanner(System.in);
		
		double valor1 = 0, valor2 = 0;
		
		for (int i = 0; i < 1; i ++) {
			valor1 = input.nextDouble();
			valor2 = input.nextDouble();
		}
		
		input.close();
		
		mCont.maiorReais(valor1, valor2);
		

	}

}
