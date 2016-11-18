package thread_sleep01;

public class ThreadEx extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println("1번 쓰레드 실행중 ");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
