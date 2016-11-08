package control_statement02;

public class Single_For01 {

	public static void main(String[] args) {

		//반복문
		/*
		 * 특정 수행문을 여러번 반복할 수 있도록 해주는 제어문
		 * 단일 for문 : 특정 명령을 원하는만큼 반복하기 위한 제어문
		 * 
		 * for (초기식; 조건식; 증감식 ) {
		 * 		조건식이 참일때 실행되는 영역
		 * 	}
		 */
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}		

		System.out.println("---------------------------");

		for (int i = 1; i <= 30; i++) {
			if (i % 4 == 0)
				System.out.println(i);
		}

		System.out.println("---------------------------");

	}
}
