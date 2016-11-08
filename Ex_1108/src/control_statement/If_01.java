package control_statement;

public class If_01 {

	public static void main(String[] args) {

		//제어문
		/*
		 * 프로그램의 흐름을 제어하는 문장
		 * 분기문과 반복문으로 나눈다.
		 * 
		 *  분기문 : if, switch
		 *  반복문 : for, while
		 */

		//if문 : 단순 if문
		int n = 55;
		
		//문자열을 저장하는 자료형
		String str = "";
		
//		if (조건식) {
//			
//		}
		
		if (n == 50) {
			str = "n은 50입니다.";
		}

		if (n != 50) {
			str = "n은 50이 아닙니다.";
		}

		System.out.println(str);

		str = (n == 50) ? "n은 50입니다." : "n은 50이 아닙니다.";
		System.out.println(str);
		
	}

}
