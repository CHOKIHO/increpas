package multi_thread01;

public class ThreadMain {

	public static void main(String[] args) {
		
		//멀티 쓰레드 스케줄링 - 어떤 쓰레드가 먼저 실행될지 모른다.

		Thread01 t1 = new Thread01();
		t1.setPriority(Thread.MIN_PRIORITY);
		Thread02 t2 = new Thread02();
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();	
		
		for (int i=0; i<100; i++) {
			System.out.print("m");
		}

	}

}
