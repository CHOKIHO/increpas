package class01;

public class Computer {

	//설계도를 만드는 작업
	
	/*
	 * 속성(attribute), 멤버, 필드
	 */	
	
	int hdd;
	int ram;
	float cpu;
	String color;
	
	/*
	 * 컴퓨터의 정보를 출력하는 메서드
	 */
	
	public void getInfo() {
		System.out.println("하드 :" + hdd);
		System.out.println("램 :" + ram);
		System.out.println("cpu :" + cpu);
		System.out.println("컬러 :" + color);
	
	}
	
	
}
