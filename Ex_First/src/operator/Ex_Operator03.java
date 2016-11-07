package operator;

public class Ex_Operator03 {

	public static void main(String[] args) {
		
		//비트연산자
		//논리연산자와 유사하지만 비트단위(2진수)의 연산만 가능.
		//SHIFT연산자와 함께 암호화, 복호화 기법에 사용.
		
		int a = 10;
		int b = 7;

		String astr = Integer.toBinaryString(10);
		System.out.println(astr);

		String bstr = Integer.toBinaryString(7);
		System.out.println(bstr);

		int c = a & b;

		// and연산 : 2진수로 변환하여 비교할 때 두값이 모두 1일때만 결과가 1, 나머지는 0

		// System.out.println("논리곱 : " + c);

		c = a | b;
		System.out.println("논리합:" + c);

		c = a ^ b;
		// xor연산 : 2진수로 변환하여 비교할대 두값이 같은면 0, 다르면 1
		System.out.println("배타적or:" + c);		
		
		System.out.println("-------------------------------");
		//시프트연산자
		int aa = 12;
		int bb = 2;
		System.out.println(Integer.toBinaryString(12));
		
		int cc = aa >> bb;  //2bit 오른쪽으로 이동
		System.out.println(">> " + cc);
		
		int dd = cc << bb;
		System.out.println("<< " + dd);
			
		char ch = 'F';	
		char c_result = (char) (ch >> 1);
		System.out.println(c_result);
		
	}

}
