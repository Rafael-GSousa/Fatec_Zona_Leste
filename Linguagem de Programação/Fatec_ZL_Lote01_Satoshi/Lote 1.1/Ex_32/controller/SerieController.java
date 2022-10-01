package controller;

public class SerieController {
	
	public SerieController() {
		super();
	}
	
	public void serie(double num) {
		double sr = 0, serie;
		
		StringBuffer buffer = new StringBuffer();
		
		while(num > 0) {
			serie = 1 / num;
			sr = sr + 1 / num;
			buffer.append("1 / ");
			buffer.append(num);
			buffer.append(" = ");
			buffer.append(serie);
			buffer.append("\n");
			buffer.append("+\n");
			num--;
		}
		
		System.out.println("Resultado da série \n" + buffer + "Resultado = " + sr);
	}

}
