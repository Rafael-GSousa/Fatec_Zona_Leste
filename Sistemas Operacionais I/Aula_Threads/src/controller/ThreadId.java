package controller;

//extends Thread (herdar caracter�sticas de uma thread)
//Par�metros por construtor
//m�todo run() - s� ser� executado o que estiver neste m�todo

public class ThreadId extends Thread {
	
	private int idThread;
	
	public ThreadId(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
//		s� se excuta o que est� aqui dentro
		System.out.println(idThread);
	}
	
	

}
