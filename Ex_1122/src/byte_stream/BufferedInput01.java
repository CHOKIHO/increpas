package byte_stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BufferedInput01 {

	public static void main(String[] args) {

		//Buffered Stream은 입출력의 효율성을 향샹시키기 위함.
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("경로 : ");
		String path = sc.next().trim();
		
		byte[] read = new byte[100];
		
		try {
			//FileInputStream과 BufferInputStream을 연결함으로써
			//파일을 읽을때 버퍼링작업을 수행한다.
			//버퍼링작업이란, 출력할 바이트를 버퍼라는 메모리공간에 
			//배열로 만들어서 미리 저장해두는 작업을 말함
			//BufferedInputStream을 통해 버퍼라는 전용공간을 활성화
			
			fis = new FileInputStream(path);
			bis = new BufferedInputStream(fis);
			
			//BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream(path));
			
			bis.read(read);
			String result = new String(read).trim();

			System.out.println(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
