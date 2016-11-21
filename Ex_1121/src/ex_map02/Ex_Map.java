package ex_map02;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex_Map {

	public static void main(String[] args) {

		//결과화면		
		/*
		 * id를 입력 : f123
		 * pwd를 입력 : 1111
		 * 아이디가 존재하지 않습니다.
		 * 
		 * id를 입력 : a123
		 * pwd를 입력 : 3333
		 * 비밀번호가 일치하지 않습니다.
		 * 
		 * id를 입력 : a123
		 * pwd를 입력 : 1111
		 * 로그인 성공
		 * 
		 */
		HashMap<String, Integer > map = new HashMap<>();
		
		map.put("a123", 1111);
		map.put("b123", 2222);
		map.put("c123", 3333);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("id를 입력 : ");
			String id = sc.next();
			
			System.out.print("pwd를 입력 : ");
			int pwd = sc.nextInt();

			//id체크
			if (map.containsKey(id)) {
				//pwd체크 
				//System.out.println(map.get(id));
				if (pwd == map.get(id)) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
			}

			/* 아닐경우가 기준 */
/*
  			if (!map.containsKey(id)) {
				System.out.println("아이디가 존재하지 않습니다.");
			} else {
				
				if (pwd != map.get(id)) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				} else {
					System.out.println("로그인 성공");
				}
			}
*/			
		}
		
	}

}
