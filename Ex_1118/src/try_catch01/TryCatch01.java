package try_catch01;

import java.util.Scanner;

public class TryCatch01 {

	public static void main(String[] args) {

		//try - catch (예외처리)
		/*
		 * 자바에서 (예외)에러 발생시 그 시점에서 강제종료함
		 * 
		 *  예상되는 가벼운 오류나 예외가 발생시 종료하지 않고 계속 진행할경우
		 *  예외처리를 통해 비정상적인 종료를 줄이고 계속 수행
		 * 
		 *  try {
		 *  
		 *  	예외 예상코드 (유발코드)
		 *  
		 *  } catch(exception e) {
		 *  
		 *  	예외가 발생할경우 처리해야할 영역
		 *    
		 *  }
		 */

		int n=0;
		int result=0;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		try {

			result = 10 / n; // <-------------ArithmeticException 발생
			System.out.println(result); 

		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("0으로는 나눌수 없습니다.");
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("예외발생");
			
		} finally {
			
			//예외발생여부에 관계없이 무조건 실행되는 영역
			System.out.println("filnally");
		}
		
		System.out.println("프로그램 종료");
	}
}















