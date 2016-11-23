package object_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ScoreWriter {

	public ScoreWriter(RspInfo info) {
	
		String path = "c:/java_study/RspScore/"+info.getName()+"/UserInfo.sav";
		
		File f = new File("c:/java_study/RspScore");
		if (!f.exists()) f.mkdirs();
		
		File f2 = new File(f, info.getName());
		if (!f2.exists()) f2.mkdirs();
		
		//파일쓰기
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;

		try {
			
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			//RspInfo객체 저장
			oos.writeObject(info);
			System.out.println("기록 저장.");
			
		} catch (Exception e) {
			System.out.println("기록 저장 실패.");
			e.printStackTrace();
			
		} finally {
			
			try {
				if (oos != null ) oos.close();
				if (fos != null ) fos.close();
			} catch (IOException e) {
				
			}
		}

	}
}
