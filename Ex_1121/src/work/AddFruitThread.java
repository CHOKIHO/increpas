package work;

import java.util.Random;

public class AddFruitThread implements Runnable {
	
	private Random rnd = new Random();
	
//	public AddFruitThread() {
//	
//	}

	@Override
	public void run() {
		
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			//FruitMain.addFruit();
			
			//과일추가
			String str[] = FruitMain.getStr();
			int select = rnd.nextInt(str.length);
			Fruit f = new Fruit(str[select]);
			FruitMain.getFruits().add(f);
		}
	}
}
