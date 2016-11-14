package up_down06;

import java.util.Scanner;

public class UpdownMain {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Start start = new Start();
		int num = 0;
		//int count = 0;

		do {
			System.out.print("숫자 : ");
			num = sc.nextInt();
			//count++;

		} while (!start.check(num));

		//System.out.println(count + "번에 만에 정답");

	}

}
