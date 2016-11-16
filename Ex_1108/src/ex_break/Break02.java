package ex_break;

public class Break02 {
	public static void main(String[] args) {
		
		int n = 1;
		
		while (true) {
			System.out.println(n);
			n++;
			if (n > 5) {
				break;
			}
		}
	}
}
