package file01;

import java.io.File;

public class Ex_File02 {

	public static void main(String[] args) {

		String path = "c:/java_study";		
		File f = new File(path);
		
		if (f.isDirectory()) {
			
			//하위디렉토리 가져오기
			String[] names = f.list();
			
			for (int i=0;i<names.length;i++) {
				System.out.println(names[i]);
			}
			
		}
		
	}

}
