package work2;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {

		//1.입    금:
		//2.출    금:
		//3.잔액확인:
		//etc.종  료:
		//>1
		//----입금-----
		//입금할 금액을 입력 : 1000
		//입금성공
		//--------------------------
		//1.입    금:
		//2.출    금:
		//3.잔액확인:
		//etc.종  료:
		//>3
		//----잔액확인----
		//1000원
		
		Scanner sc = new Scanner(System.in);
		int money =0;
		UserInfo ui = new UserInfo();
	
		outer : while (true) {
			System.out.println("1.입    금 :");
			System.out.println("2.출    금 :");
			System.out.println("3.잔액확인 :");
			System.out.println("etc.종  료 :");
			System.out.print(">");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("---입금---");
				System.out.print("입금할 금액을 입력 : ");
				ui.plusMoney(sc.nextInt());
				break;
			case 2:
				System.out.println("---출금---");
				System.out.print("출금할 금액을 입력 : ");
				ui.minusMoney(sc.nextInt());
				break;
			case 3:
				System.out.println("---잔액확인---");
				System.out.println(ui.getMoney());
				break;

			default:
				System.out.println("---종료---");
				break outer;
			}
			System.out.println("--------------");
		}
	}

}
