package operator;

public class Ex_Operator04 {

	public static void main(String[] args) {

		//증감연산자
		//1씩 증가시키커나 1씩 감소시키는 연산자
		//선행 증감과 후행증감의 차이점만 알아두자
		
		int a = 10;
		int b = 10;
		
		System.out.println("++a : " + ++a);
		System.out.println("b++ : " + b++);
		System.out.println("b   : " + b);
		
		--b;
		b++;
		b--;
		System.out.println(b--);
		System.out.println(++b);
		
			
	}

}
