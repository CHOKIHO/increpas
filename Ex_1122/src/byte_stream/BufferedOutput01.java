package byte_stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutput01 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		String path = "c:/java_study/fbuffer.txt";
		
		try {
			
			fos = new FileOutputStream(path);
			bos = new BufferedOutputStream(fos);
			
			String str = "Buffef를 이용하여 출력합니다.";
			
			byte[] b = str.getBytes();
			bos.write(b);     //버퍼값 기억
			bos.flush();      //버퍼비우기(물리적으로 기록단계)
			
		} catch (Exception e)  {
			e.printStackTrace();
			
		} finally {
			//※닫는 순서 주의
			if (bos !=null) bos.close();  // <--- write단계가 아니라 close할때 실제 기록됨
			if (fos !=null) fos.close();
		}
	}
}
