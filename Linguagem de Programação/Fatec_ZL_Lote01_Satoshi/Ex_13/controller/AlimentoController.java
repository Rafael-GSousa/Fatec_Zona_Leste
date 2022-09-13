package controller;

public class AlimentoController {
	
	public AlimentoController() {
		super();
	}
	
	public int qtdDias(double alimento) {
		int dias;
		
		dias = (int)(alimento * 1000) / 50;
		
		return dias;
	}

}
