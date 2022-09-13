package view;

import controller.ThreadCalc;

public class Principal {

	public static void main(String[] args) {

		for(int idThread = 0; idThread < 5; idThread++) {
//			ThreadId threadId = new ThreadId(idThread);
//			Thread threadId = new ThreadId(idThread);
//			threadId.start();			
		}
		
		int a = 10;
		int b = 2;
		
		for (int op = 0; op < 4 ; op++) {
			Thread tCalc = new ThreadCalc(a, b, op);
			tCalc.start();
		}
	}

}
