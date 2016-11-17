package inner_class04;

import java.util.Random;
import java.util.Scanner;

public class AnonymousClass {

	public static void main(String[] args) {
		
		//내부클래스의 종류
		/*
		 * 1. Member 내부클래스
		 * 2. Local(지역) 내부클래스 - 메서드내에서도 클래스 정의가 가능하다
		 * 3. static 내부클래스
		 * 4. Anonymous(익명) 내부클래스
		 *  
		 */
		
		//이름없는 익명클래스 (1회사용후 가비지컬렉션 처리)
		//익명클래스생성후 메서드만 호출할때
		int random = new Random().nextInt(5);
		System.out.println(random);
		
		int random2 = new Random().nextInt(5);
		System.out.println(random2);
		
		//이름있는 참조클래스 (close나 null 할당시 가비지컬렉션 처리)
		Random rnd = new Random();
		random = rnd.nextInt(5);
		random2 = rnd.nextInt(5);
		
		//Scanner 익명클래스
		String str = new Scanner(System.in).next();
		
	}
}
