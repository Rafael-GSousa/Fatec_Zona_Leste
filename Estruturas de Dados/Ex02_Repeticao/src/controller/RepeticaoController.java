package controller;

public class RepeticaoController {
	
	public RepeticaoController() {
		super();
	}
	
	public int repeticao(int val1, int val2) {
		
/*		condi��o de parada, se a primeira entrada for zero,
   		ent�o o retorno � zero */
 
		if(val1 == 0) {
			return 0;
		}
/*		sen�o, a primeira entrada ser� dividida por 10
		e o contador iniciado em zero */ 		
		else {
		int div = val1 / 10;
		int cont = 0;
/*		se o resto da divis�o da primeira entrada for igual
		a segunda entrada, o contador recebe +1*/
		if(val1 % 10 == val2) {
			cont ++;
		}
//		o retorno � o valor acumulado do contador 
		return cont + repeticao(div, val2);
		}
	}
}