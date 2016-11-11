package multi_array;

import java.util.Scanner;

public class Multi_Array06 {

	public static void main(String[] args) {

		int[][] arr;
		int num = 1;//시작수
		int size =0;//마방진 사이즈
		int y=0; //행
		int x=0; //열
		
		//마방진 만들기
		//첫행의 가운데 1을 찍는다.
		//1위치에서 위쪽 1줄(x증가), 오른쪽 1칸(y감소)을 이동한후 다음수를 찍는다.
		//만약 찍을 위치에 숫자가 있으면 바로 아래에 찍는다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 : ");
		size = sc.nextInt();
		
		x=size/2;//x축 중앙 위치 (1찍기위한 준비)
		arr = new int[size][size];
		
		while(num <= size*size) {
			arr[y][x] = num;
			
			if (num%size ==0) {
				y++;
			} else {
				y--;
				x++;
			}
			
			if (y<0) 	y = size-1;
			if (x>=size) x=0;
			num++;
		} //while
		
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				System.out.printf("%02d  ", arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
