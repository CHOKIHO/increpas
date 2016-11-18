package synchronized01;

public class SynchronizedMain {

	public static void main(String[] args) {

		SynchronizedEx atm = new SynchronizedEx();

		Thread mom = new Thread(atm, "엄마");
		mom.start();
		
		Thread son = new Thread(atm, "아들");
		son.start();

		
	}

}
