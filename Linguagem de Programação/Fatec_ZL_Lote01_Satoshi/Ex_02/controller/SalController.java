package controller;

public class SalController {

	public SalController() {
		super();
	}
	
	public double calcSal(double sal) {
		double res = 0;
		
		if(sal <=0) {
			return 0;
		} else {
			res = (sal * 0.15) + sal;
		}
		
		return res;
	}

}
