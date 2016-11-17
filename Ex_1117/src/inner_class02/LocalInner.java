package inner_class02;

public class LocalInner {

	//지역 내부클래스 : 메서드 안에 클래스가 정의되어 있을경우
	
	int a = 100;
	
	public void innerTest(int n) {
		
		int b = 200;
		final int c = 300;
		
		//메소드내에서 로컬(지역) 내부클래스  
		class Inner {
			public void getData() {
				System.out.println(a);
				System.out.println(b);  //자동으로 int b를 final int b로 변경하여 사용 가능함
				System.out.println(c);
				System.out.println(n);  //파라메터 int n의 경우도 final int n로 변경됨.
			}
		}
		
		Inner i = new Inner();
		i.getData();
		
	}
}
