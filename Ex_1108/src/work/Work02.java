package work;

import java.util.Scanner;

public class Work02 {

	public static void main(String[] args) {

		//Scanner를 통해서 정수 n을 입력 받는다.
		//그리고 1부터 n까지의 합을 계산하여 그결과를 출력.
		
		//숫자입력 : 5
		// 15

		System.out.print("정수 : ");
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int result = 0;

		for (int i = 0; i <= n; i++) {
			result += i;
		}

		System.out.println("결과 : " + result);
	}
}
