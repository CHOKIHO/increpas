package ex_work;

public class Ex_Work01 {

	public static void main(String[] args) {

		int a=10;
		int b=12;
		
		boolean result = ++a >= b || 2+7 <=b && 13-b >=0 && (a+=b) - (a%b)>10;
		//예측           F      ||       T   &&      T   &&       T   -->  (T)
		
		System.out.println(result);
		
	}

}
