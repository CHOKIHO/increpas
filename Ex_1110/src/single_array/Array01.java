package single_array;

import java.lang.reflect.Array;

public class Array01 {

	public static void main(String[] args) {

		//배열은 '같은 자료형끼리 모아두는 하나의 묶음'
		/*
		 *  효율적인 자료관리를 위해 반드시 필요.
		 *  편하게 자원들을 관리하기 위해 '배열'을 생성
		 *  
		*/  
		 //1)배열선언
		   int[] arr;
		   
		 //2)배열생성
		   arr = new int[5];
		   
//		   int[] arr = new int[5];
		   
		 //3)초기화
//		   arr[0] = 100;
//		   arr[1] = 200;
//		   arr[2] = 300;
//		   arr[3] = 400;
		   
		   for(int i=0;i<arr.length;i++) {
			   arr[i] = (i+1)*100;
			   System.out.println(arr[i]);
		   }
		   
		   int[] arr2 = {100,200,300,400,500};
		
	}

}
