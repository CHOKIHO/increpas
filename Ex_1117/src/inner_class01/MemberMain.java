package inner_class01;

public class MemberMain {

	public static void main(String[] args) {
													//내부클래스 접근절차
		MemberInner mi = new MemberInner();			// 1. 외부클래스 생성후	
													// 2. 외부클래스.내부클래스 변수명
		MemberInner.Inner inner = mi.new Inner();  	// 3. 생성된 외부클래스.new 내부클래스 생성
		
		inner.printData();
	}

}
