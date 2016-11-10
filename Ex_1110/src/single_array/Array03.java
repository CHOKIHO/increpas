package single_array;

public class Array03 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		
		System.out.println(result);
		System.out.println("-----------------------");
		result = 0;

		for (int i : arr) {
			result += i;
		}

		System.out.println(result);
	}
}

