package vending;

import java.util.Scanner;

public class VendingMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String select = "";
		
		Vending v = new Vending();
		//v.init();
		
		System.out.print("insert coin : ");
		int money = sc.nextInt();
		
		v.insertCoin(money);
		
		System.out.println("-------------");
		System.out.print("음료 선택 : ");
		
		select = sc.next();
		
		v.outCan(select);

	}

}
