package controller;

public class PoupancaController {
	
	public PoupancaController() {
		super();
	}
	
	public float calcPoup(float deposito) {
		float val = 0;
		
		if(deposito <= 0) {
			return 0;
		} else {
			val = (float)(deposito * 1.013);
		}
		
		return val;
		
	}

}
