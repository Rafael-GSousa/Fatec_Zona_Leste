package controller;

public class TemperaturaController {
	
	public TemperaturaController() {
		super();
	}
	
	public double calcTemp(double celsius) {
		double fah = 0;
		
		if(celsius <= 0) {
			return 0;
		} else {
			fah = (9 * celsius + 160) / 5;
		}
		
		return fah;
	}

}
