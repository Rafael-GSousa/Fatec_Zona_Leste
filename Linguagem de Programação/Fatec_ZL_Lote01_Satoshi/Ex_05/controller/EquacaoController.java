package controller;

public class EquacaoController {
	
	public EquacaoController() {
		super();
	}
	
	
	private double delta(double a, double b, double c) {
		
		double delta = Math.pow(b, 2) - 4 * a * c;	
		
		return delta;
	}
	
	public double raiz1(double a, double b, double c) {
		
		double raiz1;
		
		if(delta(a, b, c) <= 0) {
			return 0;
		}else {
			raiz1 = ((-b) + Math.sqrt(delta(a, b, c))) / (2 * a);			
		}
		
		return raiz1;
		
	}
	
	public double raiz2(double a, double b, double c) {
		
		double raiz2;
		
		if(delta(a, b, c) <= 0) {
			return 0;
		}else {
			raiz2 = ((-b) - Math.sqrt(delta(a, b, c))) / (2 * a);			
		}
		
		return raiz2;
		
	}


}
