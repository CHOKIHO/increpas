package thread01;

public class ThreadMain {

	public static void main(String[] args) {

		ThreadEx t = new ThreadEx();
		t.run();    //쓰레드를 상속받았지만 일반 메서드로 실행됨.
		t.start();  //run()메서드가 쓰레드로 실행
				
		
		System.out.println("main 종료");

	}

}
