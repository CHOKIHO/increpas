package char_stream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex_FileWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw =null;
		
		try {
			fw = new FileWriter("c:/java_study/FW.txt");
			String msg = "hello world \r\n 안녕하세요 ";
			fw.write(msg);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			if (fw != null) fw.close();
		}
	}
}
