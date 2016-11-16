package abstract01;

abstract public class AbsParent {
	
	//추상클래스
	/*
	 * 추상메서드가 한개이상 정의도어있는 클래스
	 * abstract 키워드를 명시해야함
	 * 
	 */
	
	int value = 100;
	
	public int getValue() {
		return value;
	}

	//추상메서드
	/*
	 * body가 없기때문에 이를 '미완성적 개념'이라고한다.
	 * 그러므로 이 미완성된 메서드를 자식이 반드시 상속받아
	 * 재정의 해야한다.
	 * 
	 */
	//abstract 접근제한자 반환형 메서명(파라메터);
	abstract public void setValue(int n);
}
