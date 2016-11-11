package ex_string;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {

		//String은 두가지 특징을 가지고있다.
		/*
		 * 1) 객체 생성방법이 2가지( 암시적, 명시적 )
		 * 2) 한번 생성된 문자열을 변하지 않는다 (불변적)
		 * 
		 */
		
		//암시적 객체생성
		String s1 = "abc";
		String s2 = "abcd";
		
		if (s1==s2) { //객체간의 비교시 주소값을 비교
			System.out.println("참조주소가 같음");
		} else {
			System.out.println("참조주소가 다름");
		}
		
		//명시적 객체생성
		String s3 = new String("abc");
		
		if (s1==s3) {
			System.out.println("참조주소가 같음");
		} else { 
			System.out.println("참소주소가 다름");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String s4 = sc.next();
		
		if (s4.equals("a")) {
			System.out.println("a 입력");
		} else {
			System.out.println("a 안입력");
		}
		
		String name = "홍길";
		name += "동";
		System.out.println(name);
	}

}
