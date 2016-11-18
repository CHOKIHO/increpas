package deamon_thread;

public class DeamonThreadTest {

	public static void main(String[] args) {


		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {

				try {
					Thread.sleep(3000);
					System.out.println("서브 쓰레드 종료");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});	
		
		t.setDaemon(true);		
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인쓰레드 종료");

	}

}
