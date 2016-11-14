package calculator04;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 :");
		int n1 = sc.nextInt();
		
		System.out.print("두번째 :");
		int n2 = sc.nextInt();
		
		System.out.print("연산자 :");
		String str = sc.next();
		
		Cal cal = new Cal();
		
		System.out.println("결과 :" + cal.getResult(n1, n2, str));
		
	}

}
