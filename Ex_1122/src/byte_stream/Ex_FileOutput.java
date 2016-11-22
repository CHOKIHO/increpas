package byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_FileOutput {

	public static void main(String[] args) throws IOException {

		//FileOutputStream은 코드상의 내용을 파일에 기록
		
		String path = "c:/java_study/fout.txt";
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(path);
			
			//str문자열을 byte배열로 변환
			String str = "File Output 예제입니다.";
			byte[] b = str.getBytes();
			
			//FileOutputStream을 통해 txt파일에 기록
			fos.write(b);
			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} finally {
			
			if (fos != null) fos.close();
		}
		
		
	}

}
