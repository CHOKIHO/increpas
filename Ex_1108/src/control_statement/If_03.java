package control_statement;

public class If_03 {

	public static void main(String[] args) {
		
		//다중if문 : 여러개의 조건비교가 필요한경우
		
		int num = 75;
		String str = "";
		
		if (num >=90) {
			str ="수";
		} else if (num>=80) {
			str="우";
		} else if (num>=70) {
			str="미";
		} else if (num>60) {
			str="양";
		} else {
			str="가";
		}
		
		System.out.println(str);
	}

}
