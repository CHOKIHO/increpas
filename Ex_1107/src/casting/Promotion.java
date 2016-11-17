package casting;

public class Promotion {

	
	public static void main(String[] args) {
		
		//캐스팅(형변환)
		/*
		 * 	1. 프로모션(Promotion) : 큰자료형에 작은 자료형이 대입되는것
		 */
		
		double d = 100.5;  //8byte
		int n = 200;       //4byte
		d = n;
		System.out.println("d :"+d);
		
		char c = 'A';  //2byte
		long l = 100l; //8byte
		
		l = c;         //2byte->8byte
		
		System.out.println("l :"+ l);
		
	}
}
