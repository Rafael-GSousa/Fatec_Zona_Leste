package controller;

public class HipotenusaController {
	
	public HipotenusaController() {
		super();
	}
	
	public double calcHipo(double c1, double c2) {
		double hipo = 0;
		
		hipo = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
		
		return hipo;
	}

}
