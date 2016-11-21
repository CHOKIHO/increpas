package ex_set01;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex_Set01 {

	public static void main(String[] args) {
		
		//Set은 java.util 패키지에 존재하는 인터페이스
		/*
		 * 특정 코드에서 중복된 값을 허용하지 않음.
		 * ※ 배열접근(index) 안됨 (Set 인터페이스 구현했기때문)
		 *  
		 */
		
		HashSet<Integer> hs = new HashSet<>();
		
		while (true) {
			int r = new Random().nextInt(45) + 1;
			hs.add(r);
			if (hs.size() >= 6)
				break;
		}
		
		if (hs.contains(21)) {
			System.out.println("21이 있습니다.");
		} else {
			System.out.println("21이 없습니다.");
		}
		
		System.out.println(hs);
		
		System.out.println("-------------");
		
		TreeSet<Integer> ts = new TreeSet<>();
		while (true) {
			int r = new Random().nextInt(45)+1;
			ts.add(r);
			if (ts.size()>=6) 
				break;
		}
		System.out.println(ts);
		System.out.println(ts.subSet(10, 30));
		
	}
}
