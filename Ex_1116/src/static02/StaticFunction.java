package static02;

public class StaticFunction {

	String str1 = "일반멤버변수";
	static String str2 = "스태틱변수 사용";
			
	public String getString() {
		//일반 메서드에서는 static과 일반 멤버변수의
		//구별없이 모두 사용가능
		return str2;
	}
	
	public static void get() {
		//static 메서드에서는 일반 멤버변수를 사용불가
		//System.out.println(str1);
		
		//static 메서드에서 static 변수 사용가능
		System.out.println(str2);
		
		//static 메서드 내부의 지역변수 사용가능(static유무상관없음)
		String str3 = "static 메서드안의 일반지역변수 사용";
		System.out.println(str3);
				
	}
}
