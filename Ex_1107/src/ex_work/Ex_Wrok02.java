package ex_work;

public class Ex_Wrok02 {

	public static void main(String[] args) {

		/*
		 * 과수원 
		 * 배,사과,오렌지를 키우고 있는데 하루에 생산되는 양은 
		 * 각각 5개, 7개, 5개
		 * 과수원에서 하루에 생산되는 과일의 총갯수를 출력하고
		 * 시간당 전체 과일의 평균생산갯수를 출력
		 * 단, 각 과일의 갯수를 담을 변수는 int로
		 * 평균생산갯수를 담을 변수는 float으로 만든다.
		 */
		
		int pear = 5;
		int apple = 7;
		int orange = 5;

		int sum = pear + apple + orange;
//		float avr = (float) sum / 24.0f;
		float avr = (float)sum / 24;

		System.out.println("과일총갯수 : " + sum);
		System.out.println("시간당 평균생산갯수 : " + avr);
		
	}
}
