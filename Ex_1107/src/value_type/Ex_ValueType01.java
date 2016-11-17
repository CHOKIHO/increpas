package value_type;

public class Ex_ValueType01 {

	public static void main(String[] args) {
	
		//기본자료형
		/* 
		 * 논리형 : boolean - 1bit
		 * 문자형 : char    - 2byte
		 * 정수형 : byte    - 1byte  (-128 ~ 127)
		 *          short   - 2byte  (-32,768 ~ 32,767)
		 *          int     - 4byte  (-21억 ~ 21억)
		 *          long    - 8byte  (-922경 ~ 922경)
		 * 실수형 : float   - 4byte
		 *          double  - 8byte
		 */
		
		//변수
		/* 변수 선언규칙
		 * 자료형 변수명;      (선언)
		 * 변수명 = 값;        (대입)
		 * 자료형 변수명 = 값; (초기화)
		 * 
		 * 변수명 작성규칙
		 * -한글로 작성하지 않는다.
		 * -숫자를 먼저 쓰지 않는다.
		 * - _, $를 제외한 특수기호를 포함할 수 없다.
		 * -예약어 금지
		 * -의미있는 단어로 이름지을것
		 */
		
		//논리형 : true, false
		boolean b1; //선언
		b1 = true;  //대입
		
		boolean b2 = false;   //초기화
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		
		//b2 = 0; Type Mismatch Error 
		
		System.out.println("--------------------------------");
		
		//문자형
		/*
		 * 홑따옴표 않에 넣어야 하며, 한글자이상 저장할 수 없다.
		 */
		
		char c1 = 'A';
		System.out.println(c1); 
		//System.out.printf("%d", (int)c1);
		
		char c2 = 65 + 1;
		System.out.println(c2);
		
		char c3 = 'A' + 2;
		System.out.println(c3);
		
		System.out.println("--------------------------------");
		
		//정수형
		byte b = 127;
		short s = 32767;
		int n = 2100000000;
		long l = 22000000000L;
		System.out.println(l);
        
		//실수형
		float f1 =3.14f;
		double d1 = 3.14;
		System.out.println("float : "+f1);
		System.out.println(d1);
		
		d1=100;
		f1=100;
		System.out.println("d :"+d1);
		System.out.println("f :"+f1);
		
		
		
		
		
		
		
	}
}
