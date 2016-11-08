package control_statement;

import java.util.Scanner;

public class Switch_03 {

	public static void main(String[] args) {

		//7월은 31일까지 있습니다.
		
		String str ="";
		Scanner scan = new Scanner(System.in);

		System.out.print("원하는 달을 입력 : ");
		
		while (scan.hasNextInt()) {

			int mon = scan.nextInt();

			switch (mon) {
			case 1: case 3:	case 5:	case 7:	case 8:	case 10: case 12:
				str = "31일까지 있습니다.";
				break;
			case 2:
				str = "28일까지 있습니다.";
				break;
			case 4:	case 6:	case 9:	case 11:
				str = "30일까지 있습니다.";
				break;
			default:
				str = "달이 잘못 입력되었습니다.";
				break;
			}

			System.out.println(mon + "월은 " + str);
		}
		scan.close();
	}
}
