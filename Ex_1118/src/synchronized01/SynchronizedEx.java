package synchronized01;

public class SynchronizedEx implements Runnable {

	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void withdraw(int howmuch) { // 출금
		
		String threadName = Thread.currentThread().getName();

		if (getMoney() > 0) {
			money -= howmuch;
			System.out.println(threadName + "-잔액 : " + getMoney());
		} else {
			System.out.println(threadName + "-잔액이 부족합니다.");
		}
	}

	@Override
	public void run() {

		//쓰레드 동기화 문제해결 (synchronized() {  })
		/*
		 * synchronized 키워드를 사용하여 영역을 명시하면
		 * 해당영역이 마무리 될때까지 다른쓰레드에서 접근불가함
		 */
		
		//synchronized (this) {     

			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				withdraw(1000);
			}
		//}
	}
}
