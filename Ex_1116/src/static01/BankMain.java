package static01;

public class BankMain {

	public static void main(String[] args) {

		Bank b1 = new Bank("강남", "02-111-2222");
		b1.interest = 0.5f;
		Bank.interest = 0.5f; //static변수는 객체생성 없이 클래스명.스태틱멤버로 바로 접근이 가능함 - public
		b1.toString();
		System.out.println("-------------------------");
				
		Bank b2 = new Bank("분당", "031-111-3333");
		b2.interest = 0.2f;
		b2.toString();
		System.out.println("-------------------------");
		b1.toString();
		
	}

}
