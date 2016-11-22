package file_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInput {

	public static void main(String[] args){

		String path = "c:/java_study/test.txt";
		File f = new File(path);
		byte[] b_read = new byte[50];
		
		if (f.exists()) {
			//파일과 연결된 입력 스트림 생성
			//기준 : 바이트(byte) 기반  ~InputStream, ~OutputStream
			
			//문제 : 파일을 byte단위로 읽어올때  : File + InputStream = FileInputStream
			//		 파일로 byte단위로 쓸때      : File + OutputStream = FileOutputStream
			
			try {
				FileInputStream fis = new FileInputStream(f);
				int readCount =0;
/*
 * 			// ※InputStream read() 읽을것이 없다면(End Of File) -1 반환
 * 			//  1byte단위
  				while ((readCount = fis.read()) != -1) {
					System.out.print( (char)code );  //<--- 2byte 한글을 1byte char로 형변환 (깨짐)
				}
*/		
				//fis가 읽어온 내용을 byte[] 저장
				//b_read 바이트배열(버퍼) 단위
				
				
				while ((readCount = fis.read(b_read)) != -1) {
					System.out.println(new String(b_read));
					System.out.println("readCount : " + readCount);
				}
            
/*				fis.read(b_read);
				//b_read 바이트배열 문자열로 변경
				String result = new String(b_read);
				System.out.println(result)*/;
				
				if (fis != null) fis.close();
				
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
