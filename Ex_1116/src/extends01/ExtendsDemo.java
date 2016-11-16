package extends01;

public class ExtendsDemo {

	public static void main(String[] args) {

		//상속
		/*
		 * 부모클래스가 보유하고 있는 메서드나, 멤버를 
		 * 자식클래스가 물려받는것(호출가능)
		 */
		Child c1 = new Child();
		System.out.println(c1.getCar());
		
		//상속관계의 객체는 자식이 부모가 가지고있는
		//기능을 호출할수 있다.
		System.out.println(c1.getMoney());
		System.out.println(c1.getStr());
		
		//부모클래스는 자신이 가지고 있는것만 사용할수 있다.
		Parent p = new Parent();
		System.out.println(p.getMoney());
		System.out.println(p.getClass().toString());
		
		//왼쪽의 객체가 오른쪽 클래스의 인스턴스인지 확인하는 키워드(메서드가 아니라 키워드)
		if (c1 instanceof Parent) {
			System.out.println("c1은 parenet의 자식");
		}
		
		//부모가 자식의 기능을 사용하고 싶다면 강제로 자식형으로 캐스팅해야함
		System.out.println(((Child)p).getCar());
		
		
		System.out.println(c1.getClass().toString());
		
	}

}















