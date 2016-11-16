package override01;

public class CalMain {
	
	public static void main(String[] args) {
		
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		
		int n1 = 10;
		int n2 = 5;
		
		//getResult 오버라이드
		System.out.println(cp.getResult(n1, n2));
		
		//getResult 오버라이드
		System.out.println(cm.getResult(n1, n2));
		
	}
}
