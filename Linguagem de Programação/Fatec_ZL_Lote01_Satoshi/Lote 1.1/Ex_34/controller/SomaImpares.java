package controller;

public class SomaImpares {
	
	public SomaImpares() {
		super();
	}
	
	public void somaImpares(int num1, int num2) {
		int maior = maior(num1, num2);
		int menor = menor(num1, num2);
		int cont = 0;
		
		for(int i = menor; i <= maior; i++) {
			if(i % 2 == 1) {
				cont = cont + i;
				System.out.println(i);
			}
		}
		
		System.out.println("Resultado da soma dos números ímpares entre " + maior + " e " + menor + " = " + cont);
	}

	private int menor(int num1, int num2) {
		
		if(num1 < num2) {
			return num1;
		}else {
			return num2;
		}
	}

	private int maior(int num1, int num2) {
		
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
}
