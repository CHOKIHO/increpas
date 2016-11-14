package up_down06;

import java.util.Random;

public class Start {

	private int random = new Random().nextInt(50) + 1;
	
	private int cnt = 0;
	
	public boolean check(int num) {
		
		cnt++;
		
		//정답처리
		if (num == random) {
			System.out.println("GOOD");
			System.out.println(cnt + "번에 만에 정답");
			return true;
		}
		//오답처리
		if (num > random) {
			System.out.println("DOWN");
		}
		
		if (num < random) {
			System.out.println("UP");
		}
		return false;
	}
	
}
