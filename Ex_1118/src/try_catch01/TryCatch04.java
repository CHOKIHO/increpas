package try_catch01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch04 {

	public static void main(String[] args) {

		//정수 : 100
		//결과 : 100
		
		//정수 : abc
		//abc는 정수가 아닙니다.
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("정수 : ");
				int n = sc.nextInt();
				System.out.println("결과 : " + n);
				break;
				
			} catch (InputMismatchException e) {
				
				System.out.println(sc.next() + "는 정수가 아닙니다.");
				continue;
				
			} 
		}
	}

}
