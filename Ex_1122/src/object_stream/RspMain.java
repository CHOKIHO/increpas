package object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class RspMain {

	public static void main(String[] args) {

		/*
		 * 아이디를 입력 : aaa
		 * 가위(s) | 바위 (r) | 보 (p) : r
		 * 당신이 이겼습니다.
		 * 1승 0무 0패
		 * 다시하시겠습니까? y | n :
		 */
		
		RspInfo info = new RspInfo();
		Scanner sc = new Scanner(System.in);
		
		int win=0, lose=0, draw=0;

		System.out.print("이이디를 입력 : ");
		String id = new Scanner(System.in).next();
		info.setName(id);
		
		//이전정보 읽어오기
		try{

			ScoreLoader loader = new ScoreLoader(info);
			
			win = loader.getInfo().getWin();
			lose = loader.getInfo().getLose();
			draw = loader.getInfo().getDraw();


			info.setWin(win);
			info.setLose(lose);
			info.setDraw(draw);
			
		} catch (Exception e) {
			
		}
		
		while (true) {
			
			//컴퓨터
			int com = new Random().nextInt(3);
			//0:가위, 1:바위 2:보 

			System.out.print("가위(s) | 바위 (r) | 보 (p) : ");
			String  user = sc.next();
			int usercount=0;
			
			if (user.equalsIgnoreCase("s")) 
				usercount=0; 
			else if (user.equalsIgnoreCase("r")) 
				usercount=1;
			else if (user.equalsIgnoreCase("p")) 
				usercount=2;
			
			//판정
			if (usercount-com == -2 || usercount-com == 1) {
				System.out.println("당신이 이겼습니다.");
				win++;
			} else if (usercount-com ==0) {
				System.out.println("무승부입니다.");
				draw++;
			} else {
				System.out.println("당신이 졌습니다.");
				lose++;
			}
			
			System.out.println(win + "승 " + lose + "무 " + draw + "패");
			System.out.print("다시 하시겠습니까? y | n ");

			String again = new Scanner(System.in).next();
			if (!again.equalsIgnoreCase("y")) {
				
				info.setWin(win);
				info.setLose(lose);
				info.setDraw(draw);
				
				break;
			}
		}
		System.out.println("게임이 종료되었습니다.");
		
		ScoreWriter sw = new ScoreWriter(info);
		
	}

}
