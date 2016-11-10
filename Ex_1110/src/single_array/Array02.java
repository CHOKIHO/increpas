package single_array;

public class Array02 {

	public static void main(String[] args) {

		char[] ch = new char[4];		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		char[] ch1 =  {'J', 'A', 'V', 'A' };
		
/*        for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
*/
        
		// 개선된 for (foreach)
		for (char c : ch) {
			if (c != 'A') {
				System.out.println(c);
			}
		}
		
				
		
	}

}
