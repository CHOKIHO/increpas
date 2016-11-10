package control_statement03;

import java.util.Random;

public class Do_While02 {
	public static void main(String[] args) {
		//Q������ �����Ͻÿ�.
		//java, jsp, android�� �������ô�.
		//�� ������ ������ �������� 0~130���� ����.
		//�� ������ ������ 0~100�� ���̰� �ƴ� ��쿡 do while�� �˾Ƽ� �ݺ��ϵ���
		//�ݵ�� �������� ���ڰ� �������� ����� ��Ű�� �ڵ带 �ۼ�
		
		int java = 0;
		int jsp =0;
		int android;
		do{
			java= new Random().nextInt(131);
			jsp= new Random().nextInt(131);
			android= new Random().nextInt(131);
			
		}while(java > 100 || jsp > 100 || android > 100 );
		
		System.out.println("java = " + java);
		System.out.println("jsp = " + jsp);
		System.out.println("android = " + android);
		
		
	}//main

}
