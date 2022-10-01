package controller;

public class OrdemController {
	
	public OrdemController() {
		super();
	}
	
	public void ordem(int a, int b) {
		
		if(a > b) {
			System.out.println("Ordem normal >>> " + a + ", " + b + "\nOrdem crescente >>> "
		+ b + ", " + a + ".");
		} else {
			System.out.println("Ordem crescente >>> " + a + ", " + b + ".");
		}
	}

}
