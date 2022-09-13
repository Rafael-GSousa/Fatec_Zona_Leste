package controller;

public class FatorialController {
	
	public FatorialController() {
		super();
	}
	
	public int calcFat(int entrada) {
		
		//condi��o de parada
		//se a entrada for igual a zero, ent�o o retorno ser� 1
		if (entrada == 0) {
			return 1;
		}
		/* Se a entrada for diferente de zero, ent�o o retorno ser�:
		"o valor da entrada multiplicado pela pr�pria entrada menos um,
		 e assim sucessivamente at� que o valor da entrada seja igual a 1."
		Ex.: o fatorial de 5 se dar� da seguinte forma: 
		5 * (5-1) -> 5 * 4 = 20
		20 * (4-1) -> 20 * 3 = 60
		60 * (3-1) -> 60 * 2 = 120
		120 * (2-1) -> 120 * 1 = 120 */
		else {
			return entrada * calcFat(entrada-1) ;
		}
		
	}

}
