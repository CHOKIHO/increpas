package work03;

import java.util.ArrayList;
import java.util.Scanner;

import work.Fruit;

public class WordMain {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<>();
		String[] data = { "apple", "pineapple", "strawberry", "grape", "pear" };

		WordGame wg = new WordGame(arr, data);   // <----- ※ call by reference 
		                                         //           컬렉션프레임워크기 때문
		wg.start();
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			if (arr.size()==0) {
				System.out.println("클리어");
				wg.setPlaying(false);
				break;
			}
			
			System.out.println(arr);
			System.out.print(">> ");

			String input = sc.next();

			//정답처리
			for (int i=0;i<arr.size();i++) {
				if (input.equals(arr.get(i))) {
					arr.remove(i);
				}
			}
		}
		sc.close();
	}

}
