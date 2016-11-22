package file_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput02 {

	public static void main(String[] args) throws IOException {
		
		String path = "C:/java_study/file.txt";
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		int readCount =0;
		
		byte[] buffer = new byte[(int)f.length()];

		String str ="";
		String reverse="";
		
		readCount = fis.read(buffer);
		
		//byte배열을 String 문자열로 변환
		String str2 = new String(buffer).trim();

		for (int i=str2.length();i>0;i--) {
			reverse += str2.charAt(i-1);
		}
		
		System.out.println("----");
		System.out.println(str2);
		System.out.println(reverse);
	
		if (str2.equalsIgnoreCase(reverse)) {
			System.out.println("회문수입니다.");
		} else {
			System.out.println("회문수가 아닙니다.");
		}
		
		if (fis != null) fis.close();

	}
}
