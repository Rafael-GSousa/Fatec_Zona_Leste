package controller;

public class SerieFatorial {
	public SerieFatorial() {
		super();
	}

	public void serieFat(int num) {
		double sr = 1;
		double serie;
		
		StringBuffer buffer = new StringBuffer();

		while(num > 0) {
			serie = 1 / fatorial(num);
			sr = sr + 1 / fatorial(num);
			
			buffer.append("1 / ");
			buffer.append(num);
			buffer.append("! = ");
			buffer.append(serie);
			buffer.append("\n");
			buffer.append("+\n");
			
			num--;

		}
		
		System.out.println("Resultado da série \n" + buffer + "Resultado = " + sr);
	}
	
	private double fatorial(int num) {
		int fat = 1;
		
		for(int i = 1; i <= num; i++) {
			fat = fat * i;
		}
		
		return fat;
		
	}
}
