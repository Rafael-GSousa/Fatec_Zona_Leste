package controller;

public class InverteString {
	
	public InverteString() {
		super();
	}
	
	public String inverteString(String entrada) {
		
		//condi��o de parada
		/*se a entrada tiver apenas um caracter, ent�o o retorno
		 ser� a pr�pria entrada */
		
		if (entrada.length() == 1){
			return entrada;
		}
		/* Se a entrada tiver mais de um caracter, ent�o a cadeia de caracteres
		  ser� transformada em uma nova string e em seguida ordenada a partir 
		  do �ltimo caracter*/
		else {
			return inverteString(entrada.substring(1)) + entrada.charAt(0);
		}
		
	}

}
