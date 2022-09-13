package controller;

public class FatorialController {
	
	public FatorialController() {
		super();
	}

	public void fatorial(int num) {
		int fat = 1;
		
		for(int i = 1 ; i <= num; i++) {
			fat = fat * i;
			
		}
		System.out.println("Fatorial de " + num + " = " + fat);

	}
}
