package control_statement;

public class If_02 {

	public static void main(String[] args) {

		//if-else문
//		if (조건식) {
//		  조건식이 참일때 실행되는 영역	
//		} else {
//		  조건식이 거짓일때 실행되는 영역
//		}
		
		int n = 49;
		String str = "";
	
//		if (++n>=50) {
//			str="n은 50이상의수";
//		} else {
//			str="n은 50이하의수";
//		}
		
		str = (++n >= 50) ? "n은 50이상의수" : "n은 50이하의수";
		
		System.out.println(str);
		System.out.println("-----------------------------");
		
		// 변수 age에 나이를 대입하고, 30세 이상이면
		// 드실만큼 드셨군요를, 그렇지 않은 더 드셔도 됩니다.를
		// 출력하고 마지막으로 감사합니다. 라는 문장을 출력하는
		// 코드를 작성

		int age = 25;
		String ment = "";

		if (age >= 30) {
			ment = "드실만큼 드셨군요";
		} else {
			ment = "더 드셔도 됩니다";
		}

		ment += " 감사합니다.";	
		System.out.println(ment);

	}
}
