package work;

import java.util.Random;
import java.util.Scanner;

public class Work05 {

	public static void main(String[] args) {
		

		System.out.println("1 ~ 9 사이의 숫자를 입력하세요");
		
		// 랜덤으로 com1, com2, com3 생성
		Random rand = new Random();

//		int com1 = 0, com2 = 0, com3 = 0;
		
		int[] coms = new int[3];
		int[] users = new int[3];
		
				
		int cnt = 1;
		

		while (coms[0] == coms[1] || coms[0] == coms[2] || coms[1] == coms[2]) {
//			com1 = rand.nextInt(9) + 1; // new Random().nextInt(9)+1;
//			com2 = rand.nextInt(9) + 1;
//			com3 = rand.nextInt(9) + 1;
			
			for (int i=0;i<coms.length;i++) {
				coms[i] = rand.nextInt(9) + 1;
			}
		}

		System.out.println(coms[0] + " " + coms[1] + " " + coms[2]);

		Scanner scan = new Scanner(System.in);

		String[] str = {"첫번째 : ", "두번째 : ", "세번째 : "};
		
		for(;;) {
			int strike=0;
			int ball=0;
			
			//입력
			for (int i=0;i<users.length;i++) {
				System.out.print(str[i]);
				users[i] = scan.nextInt();
			}
			
//			System.out.print("첫번째 : ");
//			users[0] = scan.nextInt();
//			System.out.print("두번째 : ");
//			users[1] = scan.nextInt();
//			System.out.print("세번째 : ");
//			users[2] = scan.nextInt();

			// strike 판정
			if (coms[0] == users[0]) strike++;
			if (coms[1] == users[1]) strike++;
			if (coms[2] == users[2]) strike++;

			// ball판정
			if (coms[0] == users[1] || coms[0] == users[2]) ball++;
			if (coms[1] == users[0] || coms[1] == users[2])	ball++;
			if (coms[2] == users[0] || coms[2] == users[1])	ball++;	

			// call 및 정답처리
			if (strike == 3) {
				System.out.println(cnt + "회 만에 정답");
				break;
			} else {
				if (strike > 0 || ball > 0) {
					System.out.println(strike + "S," + ball + "B");
				} else {
					System.out.println("OUT");
				}
			}
			cnt++;
		}
	}
}
