package method03;

public class ValueMain {

	public static void main(String[] args) {
		
		int su = 100;
		int su2 = 200;

		ValueTest vt = new ValueTest();
		su = vt.test(su, 10);
		
		System.out.println("su :"+(su+50));

		
		String result = vt.test2("최고");
		System.out.println(result);
		
	}

}
