package multi_array;

public class Multi_Array04 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4, 5 }, 
						{ 6, 7, 8, 9, 10 }, 
						{ 11, 12, 13, 14, 15 }, 
						{ 6, 17, 18, 19, } };
		int result = 0;
		int num = 0;
		float avg = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				result += arr[i][j];
				num++;
			}
		}

		System.out.println("result : " + result);
		avg = (float) result / num;
		System.out.println("average : " + avg);
	}

}
