package ex_string;

import java.util.Scanner;

public class String04 {

	public static void main(String[] args) {

		//문제1
		/*
		 *이메일을 입력받고 @앞의 문자의 길이가 6보다 작거나,
		 *10보다 클경우 입력한 이메일이 올바르지 않습니다. 출력
		 *
		 *이메일 : aaaa@naver.com
		 *이메일 형식이 올바르지 않습니다.
		 *
		 *이메일 : aaabbc@k.com
		 *aaabbc - 이메일 확인 성공
		 *
		 */		
		
		String[] str;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 : ");
		str = sc.nextLine().split("@");
		
		if (str[0].length() <6 || str[0].length() > 10) {
			System.out.println("이메일 형식이 올바르지 않습니다.");
		}else{
			System.out.println(str[0]+" - 이메일 확인성공");
			
		}
	}

}
