package try_catch01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch03 {

	public static void main(String[] args) {

		//Scanner를 통해 정수를 입력받도록 하고
		//정수를 입력 받았을경우 출력하고
		//정수이외의 값이라면 "정수만 입력할 수 있습니다." 오류메시지 출력

		//입력 : 10
		//입력받은 수 : 10
		//입력 : A
		//정수만 입력할 수 있습니다.
		int n =0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("입력 : ");
				
				n = new Scanner(System.in).nextInt();   //익명클래스
				System.out.println("입력받은 수 :" + n);
				break;

			} catch (InputMismatchException e) {

				//e.printStackTrace();
				System.out.println("정수만 입력할 수 있습니다.");
				continue;

			}
		}
	}
}
