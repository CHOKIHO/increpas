package work01;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread {

	private int timeElepsed = 0;
	private boolean flag = true;
	final int FINISH = 5;
	
	public void startGame() {
		
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;

		while (flag) {
			int n1 = rnd.nextInt(100) + 1;
			int n2 = rnd.nextInt(100) + 1;

			System.out.print(n1 + " + " + n2 + " = ");
			int answer = sc.nextInt();

			if (answer == (n1 + n2)) {
				System.out.println("정답!!");
				
			} else {
				System.out.println("오답");
				continue;
			}
			
			count++;
			if (count == FINISH) {
				flag = false;				
				System.out.println("결과 : " + timeElepsed + "초");
				//break;
			}
		}
	}	
	
	@Override
	public void run() {
		
		//경과시간체크		
		while (flag) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			timeElepsed++;
		}
		//System.out.println("---------");
		//System.out.println("결과 : "+timeElepsed + "초");
	}
}
