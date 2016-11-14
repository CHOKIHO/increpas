package calculator04;

public class Cal {
	
	public String getResult(int n1, int n2, String str) {
		
		String result = "";
		
		switch (str) {
		case "+":
			result += n1 + n2;
			break;
		case "-":
			result += n1 - n2;
			break;
		case "*":
			result += n1 * n2;
			break;
		case "/":
			result += n1 / n2;
			break;
		default:
			result = "4칙연산이 잘못되었습니다.";
			break;
		}
		
		return result;
	}
}
