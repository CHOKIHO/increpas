package class02;

class BlackPen {
	
	String color = "black";
	String length = "15cm";
	float weight = 0.5f;
	
	//메서드는 어떤 작업을 수행하기 위한 명령문의 집합
	//반복적으로 사용되는 코드를 줄이기 위해서 만들어진다.
	
	private void penInfo() {

		System.out.println("색상"+color);
		System.out.println("길이"+length);
		System.out.println("무게"+weight);
	}
	
	//메서드의 구성요소
	//접근제한자  반환형   메서드명 
	//public      void     penInfo(파라메터-인자) { 메서드영역 }
	
	//접근제한자
	/*
	 * 1.public : 같은 프로젝트내에 모든 객체들에게 접근을 허가
	 * 2.private : 현재 클래스내에서만 사용을 허가
	 * 3.protected : 상속관계의 객체에게만 사용을 허가
	 * 4.default :  같은 패키지의 객체들에게 접근을 허가
	 */
	

}



