package times_table05;

import java.util.Scanner;

public class TimesMain {

	public static void main(String[] args) {

		//키보드에서 정수값을 입력, 입력받은 값에 해당하는 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int dan = sc.nextInt();
		
		MyTimesTable mtt = new MyTimesTable();
		mtt.showTable(dan);
		
	}
}
