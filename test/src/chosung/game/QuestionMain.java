package chosung.game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionMain {
	private static int score = 0;
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {

		String answer;
		
		Scanner sc = new Scanner(System.in);

		ArrayList<Quest> list = GameControl.getInstance().makeGame();

		int score = 0;
		
		try {

			for (int i = 0; i < list.size(); i++) {
				System.out.print("<"+(i + 1) + "번> : ");

				list.get(i).showExample();

				//answer = br.readLine();
				System.out.print("답 : ");
				answer = sc.next();

				if (answer.equals(list.get(i).getAnswer())) {
					System.out.println("정답입니다.");					
					score += 20;
				} else {
					System.out.println("오답입니다.");
					score -= 10;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
