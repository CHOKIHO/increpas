package random;

import java.util.Random;

public class Ex_Random01 {
	public static void main(String[] args) {
		int num = new Random().nextInt(5) + 1;
		System.out.println(num);//1���� 5������ ���� �����!
		                        //new Random().nextInt(ū��-������ + 1) + ���ۼ�;
		//A���� Z������ ����
		int random = new Random().nextInt(90-65+1) + 65;
		System.out.println((char)random);//�ٷ� ĳ�����ص� ��.
		
		int random2 = new Random().nextInt('Z'-'A'+1) + 'A';
		System.out.println((char)random2);
		
		
		
	}//main
}
