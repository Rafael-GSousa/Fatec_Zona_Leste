package controller;

public class InverteString {
	
	public InverteString() {
		super();
	}
	
	public String inverteString(String entrada) {
		
		//condição de parada
		/*se a entrada tiver apenas um caracter, então o retorno
		 será a própria entrada */
		
		if (entrada.length() == 1){
			return entrada;
		}
		/* Se a entrada tiver mais de um caracter, então a cadeia de caracteres
		  será transformada em uma nova string e em seguida ordenada a partir 
		  do último caracter*/
		else {
			return inverteString(entrada.substring(1)) + entrada.charAt(0);
		}
		
	}

}
