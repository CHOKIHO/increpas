package ex_continue;

public class Continue01 {
	public static void main(String[] args) {
		
		//continue문 
		/*
		 * 반복문 내에서 특정 문장을 건너뛰고자 할 때 사용.
		 */
		
		for(int i = 1; i <= 2; i++){
			for(int j = 1; j < 5; j++ ){
				if( j % 2 == 0){
					continue;
				}

				System.out.print(j + " ");
				//딱 그순간만 빠져나오는 것 continue를 만났을 때 가장 
				//가까운 반복문의 증감식이 있으면 증감식으로 가지만 
				//없으면 조건식으로 갑니다.
			} 
			System.out.println();
		}
	}
}