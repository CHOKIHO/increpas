package thread_sleep03;

public class ThreadExRunnable implements Runnable {

	private int num=0;
	
	public ThreadExRunnable(int n) {
		this.num = n;
	}
	
	@Override
	public void run() {

		for (int i = num; i > 0; i--) {
			System.out.print(i + " ");
		}
	}

}
