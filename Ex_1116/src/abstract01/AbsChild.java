package abstract01;

public class AbsChild extends AbsParent {
	
	int age=10;

	@Override
	public void setValue(int n) {

		//추상클래스를 상속받은 자식 클래스는
		//부모의 추상메서드를 모두 구현(오버라이딩) 해야함
		
		age += 10;
	}

	@Override
	public int getValue() {
	
		return age;
	}
}
