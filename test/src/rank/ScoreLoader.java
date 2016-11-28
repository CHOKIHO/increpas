package rank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ScoreLoader {
	
	private Person p;
	
	private ArrayList<Person> ps;
	
	public Person getP() {
		return p;
	}
	
	public ArrayList<Person> getPs() {
		return ps;
	}

	
	
	public ScoreLoader(Person p) {
		                          
		//이전기록 검색
		String path = "UserInfo.sav";
		
		File f = new File(path);
		
		if (f.exists()) {
			
			try {
				FileInputStream fis = new FileInputStream(path);
				
				ObjectInputStream ois = new ObjectInputStream(fis);
				
					try {
						this.p =(Person) ois.readObject();  //  <----- demotion 캐스팅
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					
					if (ois != null) ois.close();
					if (fis != null) fis.close();
					
				System.out.println("아이디 로드 성공");	
					
			} catch (Exception e) {

				e.printStackTrace();
			}
			
		} else {
			System.out.println("새로운 아이디 생성");
		}
	}
	
	public ScoreLoader(ArrayList<Person> ap) {

		//이전기록 검색
		String path = "UserInfo2.sav";
		
		File f = new File(path);
		
		if (f.exists()) {
			
			try {
				FileInputStream fis = new FileInputStream(path);
				
				ObjectInputStream ois = new ObjectInputStream(fis);
				
					try {
						ArrayList<Person> list =  (ArrayList<Person>)ois.readObject();
		                this.ps = list;
		                
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					
					if (ois != null) ois.close();
					if (fis != null) fis.close();
					
				System.out.println("아이디 로드 성공");	
					
			} catch (Exception e) {

				e.printStackTrace();
			}
			
		} else {
			System.out.println("새로운 아이디 생성");
		}
		
	}


	

}
