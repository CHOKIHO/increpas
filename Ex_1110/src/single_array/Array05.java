package single_array;

import java.math.RoundingMode;
import java.util.Random;

public class Array05 {

	public static void main(String[] args) {

		//변수 money에 10~5000까지의 난수를 발생시켜 넣는다.
		//단, 3450, 1100과 같이 1의자리 숫자는 무조건 0이 되어야한다.
		//발생한 난수 money를 동전으로 바꾸면
		//500원, 100원, 50원, 10원짜리 동전이 각각 몇개 거슬러 지는지를 판별
		//단, 가능한 가장 적은 수의 동전으로 거슬러준다.
		
		//금액 : 2590
		//500원
		//100원 
		//50원
		//10원
		int[] coin = {500, 100, 50, 10};
		
		int money = new Random().nextInt(4999)+1;
		
		int coin500=0,coin100=0,coin50=0,coin10=0;
		
		//원단위버림
		money -= (money%10);
		
		System.out.println(money);
		
//		do {
//			if (money>=500) {
//				coin500 = money / coin[0];
//				money = money % coin[0];
//			} else if (money>=100) {
//				coin100 = money / coin[1];
//				money = money % coin[1];
//			} else if (money >=50) {
//				coin50 = money / coin[2];
//				money = money % coin[2];
//			} else if (money >=10) {
//				coin10 = money /coin[3];
//				money = money % coin[3];
//			}
//		}while (money !=0);
		
		
		for (int i=0;i<coin.length;i++) {
			
			int re = money / coin[i];
			
			if (re>0) {
				System.out.println(coin[i] + "원 : " + re);
				money = money%coin[i];
			}
		}
		
		
		
//			System.out.println("500원 : " + coin500);
//			System.out.println("100원 : " + coin100);
//			System.out.println("50원  : " + coin50);
//			System.out.println("10원  : " +coin10);
		}
		
		//System.out.println(Math.round(money));
	

}
