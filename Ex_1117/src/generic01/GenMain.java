package generic01;

public class GenMain {

	public static void main(String[] args) {

		GenEx<String> v1 = new GenEx<String>();
		
		v1.setValue("TEST");
		String str = v1.getValue();
		System.out.println(str);
		
		//제네릭타입은 기본자료형을 사용할수 없음 (래퍼클래스 사용)
		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(100);
		int n = v2.getValue();
		System.out.println(n);
		
		GenEx<Character> v3 = new GenEx<Character>();
		v3.setValue('A');
		char c = v3.getValue();   //UnBoxing
		System.out.println(c);
		
		GenEx<Double> v4 = new GenEx<>();
		v4.setValue(3.14);
		double d = v4.getValue();
		System.out.println(d);

	}

}
