package inner_class03;

public class StaticInner {

	//static 내부클래스

	static int a = 100;
	final int b = 200;
	
	//static 내부클래스
	
	static class Inner {
		
		static int d = 500;    // 멤버 내부클래스에 static 변수가 존재한다면 내부클래스를 static로 정의해야함
		public void getData() {
			System.out.println(a);
			//System.out.println(b);    //외부 클래스의 instance변수는 사용할수없다. static method와 동일
			
		}	
		
	}
}
