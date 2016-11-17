package test.java;

public class TestMain {

	public static void main(String[] args) {

		
		//대각선 0찍기
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				if (i==j) {
					System.out.print(0 + " ");
				} else {
					System.out.print(1 + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		//구구단 가로찍기
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {

				System.out.printf("%d*%d=%d\t", i, j, i * j);
				//System.out.print(j+"x"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		// 구구단 세로찍기
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				
				System.out.printf("%d*%d=%d\t", j, i, j * i);
			}
			System.out.println();
		}
	}

}
