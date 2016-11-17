package inner_class02;

public class LocalInnerClassDemo {

	//클래스의 특정메서드내에 클래스를 생성함.
	private int outer = 3;
	
	void localMethod(int i) {

		final int g = 300;

		class LocalInnerClass {
			
			public void InnerClassMethod() {
				
				System.out.println("LocalInnerClass 클래스는 지역 클래스 입니다.");
				System.out.println("g:" + g);
				System.out.println("i:" + i);
				System.out.println("outer:" + outer);
				
			}
		}

		System.out.println("이것은 localMethod() 메서드입니다");
		LocalInnerClass lo = new LocalInnerClass();
		lo.InnerClassMethod();
	}

	public static void main(String[] args) {
		
		LocalInnerClassDemo local = new LocalInnerClassDemo();
		
		local.localMethod(10);
			
	}

}
