package controller;

public class LitrosController {
	
	public LitrosController() {
		super();
	}
	
	public double calcLitros(double tPerc, double vMedia) {
		double litros = 0;
		
		if(tPerc <= 0 || vMedia <0) {
			return 0;
		}
		else {
		litros = (tPerc * vMedia) / 12;
		}
		
		return litros;
	}

}
