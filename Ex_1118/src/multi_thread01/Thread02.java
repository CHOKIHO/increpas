package multi_thread01;

public class Thread02 extends Thread {

	@Override
	public void run() {
		
		for (int i=0; i<100; i++) {
			System.out.print("2");
		}
	}

}
