package ex_break;

public class Lable_Break03 {
	public static void main(String[] args) {
		//label : ���� ����� �ݺ����� ���������� break�� �޸�,
		//Ư�� �ݺ����� �̸��� �ٿ� �ѹ��� �� �� �̻��� �������� �� �ֵ��� �ϴ� Ű����
		outer :/*�̸�����*/ 
		for(int i = 1; i<=3; i++){
			for(int j = 1; j<=3; j++){
				if(j%2==0){
					break outer;//������ �̸��� ��������
				}
				System.out.print(j);
			}//inner
			System.out.println();
			
		}//outer
	}//main

}
