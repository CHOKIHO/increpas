package ex_arraylist01;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex_ArrayList01 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(100);
		list.add(100);
		list.add(200);
			
		System.out.println("size : " + list.size());
		System.out.println(list);
		//개별접근 - get(index) 
		//map에서는 get(key)
		System.out.println(list.get(2));
		
		//접근법 1
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------");
		
		//접근법 2
		Iterator<Integer> iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next()+ " ");
		}

		System.out.println();
		System.out.println("-----------------------");
		
		System.out.println(list);
		list.add(400);
		
		System.out.println(list);
		
		//중간값 끼어넣기
		//add(index, value);
		list.add(1, 500);   
		System.out.println(list);
		
		//삭제하기
		list.remove(2);
		System.out.println(list);

		//변경하기
		list.set(1, 300);
		System.out.println(list);
		
	}

}
