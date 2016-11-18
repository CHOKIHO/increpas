package thread01;


// Thread (실행단위, 독립실행단위)
/*
 * 한번에 두가지 이상의 프로세스를 실행 가능
 * 
 * 구현방법
 * 1. Thread 클래스를 상속으로 구현 (extends)
 *   1-1. run() 메서드 오버라이딩
 *   ----------------------------   
 *   1-2. Thread 구현 클래스 생성
 *   1-3. start() 메서드 호출
 *    
 *    
 * 2. Runnable 인터페이스 구현  (자주사용) ========> ※익명내부클래스로 구현
 *   2-1. Runnable 인터페이스 구현 (implements)
 *   2-2. run() 메서드 오버라이딩
 *   ---------------------------------------
 *   2-3. Thread t = new Thread(JobClass); //Thread 생성자(Runnable인터페이스를 구현한 JobClass) 초기화
 *   2-4. t.start()메서드 호출
 * 
 *   cf) 하나의 job을 두개의 쓰레드가 실행할수 있다. (※동기화 문제발생 -> synchronized(){} 해결)
 */


public class ThreadEx extends Thread{

	@Override
	public void run() {
		
		//쓰레드의 독립적인 수행을 가능하도록 해주는 영역.
		
		for (int i=0; i<10; i++) {
			System.out.println("쓰레드 실행");
		}
	}
}
