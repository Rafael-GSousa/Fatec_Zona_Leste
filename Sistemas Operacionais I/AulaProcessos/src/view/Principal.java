package view;

import controller.ProcessosController;

public class Principal {

	public static void main(String[] args) {
		
		ProcessosController procController = new ProcessosController();
//		String os = procController.os();		
//		System.out.println(os);
		
//		String process = "C:\\Windows\\write.exe";
//		procController.callProcess(process);
		
//		String process = "TASKLIST /FO TABLE";
//		procController.readProcess(process);
		
		String param = "6084";
		procController.killProcess(param);
		
	}

}
