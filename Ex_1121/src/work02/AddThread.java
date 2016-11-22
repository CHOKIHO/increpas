package work02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import work.Fruit;

public class AddThread extends Thread {
	
	private ArrayList<Fruit> fruits;
	private String[] fruitName = { "apple", "pineapple", "strawberry", "grape", "pear" };
	
	public void StartGame() {
	
		fruits = new ArrayList<>();
		
		for (int i=0;i<fruitName.length;i++) {
			Fruit fruit = new Fruit(fruitName[i]);
			fruits.add(fruit);
		}
		
		Scanner sc = new Scanner(System.in);

		while(fruits.size() != 0) {
			//System.out.println(fruits.size());

			System.out.println(fruits);
			System.out.print(">> ");

			String input = sc.next();

			//정답처리
			if (fruits.get(0).getName().equalsIgnoreCase(input)) {
				fruits.remove(0);
			}
		}
		System.out.println("클리어!!");
		sc.close();
	}
	
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			addFruit();
		}
	}
	
	public void addFruit() {
		Random rnd = new Random();		
		fruits.add(new Fruit(fruitName[rnd.nextInt(fruitName.length)]));
	}
}
