package byte_stream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex_Output {

	public static void main(String[] args) throws IOException {

		//PrinterStream 화면에 데이터를 출력하도록 하는 클래스
		PrintStream ps = null;
		OutputStream out = null;
		
		ps = System.out;
		out = ps;
		
		int first = 'A';
		int second = 'B';
		
		try {
			out.write(first);
			out.write(second);
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (ps !=null) ps.close();
			if (out !=null) out.close();
		}
		
	}

}
