package controller;

public class DivisivelController {
	
	public DivisivelController() {
		super();
	}
	
	public boolean divisivelDois(int num) {
		if(num % 2 == 0) {
			return true; 
		} else {
			return false;
		}
	}
	
	public boolean divisivelTres(int num) {
		if(num % 3 == 0) {
			return true; 
		} else {
			return false;
		}
	}

}
