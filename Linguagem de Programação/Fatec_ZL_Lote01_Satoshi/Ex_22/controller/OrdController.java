package controller;

public class OrdController {

	public OrdController() {
		super();
	}

	public void ordem(double a, double b, double c, double d) {
		
		StringBuffer buffer = new StringBuffer();
		 buffer.append("Ordem digitada >>> "); 
		 buffer.append(a + ", " + b + ", " + c + ", " + d); 
		 buffer.append("\n"); 
		 buffer.append("Ordem crescente >>> ");

		
		if(d < a) {
			
			 buffer.append(d + ", " + a + ", " + b + ", " + c); 

		}
		else if (d < b) {
 			
			 buffer.append(a + ", " + d + ", " + b + ", " + c);
 		
		}
		else if (d < c) {
 			
			 buffer.append(a + ", " + b + ", " + d + ", " + c);
		
		}
		else {
 			
			 buffer.append(a + ", " + b + ", " + c + ", " + d);
		}
		
		 System.out.println(buffer);
	}

}
