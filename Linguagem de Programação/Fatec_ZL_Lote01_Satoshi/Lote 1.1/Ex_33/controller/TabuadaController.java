package controller;

public class TabuadaController {
	
	public TabuadaController(){
		super();
	}
	
	public void tabuada(int num) {
		
		int tab = 0;
		
		for(int i = 1; i <= 10; i++) {
			tab = num * i;
			
			System.out.println(num + " x " + i + " = " + tab);
		
		}
	}

}
