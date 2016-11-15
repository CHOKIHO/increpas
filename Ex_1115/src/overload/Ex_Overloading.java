package overload;

public class Ex_Overloading {
	
	//오버로딩은 메서드의 '중복정의'라고 하며, 하나의 클래스내에서
	//같은 이름을 가진 메서드가 여러개 정의되는것을 말한다.
	//메서드명은 대소문자를 비롯하여 반드시 같아야하고, 
	//인자명을 제외한 인자의 수가 다르든, 
	//인자의 수가 같은 경우 자료형이 다르든,
	//다른 메서드의 배치된 인자타입과 다르게 정의되어 있으면 된다.
	

	public void getResult() {
		System.out.println("인자가 없는 메서드");
	}
	
	public void getResult (int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	
	public void getResult (char c) {
		System.out.println("문자를 인자로 받는 메서드");
	}

	public void getResult(String str) {
		System.out.println("문자열을 인자로 받는 메서드");
		
	}
	
	public void getResult(String str, int n) {
		System.out.println("문자열, 정수를 받는 메서드");
	}
	
	public void getResult(int n , String str) {
		System.out.println("정수, 문자열을 받는 메서드");
		
		
	}
	
}
