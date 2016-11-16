package static03;

import java.util.Scanner;

public class Guide {
	
	static String point;
	Guest[] guest;

	public Guide(int n) {
		
		point = "석굴암";
		guest = new Guest[n];
		Scanner sc = new Scanner(System.in);
				
		System.out.println("--- 관광객 등록 ---");
		
		for (int i=0; i<guest.length;i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("성별 : ");
			String gender = sc.next();
			
			guest[i] = new Guest(name, gender);
		}
	}
}
