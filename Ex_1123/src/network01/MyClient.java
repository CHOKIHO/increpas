package network01;

import java.net.Socket;
import java.sql.SQLException;

public class MyClient {

	public static void main(String[] args) throws SQLException {

		try {
			
			//오라클 DB 접속문자열
/*
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pwd = "1111";
			
			Connection con = DriverManager.getConnection(url, user, pwd);
*/			

			Socket s = new Socket("192.168.0.16", 3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
