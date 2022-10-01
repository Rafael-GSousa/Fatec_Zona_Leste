package controller;

public class SomaQuadradosController {
	
	public SomaQuadradosController() {
		super();
	}
	
	public int somaQuadrados(int a, int b) {
		int res = 0;
		
		if(a == 0 && b == 0) {
			return 0;
		} 
		else {
			res = (int)(Math.pow(a, 2) + Math.pow(b, 2));
		}
		
		return res;
	}

}
