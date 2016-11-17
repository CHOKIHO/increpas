package casting;

public class Demotion {
	public static void main(String[] args) {

		// 2. 디모션(Demotion) : 작은자료형에 큰자료형이 대입되는것 (손실) -명시적

		char c = 'B';
		int n = c + 1; // 프로모션

		c = (char) n;

		System.out.println("n  : " + n);
		System.out.println("c  : " + c);

		float f = 5.9999f;
		int n2 = 0;

		n2 = (int) f;

		System.out.println("n2 : " + n2);

	}
}
