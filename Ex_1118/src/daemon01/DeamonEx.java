package daemon01;

public class DeamonEx implements Runnable {

	@Override
	public void run() {
		
		while(true){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("자동저장수행중...");
		}
	}

}
