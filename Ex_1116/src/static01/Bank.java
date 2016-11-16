package static01;

public class Bank {
	private String point;
	private String tel;
	
	//static변수는 객체가 아무리 많이 생성되어도
	//오직 한개만 만들어진다.
	static float interest;
		
	public Bank(String point, String tel) {
		super();
		this.point = point;
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		System.out.println("지점 : " + point);
		System.out.println("전화번호 : " + tel);
		System.out.println("이자율 : " + interest);
		return super.toString();
	}
}
