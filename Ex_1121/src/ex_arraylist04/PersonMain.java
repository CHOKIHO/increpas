package ex_arraylist04;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		//결과화면
		/*
		 * 1.정보추가
		 * 2.정보삭제
		 * 3.전체정보
		 * etc.종료
		 * >> 1
		 * ---정보추가---
		 * 이름 : a
		 * 나이 : 10
		 * 전화 : 010-1111-2222
		 * 정보저장 완료
		 * 
		 * 1.정보추가
		 * 2.정보삭제
		 * 3.전체정보
		 * etc.종료
		 * 
		 * >> 3
		 * ---전체정보---
		 * 등록인원 1명
		 * 이름 : a
		 * 나이 : 10
		 * 전화 : 010-1111-2222
		 */
		
		ArrayList<Person> list = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		
		

		while (true) {

			System.out.println("1.정보추가\n2.정보삭제\n3.전체정보\netc.종료");
			System.out.print(">> ");

			int select = sc.nextInt();

			switch (select) {
			case 1:

				System.out.println("---정보추가---");

				// Person New
				Person person = new Person();

				System.out.print("이름 : ");
				person.setName(sc.next());

				System.out.print("나이 : ");
				person.setAge(sc.nextInt());

				System.out.print("전화 : ");
				person.setTel(sc.next());

				list.add(person);

				//cf)
				Person p2 = list.get(0);
				
				break;
				
			case 2:
				System.out.println("---정보삭제---");

				System.out.print("이름 : ");
				String delName = sc.next();

				for (int i = 0; i < list.size(); i++) {
					if (delName.equalsIgnoreCase(list.get(i).getName())) {
						list.remove(i);						
						System.out.println(delName + "이 삭제되었습니다.");
						break;
					}
				}
				break;
				
			case 3:
				System.out.println("---전체정보---");

				if (list.size() > 0) {
					for (int i = 0; i < list.size(); i++) {
						System.out.println("이름 : " + list.get(i).getName());
						System.out.println("나이 : " + list.get(i).getAge());
						System.out.println("전화 : " + list.get(i).getTel());
						System.out.println("------");

					}
				} else {
					System.out.println("등록된 정보가 없습니다.");
				}
				break;

			default:
				return;  // <-------ㅡ main 메서드 종료
			}
		}
	}
}
