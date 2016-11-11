package single_array;

import java.util.Arrays;
import java.util.Random;

public class Array06 {

	public static void main(String[] args) {

		// 1~45사이의 난수를 발생시켜 로또번호 생성기 만들기 (중복없음)
		int[] lotto = new int[6];

		//for (int i = 0; i < lotto.length;) {
		
		outer : for (int i = 0; i < lotto.length;) {
			//lotto[i] = new Random().nextInt(45) + 1;

			
/*			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					// System.out.print("duplicate("+ lotto[i] + ") ");
					i--;
					break;
				}
			}
*/			
			lotto[i] = new Random().nextInt(6) + 1;
			
			for (int j=0;j<i;j++) {
				if (lotto[i] == lotto[j]) {
					continue outer;  //outer의 증감식으로 이동
					//break;
				}
			}
			
			System.out.printf("%02d ", lotto[i]);
			i++;
		}

//		for (int i : lotto) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		Arrays.sort(lotto);
//		System.out.println(Arrays.toString(lotto));
	}

}
