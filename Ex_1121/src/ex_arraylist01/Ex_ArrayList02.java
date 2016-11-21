package ex_arraylist01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Ex_ArrayList02 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		list.add("홍");
		list.add("G");
		list.add("동");
		
		System.out.println(list);

		list.set(1, "길");

		for (int i=0;i<list.size();i++) {
			if (i != list.size() - 1)
				System.out.print(list.get(i) + "_");
			else
				System.out.println(list.get(i));
		}
		
		list.set(0, "홍_");
		list.set(1, "길_");
		list.set(2, "동");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}	
		
	}
}
