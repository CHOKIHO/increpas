package try_catch01;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TryCatch02 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30 };
		
		try {
			
			for (int i=0;i<=arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
		/*} catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());*/
			
		} catch (Exception e) {
			System.out.println("예외발생");
			  e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}

}
