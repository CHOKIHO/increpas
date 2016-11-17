package operator;

public class Ex_Operator02 {

	public static void main(String[] args) {

		//비교연산자
		/*
		 * 변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		 */
		
		int n1 = 10;
		int n2 = 20;
		
		boolean result = n1 < n2;
		System.out.println("n1 < n2  : "+ result);
		
		result = n1 >= n2;
		System.out.println("n1 >= n2 : " + result );
		
		result = n1 == n2;
		System.out.println("n1 == n2 : "+ result);
		
		result = n1 != n2;
		System.out.println("n1 != n2 : "+ result);

		System.out.println("---------------------------------");
		
		//논리연산자
		//비교연산자를 통한 연산이 2개 이상 필요할대 사용
		
		int age = 20;
		int limit = 35;
		
		result = limit - age >=5 && age > 30;
		//&&연산은 and 연산
		//앞쪽 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다.
		//~하고라는 의미로 해석하면 도움이 된다.
		System.out.println("&&연산 : "+result);
		
		int num1 = 10;
		int num2 = 20;
		//||연산 (Or연산) ~거나로 해석
		//앞쪽연산이 차밍면 뒤쪽 연산을 수행하지 않는다.
		result = (num1 +=10) > 20 || num2 -10 == 11;
		System.out.println("||연산 : " + result);
		
		age =27;
		char gender = '남';
		
		result = age>19 && age <30 && gender != '여';
		System.out.println(result);
		
		int i1 = 10;
		int i2 = 20;		
		
		result = (i1 += i2)  > i1+i2 || i2-i1 ==0;
		//!은 not연산자
		//참->거짓, 거짓->참으로 변경
		System.out.println(!result);
		System.out.println(result);

		
	}

}
