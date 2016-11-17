package interface01;

public interface InterTest {
	
	// 인터페이스
	// 서비스 요청에 따른 중계자 역할을 하는 클래스
	/*
	 *   
	 *   접근제한 interface 인터페이스명 {
	 *     	상수;
	 *   	추상메서드;   
	 *   }
	 */
	
	final int VALUE = 100;   // final 키워드로 인해 향후 VALUE 변경불가
	abstract int getVALUE(); // abstract 키워드는 생략가능
	
}
