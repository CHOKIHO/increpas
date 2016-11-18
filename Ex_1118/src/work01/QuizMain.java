package work01;

public class QuizMain {

	public static void main(String[] args) {

		QuizThread quiz = new QuizThread();
		quiz.start();
		quiz.startGame();
		
		//1~100 사이 난수 2개 생성하여 덧셈문제 출제
		//23 + 15 = 0
		//오답
		//40 + 10 = 50
		//정답
		
		//5문제가 정답처리될때까지 반복
		//61 + 54 = 115
		//정답!!
		//결과 : 24초....
		
	}

}
