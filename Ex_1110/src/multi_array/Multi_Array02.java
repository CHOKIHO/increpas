package multi_array;

public class Multi_Array02 {

	public static void main(String[] args) {

		String[][] java = { { "영희", "j:100", "a:80" }, 
				            { "철수", "j:60", "a:70", "b:90" } };
		
		for (int i = 0; i < java.length; i++) {
			for (int j = 0; j < java[i].length; j++) {
				System.out.printf("%s\t", java[i][j]);
			}
			System.out.println("");
		}
	
	}

}
