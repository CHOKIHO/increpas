package rank;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		
		
/*		
		//단일객체
		Person p = new Person("aaa", 15);
		ScoreWriter sw = new ScoreWriter(p);

		
		
		
		Person p1 = new Person();
		ScoreLoader sl = new ScoreLoader(p1);

		System.out.println(sl.getP().getName());
		System.out.println(sl.getP().getAge());

*/		
		//복합객체 읽기		
		ArrayList<Person> ps;
		
		ps = new ArrayList<>();
		
		ScoreLoader sl2 = new ScoreLoader(ps);
		ps = sl2.getPs();
		
		for (int i=0;i<ps.size();i++) {
			System.out.println(ps.get(i).getName());
		}
		
		
		
		//복합객체 저장
		
		Person p10 = new Person("aaa", 15);
		ps.add(p10);

		Person p11 = new Person("bbb", 15);
		ps.add(p11);
		
		ScoreWriter sw2 = new ScoreWriter(ps);
		
		
		


	}

}
