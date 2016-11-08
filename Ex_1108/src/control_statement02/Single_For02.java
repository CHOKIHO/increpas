package control_statement02;

import java.util.Scanner;

public class Single_For02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("단 : ");
		
		int dan = scan.nextInt();

		if (dan >= 2 && dan <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
		} else {
			System.out.println("2~9사이의 숫자를 입력하세요");
		}
		
		scan.close();
	}

}
