package inner_class03;

import inner_class03.StaticInner.Inner;

public class StaticlMain {

	public static void main(String[] args) {

		//사용1
		StaticInner.Inner inner = new StaticInner.Inner();
		
		//사용2
		Inner inner2 = new Inner();  //import가 필요함(import inner_class03.StaticInner.Inner;)
		
		inner.getData();

	}
}
