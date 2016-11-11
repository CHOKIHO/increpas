package ex_string;

import java.util.Scanner;

public class String05 {

	public static void main(String[] args) {

		//문제2
		/*
		 *회문수  (121, 1331, 2772) 앞으로 읽거나 뒤로 읽거나 동일함
		 *
		 *키보드에서 세자리 이상의 숫자를 입력받은후
		 *해당숫자가 회문수인지를 판단하는 로직을 구현		 
		 *
		 */		
		
		Scanner sc = new Scanner(System.in);
		String tmp;

		tmp = sc.next();

		int len = tmp.length();
		boolean yn = true;

		for (int i = 0; i <= len / 2; i++) {
			if (tmp.charAt(i) != tmp.charAt(len - 1 - i)) {
				yn = false;
				break;
			}
		}

		if (yn) {
			System.out.println("회문수 입니다.");
		} else {
			System.out.println("회문수가 아닙니다.");
		}

	}

}
