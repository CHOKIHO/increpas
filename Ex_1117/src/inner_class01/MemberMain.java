package inner_class01;

public class MemberMain {

	public static void main(String[] args) {

		MemberInner mi = new MemberInner();
		
		MemberInner.Inner inner = mi.new Inner();  //내부클래스 생성
		
		inner.printData();
	}

}
