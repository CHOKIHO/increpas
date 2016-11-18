package daemon01;

public class DeamonMain {

	public static void main(String[] args) throws InterruptedException {

		//데몬쓰레드
		/*
		 * 일반 쓰레드의 작업을 돕는 보조적인 역할을 수행
		 * 자신을 실행한 메인쓰레드가 종료될때 데몬쓰레도도 함께 종료.
		 * 
		 */
		DeamonEx daemon = new DeamonEx();
		Thread t = new Thread(daemon);
		t.setDaemon(true);	//	<----------데몬쓰레드화
		t.start();
		
		for (int i=1;i<20;i++) {
			
			Thread.sleep(1000);
			System.out.println(i);
			
		}
		
		System.out.println("메인 종료");
	}

}
