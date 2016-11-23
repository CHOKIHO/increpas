package network02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

	
	ServerSocket ss;
	
	public MyServer() {
		
		try {
			ss = new ServerSocket(3001);
			System.out.println("서버시작됨....");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	
	@Override
	public void run() {

		while (true) {
			BufferedReader br = null;
			try {
				Socket c = ss.accept();   // <-----접속자가 들어올때까지 무한대기상태
				
				//접속자가 발생시 전송 문자열 추출
				br = new BufferedReader(new InputStreamReader(c.getInputStream()));
				
				String msg = br.readLine();
				System.out.println("수신메시지 : "+ msg);
				
					
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
				try {
					if (br !=null) br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}



}
