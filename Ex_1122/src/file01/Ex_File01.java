package file01;

import java.io.File;

public class Ex_File01 {

	public static void main(String[] args) {
		
		// IO (Input/Output) ※ [Input ---> 기준 JVM  ---> Output] 
		/*
		 * IO는 입출력 스트림을 의미
		 * 스트림이란 데이터를 입출력을 위한 방법
		 * 파일읽기, 키보드값 얻어오기
		 */

		String path = "c:/java_study/test.txt";
		File f = new File(path);
		
		if (!f.isDirectory()) {
			System.out.println("파일입니다.");
			System.out.println("크기 : "+ f.length() + "byte");
			
		} else {
			System.out.println("디렉토리입니다.");
		}
	}

}
