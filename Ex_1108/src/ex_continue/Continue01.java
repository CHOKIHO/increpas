package ex_continue;

public class Continue01 {
	public static void main(String[] args) {
		//continue�� : �ݺ��� ������ Ư�� ������ �ǳʶٰ��� �� �� ���.
		for(int i = 1; i <= 2; i++){
			for(int j = 1; j < 5; j++ ){
				if( j % 2 == 0){
					continue;
				}
				System.out.print(j + " ");//�� �׼����� ���������� �� continue�� ������ �� ���� ����� �ݺ����� �������� ������ ���������� ������ ������ ���ǽ����� ���ϴ�.
			}//inner 
			System.out.println();
		}//outer
		
	}//main
}
