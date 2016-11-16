package ex_continue;

public class Continue02 {
	public static void main(String[] args) {
		
		int n = 0;
		while (n < 10) {
			n++;
			if (n % 3 == 0) {
				continue;
			}

			System.out.println(n);
		}
	}

}
