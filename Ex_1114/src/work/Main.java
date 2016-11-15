package work;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random number = new Random();

		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = number.nextInt(10);
		}

		DisplayGraph dis = new DisplayGraph();
		dis.display(arr);
		
	}


}		
