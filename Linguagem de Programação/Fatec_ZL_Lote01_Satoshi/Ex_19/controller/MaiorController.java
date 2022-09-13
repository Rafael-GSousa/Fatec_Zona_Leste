package controller;

public class MaiorController {
	
	public MaiorController() {
		super();
	}
	
	public void maiorReais(double a, double b) {
		
		if(a == b) {
			System.err.println("Os valores devem ser diferentes!");
		}
		else if(a > b) {
			System.out.println("O maior valor entre " + a + " e " + b + " é " + a);
		}else {
			System.out.println("O maior valor entre " + a + " e " + b + " é " + b);
		}
	}

}
