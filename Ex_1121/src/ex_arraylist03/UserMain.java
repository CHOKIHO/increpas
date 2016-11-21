package ex_arraylist03;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		
		ArrayList<UserInfo> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		//UserInfo ui = new UserInfo(); //<----- 위치가 여기일경우 마지막값만 반복해서 들어가게됨.
		
		outer : while(true) {
			
			UserInfo ui = new UserInfo();  //<----- ※위치가 중요 (계속해서 새로 생성되어야함)

			System.out.print("아이디 생성 : ");
			String id = sc.next();
			
			for (int i = 0; i < list.size(); i++) {
				if (id.equalsIgnoreCase(list.get(i).getId())) {
					System.out.println("아이디 중복입니다.");
					continue outer;
				}
			}
			
			ui.setId(id);

			System.out.print("PWD 입력 : ");
			ui.setPwd(sc.nextInt());
			
			list.add(ui);
			
			for (int i=0;i<list.size();i++) {
				System.out.println((i+1) + "." + list.get(i).getId() + "(" + list.get(i).getPwd()+")");
			}
		}
	}
}
