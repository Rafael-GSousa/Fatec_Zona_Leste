package controller;

//extends Thread (herdar características de uma thread)
//Parâmetros por construtor
//método run() - só será executado o que estiver neste método

public class ThreadId extends Thread {
	
	private int idThread;
	
	public ThreadId(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
//		só se excuta o que está aqui dentro
		System.out.println(idThread);
	}
	
	

}
