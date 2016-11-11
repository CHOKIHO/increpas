package multi_array;

import java.util.Scanner;

public class Multi_Array05 {

	public static void main(String[] args) {

		//학생들의 수학과 영어성적을 등록하는 프로그램이 있다.
		//프로그램을 실행하면 몇명의 정보를 저장할 것인지
		//입력받은후, 입력받은 수만큼 학생들의 이름과
		//수학, 영어성적을 입력받는 프로그램을 구현
		
		//등록할 인원 : 2
		//이름 : aaa
		//수학 : 90
		//영어 : 95
		//-------------
		//이름 : bbb
		//수학 : 95
		//영어 : 99
		//-------------
		//2명 등록 완료!!!
		//aaa 90 95
		//bbb 95 99
		
		Scanner scan = new Scanner(System.in);

		System.out.print("등록할 인원 : ");
		int nums = scan.nextInt();
		
		String[] info = {"이름 : ", "수학 : ", "영어 : " };
		String[][] arrays = new String[nums][info.length];

		for (int i = 0; i < arrays.length; i++) {

/*			System.out.print("이름 : ");
			arrays[i][0] = scan.next();
			System.out.print("수학 : ");
			arrays[i][1] = scan.next();
			System.out.print("영어 : ");
			arrays[i][2] = scan.next();
			System.out.println("-----------");
*/			
			
			for (int j =0; j<arrays[i].length; j++) {
				System.out.print(info[j]);
				arrays[i][j] = scan.next();
			}
			System.out.println("-----------");
		}

		System.out.println(nums + "명 등록완료");

		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				System.out.printf("%s\t", arrays[i][j]);
			}
			System.out.println();
		}
	}
}
