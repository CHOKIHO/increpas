package ex_set01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex_Iterator {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;hs.size()<=5;i++) {
			
			hs.add(new Random().nextInt(45)+1);
		}
				
		System.out.println(hs);
		
		int[] arr = new int[hs.size()];
		
		//반복자 Iterator
		/*
		 * Set구조는 index번호로 접근할 수 없기 때문에 내용을 
		 * 순서대로 얻어오기 위해서 Iterator라는 반복자를 사용
		 */
		System.out.println();
		Iterator<Integer> iter = hs.iterator();
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = iter.next();
			System.out.print(arr[i]+", ");
		}
		
		System.out.println();
		
		/*
		 * ※ Iterator은 인터페이스 new로 생성하지 않고 HashSet.iterator();
		 */
		
		//반복자 Iterator while사용 예제1
		System.out.println();
		System.out.println("Iterator - while 사용");
		Iterator<Integer> iter1 = hs.iterator();
		while( iter1.hasNext() )	{
			System.out.print(iter1.next()+" " );
		}
		
		//반복자 Iterator for사용 예제2
		System.out.println();
		System.out.println();
		System.out.println("Iterator - for 사용");
		for (Iterator<Integer> iter2 = hs.iterator(); iter2.hasNext();) {
			System.out.print(iter2.next()+ ", ");
		}		
		
	}
}
