package inner_class01;

public class MemberInner {

	int a = 10;
	private int b = 100;
	static int c = 200;
	

	//멤버 내부클래스
	class Inner{
		public void printData() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}
}
