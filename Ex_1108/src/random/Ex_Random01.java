package random;

import java.util.Random;

public class Ex_Random01 {
	public static void main(String[] args) {
		int num = new Random().nextInt(5) + 1;
		System.out.println(num);//1에서 5사이의 난수 만들기!
		                        //new Random().nextInt(큰수-작은수 + 1) + 시작수;
		//A부터 Z사이의 난수
		int random = new Random().nextInt(90-65+1) + 65;
		System.out.println((char)random);//바로 캐스팅해도 됨.
		
		int random2 = new Random().nextInt('Z'-'A'+1) + 'A';
		System.out.println((char)random2);
		
		
		
	}//main
}
