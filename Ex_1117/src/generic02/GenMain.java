package generic02;

public class GenMain {

	public static void main(String[] args) {

		Integer[] iArr = { 1, 2, 3, 4, 5 };
		Double[] dArr = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };
		
/*		Gen<Integer> gen1 = new Gen<Integer>();
		gen1.printArr(iArr);
		
		//실수출력
		Gen<Double> gen2 = new Gen<Double>();
		gen2.printArr(dArr);
		
		//문자출력
		Gen<Character> gen3 = new Gen<Character>();
		gen3.printArr(cArr);
*/		

		GenMethod gen = new GenMethod();
		
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);
		
	}

}
