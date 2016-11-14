package ex_string;

public class String_Method02 {

	public static void main(String[] args) {

		String name = "Hong Gil Dong";
		int n = name.length();

		System.out.println("문자열 name의 길이 :" + n);
		
		int index = name.indexOf('g');
		System.out.println("맨 처음 문자 g의 위치 : " + index);
		
		index = name.indexOf("Gil");
		System.out.println("Gil의 위치 : " + index);
		
		index = name.lastIndexOf('g');
		System.out.println("마지막 문자 g의 위치 : " + index);
		
		char ch = name.charAt(5);
		System.out.println("3번째 문자 : " + ch);
		
		String ss = name.substring(0, 5);  //1번부터 (5-1) 까지  --'Hong ' //substring과 indexOf의 조합
		System.out.println("추출문장 : " + ss);
		
		String s2 = ss.trim();
		
		if(s2.equals(" Hong ".trim())) {
			System.out.println("값이 같다.");
		} else {
			System.out.println("값이 다르다.");
		}
		
		String[] arr = name.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] " +arr[i]);
		}
		
		String number = "90";
		int num = Integer.parseInt(number);
		
		System.out.println(num+10);
	}

}	
