package network01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {
	
	ServerSocket ss;
	
	public MyServer() {

		//클래스가 생성될때 클라이언트가 접속할 수 있도록
		//포트번호를 지정해둔다.
		
		try {
			ss = new ServerSocket(3000);
			System.out.println("서버완료");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

	@Override
	public void run() {
		
		while (true) {

			try {
				Socket client = ss.accept();
				
				String ip = client.getInetAddress().getHostAddress();
				System.out.println("접속 :" + ip);
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
	}
}

