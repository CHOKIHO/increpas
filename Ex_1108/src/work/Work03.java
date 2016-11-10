package work;

import java.util.Scanner;

public class Work03 {

	public static void main(String[] args) {

		//Scanner를 통해 정수 n1, n2를 입력 받는다.
		//그리고 n1~n2까지의 합을 계산하여 출력
		
		//첫번째 : 2
		//두번째 : 5
		//결과   : 14
		Scanner scan = new Scanner(System.in);
		int n1=0, n2=0, result = 0;
		
		System.out.print("첫번째 : ");
		n1 = scan.nextInt();

		System.out.print("두번째 : ");
		n2 = scan.nextInt();

		if (n1>n2) {
			int temp = n1;
			n1=n2;
			n2=temp;
		}
		
		for (int i=n1; i<=n2; i++) {
			result +=i;
		}
		
//		if (n1 >= n2) {
//			for (int i = n2; i <= n1; i++) {
//				result +=i;
//			}
//		} else {
//			for (int i = n1; i <= n2; i++) {
//				result += i;
//			}
//	   }
		
		System.out.println("결과 : " + result);
	}
	

}
