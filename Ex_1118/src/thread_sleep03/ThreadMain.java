package thread_sleep03;

import java.util.Scanner;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n = sc.nextInt();
				
		ThreadCount tc = new ThreadCount(n);
		tc.start();
		
		Thread.sleep(1000);
		
		System.out.println();
				
		ThreadExRunnable tr = new ThreadExRunnable(n);
		Thread t2 = new Thread(tr);
		t2.start();
	}
}
