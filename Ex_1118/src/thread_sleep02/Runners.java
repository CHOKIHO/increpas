package thread_sleep02;

import java.util.Random;

public class Runners {
	public static void main(String[] args) throws InterruptedException {
		
		int[] playerRandom = new int[4];
		String[] playerJump = { "", "", "", "" };
		boolean finish = false;
		int finishPlayer = 0;
		
		while(true) {
			
			//달릴거리			
			for (int i =0; i< playerRandom.length; i++) {
				playerRandom[i] = new Random().nextInt(3);
			}
			
			Thread.sleep(100);
			
			//선수별로 달릴거리를 적용
			for(int i=0;i<playerJump.length;i++) {
				
				switch (playerRandom[i]) {
				case 0:
					playerJump[i] += "";
					break;
				case 1:
					playerJump[i] += " ";
					break;
				case 2:
					playerJump[i] += "  ";
					break;
				case 3:
					playerJump[i] += "   ";
					break;
				}
			}
			
			//달리기
			System.out.println("-----------------------------------------------------------------------------------------------------");
			
			for (int i=0; i<playerJump.length;i++) {
				System.out.print(playerJump[i]);
				System.out.println(i+1+"옷");
				
				if(playerJump[i].length() > 50) {
					finish = true;
					finishPlayer = i+1;
				}
			}
			
			System.out.println("-----------------------------------------------------------------------------------------------------");

			if (finish==true) {
				System.out.println("win - " + finishPlayer);
				break;
			}
			
		}
		
	}
}
