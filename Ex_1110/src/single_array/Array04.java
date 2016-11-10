package single_array;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열길이 : ");
		int arrayNumber = scan.nextInt();
		char ch2 = 'A';
		
		char[] arrays = new char[arrayNumber];
		
		for (int i=0;i<arrayNumber;i++) {
//			arrays[i] = (char)('A' + i);
//			arrays[i] = ch2++;
			System.out.print(arrays[i]=ch2++);
		}
		
//		for (char c : arrays) {
//			System.out.print(c);
//		}
		scan.close();
	}
}
