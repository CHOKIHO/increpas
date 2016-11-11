package multi_array;

public class Multi_Array01 {

	public static void main(String[] args) {

		//2차원배열
		/*
		 * 1차원배열이 2개모이면 2차원배열
		 * 1차원배열이 3개모이면 3차원배열
		 * 
		 */
		
		int[][] arr = new int[2][3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		//System.out.println(arr[1][1]);
		
		for (int i=0;i<arr.length;i++) {   			//행 length
			
			for (int j=0;j<arr[i].length;j++) { 	//열 length
				
				System.out.printf("%d ", arr[i][j]);
				
			}
		}
		
		int[][][] test = new int[2][2][3];
		
		
		
	}
}
