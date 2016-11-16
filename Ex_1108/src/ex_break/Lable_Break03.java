package ex_break;

public class Lable_Break03 {
	public static void main(String[] args) {
		//label break문
		
		/* 
		 * 
		 * 가장 가까운 반복문을 빠져나오는 break와 달리,
		 * 특정 반복문 앞에 이름(label)을 붙여 
		 * 한번에 두 개 이상 루프를  빠져나올 수 있도록 하는 키워드 
		 * 		  
		 */
		
		outer: for (int i = 1; i <= 3; i++) { /* 이름지정 */
			for (int j = 1; j <= 3; j++) {
				if (j % 2 == 0) {
					break outer;// 지정한 이름을 빠져나옴
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
