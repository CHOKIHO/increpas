package work;

public class DisplayGraph {
	
	/*
	 * 0~9사이의 난수를  100개 생성
	 * 0의갯수 : ##### 5
	 * 1의갯수 : ######### 9
	 * 2의갯수 : ########## 10
	 * ...
	 * 9의갯수 : ######### 9
	 *  
	 */

	public void display (int[] arr) {
		
		int arrNum[] = new int[10];

		// 분포파악
		for (int i = 0; i < arr.length; i++) {
			arrNum[arr[i]]++;
		}

		// # 찍기
		for (int i = 0; i < arrNum.length; i++) {
			System.out.print(i + "의갯수 : ");

			for (int j = 0; j < arrNum[i]; j++) {
				System.out.print("#");
			}
			System.out.println(" " + arrNum[i]);
		}
	}
}
