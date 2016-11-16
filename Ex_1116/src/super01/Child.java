package super01;

public class Child extends Parent {
	
	@Override
	public int getNumber() {
			return super.getNumber();
	}

	//super는  부모클래스를 말함.
	public Child() {
		super(5); //무모클래스의 생성자 호출
		System.out.println("자식프로세스 생성자 호출됨");
	}

}
