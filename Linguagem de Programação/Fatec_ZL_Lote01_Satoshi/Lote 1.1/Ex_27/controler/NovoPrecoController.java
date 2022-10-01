package controler;

public class NovoPrecoController {
	public NovoPrecoController() {
		super();
	}
	
	public void newPrice(double pA, double mM) {
		double novoPreco = 0;
		
		if(pA < 30 && mM < 500) {
			novoPreco = pA * 1.10;
		}
		else if(pA >= 30 && pA < 80 && mM >= 500 && mM < 1000) {
			novoPreco = pA * 1.15;
		} 
		else if(pA >= 80 && mM >= 1000) {
			novoPreco = pA * 0.95;
		} else {
			novoPreco = pA;
		}
		
		System.out.println("Preço anterior >>> R$ " + pA);
		System.out.println("Preço atual >>> R$ " + novoPreco);
	}

}
