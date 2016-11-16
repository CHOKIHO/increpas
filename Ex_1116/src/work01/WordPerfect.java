package work01;

import java.util.Random;
import java.util.Scanner;

/*
 * 
  String[] strArr = {"CHANGE", "WORK", "HOPE"};

  문제 : 랜덤으로 단어를 선택하여 스페링을 랜덤처리한다.
  정답은? : phoe
  phoe은 오답
  ----
  정답은? : hope
  hope은 정답
  
*/

public class WordPerfect {

	public static void main(String[] args) {

		String[] strArr = { "ELEPHANT", "SQUARREL", "RAINBOW", "INCREPAS"  };
		Random random = new Random();

		Scanner sc = new Scanner(System.in);
		String answer = "";
		
		int select = random.nextInt(strArr.length);
		RandomSpeller rs = new RandomSpeller(strArr[select]);
		System.out.println("제시한 단어의 스펠링을 맞추어 보세요");
		System.out.println("문제 : " + rs.makeRandomWords());
		
		while (true) {
			
			System.out.print("정답은? : ");
			answer = sc.next();
			
			if (answer.equalsIgnoreCase(strArr[select])) {
				System.out.println(answer + "는 정답입니다.");
				break;
			} else {
				System.out.println(answer + "는 오답입니다.");
			}
			
		}
		sc.close();
	}

}
