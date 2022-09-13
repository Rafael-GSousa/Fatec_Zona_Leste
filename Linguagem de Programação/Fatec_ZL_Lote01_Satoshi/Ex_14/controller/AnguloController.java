package controller;

public class AnguloController {
	
	public AnguloController() {
		super();
	}

	public double anguloT(double a1, double a2) {
		double a3 = 0;
		
		a3 = (180 -(a1 + a2));
		
		return a3;
	}

}
