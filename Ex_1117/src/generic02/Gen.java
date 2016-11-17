package generic02;

public class Gen{
	
	//메서드에 제네릭을 쓸경우 굳이 클래스에 제네릭을 사용할 필요가 없다.

	public <T> void printArr(T[] v) {
		
		for (T t : v) {
			System.out.print(t+" ");			
		}
		System.out.println();
	}
}
