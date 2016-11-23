package char_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex_BufferedWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("c:/java_study/buffer.txt"));
			
			bw.write("1라인");
			bw.newLine();
			bw.write("2라인");
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (bw != null) bw.close();
		}
	}
}
