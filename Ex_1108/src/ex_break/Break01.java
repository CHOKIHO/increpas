package ex_break;

public class Break01 {
	public static void main(String[] args) {
		//break�� : �ݺ��� ������ ���������� (���� �����) �ݺ����� ���� ���� �� ���.Switch,For,While, Do_While
		for(int i = 1; i <= 2; i++){
			for(int j = 1; j <= 10; j++){
				
				if(j % 2 == 0){
					break; //break�� ������ �ݺ����� ������ �����µ�, '��'��( �����ϰ� �ִ� �ݺ��� )�� ���� ����� �ݺ��� : inner
					
				}
				System.out.print(j + " ");
				
			}//inner
			System.out.println();
		}//outer
	
	}//main

}
