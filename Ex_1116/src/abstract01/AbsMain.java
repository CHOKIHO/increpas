
package abstract01;

public class AbsMain {

	public static void main(String[] args) {

		//추상클래스는 인스턴스를 직접가질수 없다.
		//AbsParent p = new AbsParent();
		
		/*
		AbsParent p = new AbsParent() {
			
			@Override
			public void setValue(int n) {
				// TODO Auto-generated method stub
				
			}
		};
		*/
		
		AbsChild c1 = new AbsChild();
		c1.value = 100;
		c1.age = 20;
		
	}

}
