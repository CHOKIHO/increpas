package override01;

public class CalMinus extends Calculator {


	//Calculator클래스의 getResult()메서드를 오버라이딩하여
	//인자로 받는 2개의 값을 빼서 반환하는 메서드로 재정의

	@Override
	public int getResult(int n1, int n2) {

		return n1 - n2;
	}
	
}
