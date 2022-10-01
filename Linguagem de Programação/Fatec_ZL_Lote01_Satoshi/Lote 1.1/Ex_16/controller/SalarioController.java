package controller;

public class SalarioController {
	
	public SalarioController() {
		super();
	}
	
	public double sFinal(double ht, double vh, double percDesc, int dep) {
		double sb = 0;
		double pDesc = 0;
		double desconto = 0;
		double sl = 0;
		double vDep = 0;
		double sf = 0;
		
		
		sb = salBruto(ht, vh);
		
		pDesc = pDesc(percDesc);
		
		desconto = valDesc(sb, pDesc);
		
		sl = calcLiquido(sb, desconto);
		
		vDep = valorDependentes(dep);
		
		sf = salFinal(sl, vDep);
		
		return sf;
	}
	
	private double salBruto(double ht, double vh) {
		double sBruto = 0;
		
		sBruto = ht * vh;
		
		return sBruto;
	}
	
	private double pDesc(double percDesc) {
		double percentual = 0;
		
		percentual = percDesc / 100;
		
		return percentual;
	}
	
	private double valDesc(double sb, double pDesc) {
		double descValor = 0;
		
		descValor = sb * pDesc;
		
		return descValor;
	}


	private double calcLiquido(double sb, double desconto) {
		double liquido = 0;
		
		liquido = sb - desconto;
		
		return liquido;
	}
	
	private double valorDependentes(int dep) {
		double depValor = 0;
		
		depValor = dep * 100;
		
		return depValor;
	}
	
	private double salFinal(double sl, double vDep) {
		double salarioFinal = 0;
		
		salarioFinal = sl + vDep;
		
		return salarioFinal;
	}


}
