package controller;

public class MultiploController {
	
	public MultiploController(){
		super();
	}
	
	public void mostraMultiplo(int a, int b) {
		
		
		if(verificaMultiplo(a, b)) {
			System.out.println(maior(a, b) + " é múltiplo de " + menor(a, b));
		} else {
			System.out.println(maior(a, b) + " não é múltiplo de " + menor(a, b));
		}
		
		
	}
	
	private boolean verificaMultiplo(int a, int b) {
		int maior = maior(a, b);
		int menor = menor(a, b);
		
		if(maior % menor == 0) {
			return true;
		}else {
			return false;
		}
	}

	private int menor(int a, int b) {
		int menor = 0;
		
		if(a > b) {
			menor = b;
		} else {
			menor = a;
		}
		
		return menor;
	}

	private int maior(int a, int b) {
		int maior = 0;
		
		if(a < b) {
			maior = b;
		} else {
			maior = a;
		}
		return maior;
	}

}
