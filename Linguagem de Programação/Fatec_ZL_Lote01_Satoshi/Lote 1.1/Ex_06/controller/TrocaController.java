package controller;

public class TrocaController {
	
	public TrocaController() {
		super();
	}
	
	public void inverteValor(double x, double y) {
		double aux = x;
		
		x = y;
		y = aux;
		
		System.out.println("Invertido >>>> " + x + " " + aux);
		
	}

}
