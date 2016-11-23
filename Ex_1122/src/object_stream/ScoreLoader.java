package object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ScoreLoader {
	
	private RspInfo info;

	public RspInfo getInfo() {
		return info;
	}
	
	
	public ScoreLoader(RspInfo info) {	//   <---- ※ call by reference가 되지않음
		                                //            RspInfo info 만들고 getInfo로 전달한다
		//이전기록 검색
		String path = "c:/java_study/RspScore/"+info.getName()+"/UserInfo.sav";
		
		File f = new File(path);
		
		if (f.exists()) {
			
			try {
				FileInputStream fis = new FileInputStream(path);
				
				ObjectInputStream ois = new ObjectInputStream(fis);
				
					try {
						this.info =(RspInfo) ois.readObject();  //  <----- demotion 캐스팅
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					
					if (ois != null) ois.close();
					if (fis != null) fis.close();
					
				System.out.println("아이디 로드 성공");	
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else {
			System.out.println("새로운 아이디 생성");
		}
		
		
//	FileInputStream fis =
//	        new FileInputStream("file.out"); 
//	ObjectInputStream ois =
//	                new ObjectInputStream(fis); 
//	testobj = (Test)ois.readObject(); 
//	fis.close(); 

	}


	

}
