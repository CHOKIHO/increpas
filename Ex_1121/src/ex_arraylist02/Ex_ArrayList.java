package ex_arraylist02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex_ArrayList {

	public static void main(String[] args) {

		//아이디생성 : abc
		//abc
		//아이디생성 : abc2
		//abc
		//abc2
		//아이디생성 : abc3
		//abc
		//abc2
		//abc3
		
		ArrayList<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		boolean b =false;
		
		while (true) {
			
			System.out.print("아이디 생성 : ");
			
			String name = sc.next();
			
			for (int i=0;i<list.size();i++) {
				if (name.equals(list.get(i))) {
					System.out.println("아이디 중복");
					b = true;
					break;
				}				
			}

			if (!b) {
				b=false;
				list.add(name);
			}
			
			for (int j=0;j<list.size();j++) {
				System.out.println(list.get(j));
			}

				
			
			
/*			Iterator<String> iter = list.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
*/			
		}
		
	}

}
