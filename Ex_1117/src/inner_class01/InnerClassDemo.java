package inner_class01;

public class InnerClassDemo {

	class InnerClass {
		int b = 20;

		public void getResult() {
			System.out.println("InnerClass 클래스가 InstanceClass 입니다.");
		}
	}
	
	
	public static void main(String[] args) {
		
		InnerClassDemo outerClass = new InnerClassDemo();
		
		InnerClassDemo.InnerClass innerClass = outerClass.new InnerClass();
		
		innerClass.getResult();

	}

}
