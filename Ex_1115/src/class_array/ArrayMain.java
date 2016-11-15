package class_array;

public class ArrayMain {

	public static void main(String[] args) {
		
		ArrayTest[] ats = new ArrayTest[10];
		ats[0] = new ArrayTest();
		ats[1] = new ArrayTest();
		
		ArrayTest at1 = new ArrayTest();
		ArrayTest at2 = new ArrayTest(); //1개 일때
		
		String[]   str = new String[5];   //배열과 클래스와 동일 선언 및 초기화
		str[0] = "abc";
		String[]   str2 = { "a", "c", "e", "g", "i" };
		String[][] str3 = { {"a", "b"}, {"c", "d"}, {"e", "f"}};

		/*
		 * 클래스 배열 (중요)
		 */
		ArrayTest[] at = new ArrayTest[2]; //준비상태 (비어있는상태-size만 할당됨) - 객체참조가 안된다.
		at[0] = new ArrayTest();           //각각 생성자로 생성해주어야 한다. (객체화단계)  
		at[1] = new ArrayTest();
		
		for (int i = 0; i < at.length; i++) {
			at[i] = new ArrayTest();
		}

		at[0].setAge(30);
		at[0].setName("홍길동");
		at[1].setAge(40);
		at[1].setName("김길동");
		
		for (int i = 0; i < at.length; i++) {
			System.out.println("이름 : " + at[i].getName());
			System.out.println("나이 : " + at[i].getAge());
			System.out.println("--------------");
		}
	}
}
