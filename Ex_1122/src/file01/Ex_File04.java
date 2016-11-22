package file01;

import java.io.File;
import java.io.IOException;

public class Ex_File04 {

	public static void main(String[] args) {

		String path = "c:/java_study/TEST/abc";
		File f = new File(path);
		
		//path경로 실제 디렉토리 존재 여부 확인
		if (!f.exists()) {
			System.out.println("폴더를 생성합니다.");
			System.out.println(f.mkdir());  //한개이 폴더만 생성
			System.out.println(f.mkdirs()); //한개이상 폴더 생성	
		} else {
			System.out.println("폴더가 존재합니다.");
		}
	}
}
