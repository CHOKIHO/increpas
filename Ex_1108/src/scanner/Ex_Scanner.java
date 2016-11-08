package scanner;

import java.util.Scanner;

public class Ex_Scanner {

	public static void main(String[] args) {

		// 키보드에서 값을 받기 위해 Scanner 클래스준비
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = scan.nextInt();
		System.out.println("입력받은값 :" + num);

		Scanner scan2 = new Scanner(System.in);
		System.out.print("문장 :");
		String msg = scan2.nextLine();
		System.out.println("입력받은값 :" + msg);

		scan.close();
		scan2.close();
	}

}
