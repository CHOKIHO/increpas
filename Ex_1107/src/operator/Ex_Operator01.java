package operator;

public class Ex_Operator01 {

	public static void main(String[] args) {
		
		//연산자
		/*
		 *   1.최고연산자 : .  ()
		 *  ②.증감연산자 : ++ --
		 *   3.산술연산자 : + - * / %
		 *   4.시프트연산자 : >> << >>> 
		 *  ⑤.비교연산자 : > < >= <= == !=
		 *   6.비트연산자 : & | ^
		 *  ⑦.논리연산자 : %% || !
		 *   8.조건(삼항)연산자 : ? :
		 *  ⑨.대입연산자 : = *= /= += -= %=
		 *  
		 */
		
		//산술연산자
		int n1,n2,n3;
		n1 = 20;	
		n2 = 7;
		n3 = n1 + n2;
		
		System.out.println("+연산 : "+n3);
		System.out.println("*연산 : "+(n1*n2));
		System.out.println("/연산 : "+(n1/n2));
		System.out.println("%연산 : "+(n1%n2));
		
		System.out.println("-------------------------------------------");
		
		//대입연산자
		/*
		 * 특정값을 변수에 전달하여 기억시킬때 사용하는 연산자
		 */
		
		int num1 = 10;
		int num2 = 7;
		
		num2 += num1;
		System.out.println("+=연산 : "+num2);
		
		num2 -=5;
		System.out.println("-=연산 : "+num2);
		
		num1 /= 2;
		System.out.println("/=연산 : "+num1);
		
		num2 %= num1;
		System.out.println("*=연산 : "+num2 );
		
		
		
	}

}
