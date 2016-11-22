package char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex_FileReader {

	public static void main(String[] args) throws IOException {

		//byte기반(1byte) 스트림 : InputStream, OutputStream 하위 클래스르 사용
		//
		//char기반(2byte) 스트림 : Reader, Writer의 하위 클래스를 사용
		
		
		FileReader fr;
		
		fr = new FileReader("c:/java_study/test.txt");

		try {
			int code = 0;
			
			while ((code = fr.read()) != -1) {
				
				System.out.print((char)(code));
			}			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			if (fr != null) fr.close();
		}
	}
}
