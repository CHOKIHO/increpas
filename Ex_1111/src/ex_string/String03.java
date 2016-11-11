package ex_string;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {

		//키보드에서 아무값이 무작위로 입력받는다.
		//입력받은 문자열에서 소문자 a가 몇개 있는지 판별
		
		//입력 : djfksdfj dljflds djfkdsjf 
		//a의 갯수 : 3
		
		System.out.print("입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int num =0;
		
		String str = sc.nextLine();

		for (int i=0; i<str.length();i++) {
			
			if (str.charAt(i) == 'a') num++;
		}
		
		System.out.println("a의 갯수" + num);
		
		
		String[] arr = str.split("a");
		System.out.println(arr.length);
		
	}

}
