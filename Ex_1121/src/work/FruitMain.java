package work;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FruitMain {
	
	private static String str[]= { "apple", "pineapple", "strawberry", "grape", "pear" };
	private static ArrayList<Fruit> fruits = null;
	
	
	public static void main(String[] args) {

		fruits = new ArrayList<>();

		for (int i = 0; i < str.length; i++) {
			Fruit f = new Fruit(str[i]);
			fruits.add(f);
		}
		
		//Thread 생성
		AddFruitThread addThread = new AddFruitThread();
		Thread th = new Thread(addThread);
		th.setDaemon(true);
		th.start();
			
		//UI구성
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
	}
	
	public static void addFruit() {
		Random rand = new Random();
		int select = rand.nextInt(str.length);
		Fruit f = new Fruit(str[select]);
		fruits.add(f);
	}
	public static String[] getStr() {
		return str;
	}
	public static ArrayList<Fruit> getFruits() {
		return fruits;
	}
}
