package controller;

public class Controller {

	public Controller() {
		super();
		}
		
		public int resultado(int fatSoma) {
/*		 Condi��o de parada =  0 se a entrada for igual
		 ou menor que 0, dever� retornar 0 */
		 if (fatSoma <= 0) {
	      return 0;	
/*		 Caso seja maior que 0, dever� somar
         valor da entrada + (valor da entrada - 1)*/
		 }else {
			 
			 return fatSoma + resultado(fatSoma - 1);
		 }
		 
	}
	}