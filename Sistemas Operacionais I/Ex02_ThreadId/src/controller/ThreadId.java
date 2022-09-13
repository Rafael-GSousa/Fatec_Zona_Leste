package controller;

public class ThreadId extends Thread {
	  private long id;
		
		public ThreadId() {
	        this.id = id;
		}

		public void run() {
	        threadId();
		}

	    private void threadId(){
	    id = getId();
			System.out.println("ID: " + id);
	    }
}