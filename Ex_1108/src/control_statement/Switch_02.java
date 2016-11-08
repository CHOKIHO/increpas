package control_statement;

public class Switch_02 {

	public static void main(String[] args) {

		String str = "숙";

		switch (str) {
		case "수":
			System.out.println("90~100");
			break;
		case "우":
			System.out.println("80~89");
			break;
		case "미":
			System.out.println("70~79");
			break;
		case "양":
			System.out.println("60~69");
			break;
		case "가":
			System.out.println("0~59");
			break;
		default:
			System.out.println("성적이 올바르지 않습니다.");
			break;
		}
	}

}
