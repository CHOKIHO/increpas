package char_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex_BufferedReader03 {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		BufferedReader br = null;

		try {
			
			br = new BufferedReader(new FileReader("c:/java_study/test.txt"));
			
			String msg="";
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (br != null) br.close();
			if (fr != null) fr.close();
		}
	}

}
