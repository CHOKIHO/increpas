package ex_continue;

public class Label_Continue03 {
	public static void main(String[] args) {
	
				//label : ���� ����� �ݺ����� ���������� break�� �޸�,
				//Ư�� �ݺ����� �̸��� �ٿ� �ѹ��� �� �� �̻��� �������� �� �ֵ��� �ϴ� Ű����
				outer :/*�̸�����*/ for(int i = 1; i<=3; i++){
					for(int j = 1; j<=3; j++){
						if(j%2==0){
							continue outer;//������ �̸��� ��������
						}
						System.out.print(j);
					}//inner
					System.out.println();
					
				}//outer 


	      outer : for(int i = 1;i<=3;i++){//�ݺ����� �̸��� ����
	         for(int j = 1; j<=10 ;j++){
	            if(j%2==0){
	               continue outer;//���ǿ� �¾����� ���� ����� �ݺ����� �ƴ� �ش� �̸��� �ݺ����� ����������.
	            }
	            System.out.print(j + " ");
	         }//inner
	         System.out.println();
	      }//outer
	   

}//main

}
