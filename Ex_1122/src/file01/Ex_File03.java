package file01;

import java.io.File;

public class Ex_File03 {

	public static void main(String[] args) {

		String path = "c:/java_study";
		
		File f = new File(path);
		
		if (f.isDirectory()) {
			
			//하위요소들을 File[]로 받기
			File[] f2 = f.listFiles();
			
			for (int i=0;i<f2.length;i++) {
				//하위요소들중 폴더인것만 출력
				if (f2[i].isDirectory()) {
					System.out.println(f2[i].getName() + " [Dir]" );
				} else { 
					System.out.println(f2[i].getName());
					
				}
			}
		}
	}
}
