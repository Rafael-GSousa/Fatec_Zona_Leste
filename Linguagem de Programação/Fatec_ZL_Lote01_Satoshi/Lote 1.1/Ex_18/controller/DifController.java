package controller;

public class DifController {
	
	public DifController() {
		super();
	}
	
	public int difMaior(int a, int b) {
		int dif = 0;
		int maior = validaMaior(a, b);
		int menor = validaMenor(a, b);
		
		if(a == b) {
			return 0;
		} else {
			dif = maior - menor;
		}
		
		return dif;
	}

	
	public int validaMaior(int a, int b) {
		int maior = 0;
		
		if(a > b) {
			maior = a;
		} else {
			maior = b;
		}
		
		return maior;
	}
	
	public int validaMenor(int a, int b) {
		int menor = 0;
		
		if(a < b) {
			menor = a;
		} else {
			menor = b;
		}
		
		return menor;
	}
}
