package thread_sleep03;

public class ThreadCount extends Thread {
	
	private int num=0;
	
	public ThreadCount(int n) {
		this.num = n;
	}

	@Override
	public void run() {

		for (int i = num; i > 0; i--) {
			System.out.print(i + " ");
		}

	}	
}
