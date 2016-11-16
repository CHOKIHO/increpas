package static03;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("여행할 관광객수 : ");
		int n = sc.nextInt();
		
		Guide guide = new Guide(n);
		
		outer : while (true) {
			
			System.out.println("1.관광객정보 : ");
			System.out.println("2.목적지변경 : ");
			System.out.println("etc.종    료 : ");
			System.out.print("> ");
			
			int select = sc.nextInt();
			
			switch (select) {
			case 1: //관광객정보
				for (int i=0; i<guide.guest.length; i++) {
					System.out.println("이름:" + guide.guest[i].getName());
					System.out.println("성별:" + guide.guest[i].getGender());
					System.out.println("목적지:" + guide.guest[i].getPoint());
					System.out.println("-----------------------");
				}
				break;
			case 2:
				System.out.print("목적지 입력 :");
				Guide.point = sc.next();
				
				break;

			default:
				System.out.print("종료");
				break outer;
			}
		}
		
	}
}
