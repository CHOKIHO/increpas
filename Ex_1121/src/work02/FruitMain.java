package work02;

public class FruitMain {

	public static void main(String[] args) {

		AddThread addThread = new AddThread();
		
		addThread.setDaemon(true);
		addThread.start();

		addThread.StartGame();

	}

}
