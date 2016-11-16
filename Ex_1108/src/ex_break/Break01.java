package ex_break;

public class Break01 {
	public static void main(String[] args) {
		//break문 : 반복문 내에서 강제적으로 (가장 가까운) 반복문을 빠져 나갈 때 사용.
		//Switch,For,While, Do_While


		for(int i = 1; i <= 2; i++){
			for(int j = 1; j <= 10; j++){
				
				if(j % 2 == 0){
					break; //break를 만나면 반복문을 강제로 나오는데, '나'를( 포함하고 있는 반복문 )중 가장 가까운 반복문 : inner
				}
				System.out.print(j + " ");
				
			}//inner
			System.out.println();
		}//outer
	
	}//main

}
