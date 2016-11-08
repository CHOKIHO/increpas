package control_statement;

import java.util.Scanner;

public class Switch_04 {

	public static void main(String[] args) {

		//키보드에서 정수를 2개를 입력 받는다.
		//키보드에서 연산자를 입력 받는다.
		//switch문을 통해 연산 결과를 출력하는 코드를 작성
		
		Scanner scan = new Scanner(System.in);

		System.out.print("첫번째 : ");
		int num1 = scan.nextInt();

		System.out.print("두번째 : ");
		int num2 = scan.nextInt();

		System.out.print("연산기호 : ");
		String oper = scan.next();

		int result = 0;
		switch (oper) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			break;
		}
		System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
		
		scan.close();
	}
}
