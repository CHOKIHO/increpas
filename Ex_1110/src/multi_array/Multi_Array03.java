package multi_array;

public class Multi_Array03 {

	public static void main(String[] args) {

		int[][] num = new int[2][];
		int n=0;
		
		//1차 배열 사이즈 다르게
		num[0] = new int[3];
		num[1] = new int[2];
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {

				num[i][j] = n += 10;
				System.out.printf("%d\t", num[i][j]);
			}
			System.out.println();
		}
	}

}
