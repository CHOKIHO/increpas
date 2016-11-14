package work;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		
		int[] arr = new int[100];
		
		for (int i=0;i<100;i++) {
			arr[i] = new Random().nextInt(10);
			//System.out.println(arr[i]);
			
		}
		
		Display dis = new Display();
		dis.display(arr);
		
	}


}		
