package controller;

public class MediaController {
	
	public MediaController() {
		super();
	}
	
	public String retornoMencao(double n1, double n2, double n3, double n4) {
		String mencao = "";
		double media = calcNota(n1, n2, n3, n4);
		
		if(media >= 6.0) {
			mencao = "APROVADO";
		}
		else if(media >= 3.0 && media < 6.0) {
			mencao = "EXAME";
		}else {
			mencao = "RETIDO";
		}
		
		return mencao;
	}
	
	
	public double calcNota(double n1, double n2, double n3, double n4) {
		double media = 0;
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		return media;
	}

}
