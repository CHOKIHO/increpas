package ex_string;

import java.util.Scanner;

public class String06 {

	public static void main(String[] args) {

		//검색 : 김수현
		//[김수현]
		//도둑들
		//해품달
		//해당 배우가 존재하지 않습니다.
		
		String[][] actor = { {"[송강호]", "박쥐", "관상"},
							 {"[김수현]", "도둑들", "해품달"},
							 {"[전지현]", "엽그", "암살"} };
		
		System.out.print("검색 : ");
		Scanner sc = new Scanner(System.in);

		String actName = sc.next();

		boolean yn = false;
		int index = 0;

/*		// 검색
		for (int i = 0; i < actor.length; i++) {
			if (actNmae.equals(actor[i][0])) {
				System.out.println(actNmae);
				yn = true;
				index = i;
				break;
			}
		}
		
		//출력
		if (yn) {
			for (int j = 1; j < actor[index].length; j++) {
				System.out.println(actor[index][j]);
			}
		} else {
			System.out.println("해당배우가 존재하지 않습니다.");
		}*/

		
		
		int count=0;
		// 검색
		for (int i = 0; i < actor.length; i++) {
			if (actor[i][0].equals("["+actName+"]")) {

				for (int j = 0; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}

			} else {
				count++;
				if (count==actor.length) {
					System.out.println("해당배우가 존재하지 않습니다.");
				}
				
			}
			
		}
	
	}

}
