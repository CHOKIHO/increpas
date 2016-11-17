package interface01;

public class InterChild implements InterTest {

	//인터페이스의 구현 
	/*
	 *  인터페이스에서 정의한 메서드를 실제 구현함
	 *  (***반드시 override해야함)
	 *  
	 *   인터페이스는 다중상속이 가능함 (인터페이스간은 상속 키워드 사용)
	 *   클래스는 다중상속이 불가함.
	 */
	
	
	@Override
	public int getVALUE() {
		
		return VALUE;
	}

}
