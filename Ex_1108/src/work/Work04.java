package work;

import java.util.Scanner;

public class Work04 {

	public static void main(String[] args) {
		
		// 키보드에서 정수를 입력받고, 입력받은 수가
		// 소수인지 아닌지를 구별하는 코드를 작성

		Scanner scan = new Scanner(System.in);

		System.out.print("정수 : ");

		int num = scan.nextInt();
		int result = 0;
		int i=0;

		// 소수판별(1과 자기자신외에 수로 나누어 떨어지느냐?)
		for (i = 2; i < num; i++) {
			//System.out.println(num +" % " + i + "="+ (num%i));
			if (num % i == 0) {
				break;
			} 
		}
		
		if (num==i) {
			System.out.println(num+" : 소수가 아닙니다.");
		} else
			System.out.println(num+" : 소수가 아닙니다.");
		}
}
