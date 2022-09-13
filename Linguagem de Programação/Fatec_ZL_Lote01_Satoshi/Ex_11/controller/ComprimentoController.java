package controller;

public class ComprimentoController {
	
	public ComprimentoController() {
		super();
	}
	
	public double compCirc(double r) {
		double comprimento = 0;
		
		if(r == 0) {
			return 0;
		}
		else {
		comprimento = (2 * 3.14 * r);
		}
		
		return comprimento;
	}

}
