package char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex_FileReader02 {
	
	public static void main(String[] args) throws IOException {
		
		//c:/java_study/test.txt
		//알파벳 대소문자가 몇개인지 출력
		
		//대문자 : 7
		//소문자 : 9
		FileReader fr = null;
		
		try {

			fr = new FileReader("c:/java_study/test.txt");

			int code = 0;
			int upper =0, lower=0;
			
			//※ fr.read()의 경우 문자 1개의 값을 리턴한다.
			//※ fr.read(buffer)일경우는 읽은 문자의 갯수를 리턴한다.
			
			while ((code = fr.read()) != -1) {
				
				//System.out.println(code);
				if (code >= 'A' && code <= 'Z') upper++;
				if (code >= 'a' && code <='z') lower++;
			}	
			
			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : " + lower);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			if (fr != null) fr.close();
		}
	}
}
