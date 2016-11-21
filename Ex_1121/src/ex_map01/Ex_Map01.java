package ex_map01;

import java.util.HashMap;
import java.util.Map;

public class Ex_Map01 {

	public static void main(String[] args) {
		
		//Map
		/*
		 * 키(key)와 값(value)를 묶어서 하나의 데이터로 저장
		 * 키를 통해 검색하므로 대용량 데이터 검색에서 효율적임.
		 */
		HashMap<String, Boolean> map = new HashMap<>();
		
		map.put("k1", true);
		map.put("k2", false);
		map.put("k3", false);
		map.put("k2", true);
		
		System.out.println(map.size());

		boolean b = map.get("k2");
		System.out.println(b);
		
		b = map.get("k1");
		System.out.println(b);
		
		if (map.containsKey("k1")) {
			System.out.println("key가 존재함");
		}
		
		if (map.containsValue(true)) {
			System.out.println("true값이 존재함");
		}
	}

}
