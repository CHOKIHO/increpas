package thread_sleep01;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		ThreadEx t1 = new ThreadEx();
		t1.start();
		
		try {
			
			Thread.sleep(100); // 강제적으로 0.1초 지연 (delay) -- Thread.sleep : static메서드

		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

		System.out.println("메인 메서드 샐행");
		
	}
}
