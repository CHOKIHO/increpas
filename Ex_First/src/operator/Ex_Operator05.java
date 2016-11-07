package operator;

public class Ex_Operator05 {

	public static void main(String[] args) {

		// 삼항연산자
		// 하나의 조건을 정의하여 조건이 참, 거짓유무에 따라
		// 다른결과를 얻어내기 위한 연산자

		int a = 10;
		int b = 15;

		boolean result = ++a >= b ? true : false;
		System.out.println(result);

		char result2 = (a += a) == b ? 'A' : 'B';
		System.out.println(result2);

		int age = 20;
		char gender = '여';

		char result3 = age > 19 && age < 25 && gender == '여' ? '합' : '불';
		System.out.println(result3);
	}

}
