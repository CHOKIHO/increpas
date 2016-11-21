package ex_map01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex_Map02 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("s1", "나의 키는 s1입니다.");
		map.put("s2", "나의 키는 s2입니다.");
		map.put("s3", "나의 키는 s3입니다.");
		
		String b = map.get("s2");
		System.out.println(b);
		
		//map 구조의 내용을 가져오기 위해 key값을 얻어낸다.
		//key를 얻을수 있는 map의 key 제네릭타입이 필요함 (Set이용)
		
		//※ map의 keySet을 set으로 변경후 Iterator 인터페이스 적용
		
		Set<String> set = map.keySet();
		
		Iterator<String> iter = set.iterator();
		
		while (iter.hasNext()) {
			String strkey = iter.next();			
			String v = map.get(strkey);	//key에 해당하는 value 가져오기
			System.out.println(v);
		}
		
		//※ map.entrySet()
		// HashMap에 넣은 Key와 Value를 Set에 넣고 iterator에 값으로 Set정보를 담에 준다.

		Set<Entry<String, String>> set1 = map.entrySet();
		
		Iterator<Entry<String, String>> itr = set1.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String > e = (Map.Entry<String, String> )itr.next();
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		
	}

}
