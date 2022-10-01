package controller;

public class AreaTrianguloController {
	
	public AreaTrianguloController() {
		super();
	}
	
	public double calcTriangulo(double base, double altura) {
		double res = 0;
		
		if(base == 0 || altura == 0) {
			return 0;
		} else {
			res = (base * altura) / 2;
		}
		return res;
	}

}
