package controller;

public class AreaQuadradoController {
	
	public AreaQuadradoController() {
		super();
	}
	
	public double calcArea(double valor) {
		double res = 0;
		
		//condição de parada
		if(valor <= 0) {
			return 0;
		//chamada recursiva
		}else {
		res = Math.pow(valor, 2);
		}
		
		return res;
	}

}
