package rank;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ScoreWriter {

	public ScoreWriter(Person info) {
	
		String path = "UserInfo.sav";
		
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
	
	
	public ScoreWriter(ArrayList<Person>  ps) {
		String path = "UserInfo2.sav";
		
		//파일쓰기
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;

		try {
			
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			//RspInfo객체 저장
			oos.writeObject(ps);
			System.out.println("ArrayList 기록 저장.");
			
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
