package byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex_Input {

	public static void main(String[] args) throws IOException {
		
		//IO는 크게 byte기반(1byte)과 char(2byte)기반으로 나뉨
		/*
		 * byte기반 : ~InputStream, ~OutputStream 클래스
		 * 
		 * char기반 : ~Reader, ~Writer 클래스
		 * 
		 */
		
		FileInputStream fis = null;
		byte[] read;
		byte[] console = new byte[100];
		
		System.out.print("파일경로 : ");

		try {
			//키보드에서 읽어온 값을 console 바이트배열에 담는다.
			System.in.read(console);
			String path = new String(console).trim();
			File f = new File(path);
			
			if (f.exists()) {
				read = new byte[(int) f.length()];
				
				fis = new FileInputStream(f);
				fis.read(read);
				
				//read배열을 문자열로 변경해서 출력
				System.out.println(new String(read));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fis.close();
		}
	}
}
