package work2;

public class UserInfo {
	
	private int money;
	
	//입금메서드
	
	public void plusMoney(int money ) {
		this.money += money;
		System.out.println("입금성공");
	}
	
	//출금메서드
	public void minusMoney(int money) {
		
		if (this.money - money < 0) {
			System.out.println("잔액부족");
		} else { 
			this.money -= money;
			System.out.println("출금성공");
		}
	}
	
	//잔액확인메서드
	public int getMoney() {
		return this.money;
	}
	
	
}
