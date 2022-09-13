package view;
import controller.ThreadId;

public class Main {
	
	public static void main(String[] args) {

        for (int op = 0; op < 5; op++) {
			Thread threadId = new ThreadId();
			threadId.start();
		}
    }
}