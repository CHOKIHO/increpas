package vending;

public class Vending {
	
	private Can[] can = new Can[5];
	private int money;
	
	public Vending() {
		can[0] = new Can("환타", 1000);
		can[1] = new Can("사이다", 1100);
		can[2] = new Can("비타오백", 1200);
		can[3] = new Can("핫식스", 1300);
		can[4] = new Can("콜라", 1400);
	}
	
	//음료수 초기화
/*	public void init() {
		for (int i=0;i<can.length;i++) {
			can[i] = new Can();
		}
		
		can[0].setCanName("환타");
		can[0].setPrice(1000);
		
		can[1].setCanName("사이다");
		can[1].setPrice(1100);
		
		can[2].setCanName("비타오백");
		can[2].setPrice(1200);
		
		can[3].setCanName("핫식스");
		can[3].setPrice(1300);
		
		can[4].setCanName("콜라");
		can[4].setPrice(1400);
	}*/
	
	public void insertCoin(int money) {
		this.money = money;
		
		for (int i=0; i<can.length;i++) {
			if (can[i].getPrice() <= money) {
				System.out.println(can[i].getCanName()+"-"+can[i].getPrice()+"원");
			}
		}
	}
	
	//사용자가 선택한 음료수를 제공하고 잔액 반환 메서드
	public void outCan(String name) {
		
		for (int i=0;i<can.length;i++) {
			if (can[i].getCanName().equals(name)) {
				
				System.out.println(can[i].getCanName()+"을 선택하셨습니다.");
				System.out.println("잔액 : " + (this.money - can[i].getPrice()));
			}
		}
	}
}

