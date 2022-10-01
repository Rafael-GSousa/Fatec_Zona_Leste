package controller;

public class QuadradoController {
	
	public QuadradoController() {
		super();
	}
	
	public void quadrado(int a, int b) {
		int res = 0;
		for(int i = a; i <= b; i ++) {
			res = (int) Math.pow(i, 2);
			System.out.println(i + "² = " + res);
		}
	}

}
