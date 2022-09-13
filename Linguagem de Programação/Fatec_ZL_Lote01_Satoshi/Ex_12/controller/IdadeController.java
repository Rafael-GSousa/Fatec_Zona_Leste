package controller;

public class IdadeController {

	public IdadeController() {
		super();
	}
	
	public int calcIdade(int anoN, int anoA) {
		int idadeA;
		int idadeF;
		
		if(anoN <= 0 || anoA <= 0) {
			return 0;
		}
		else {
			idadeA = anoA - anoN;
		
			idadeF = idadeA + 17;
		}
		
		return idadeF;
	}
}
