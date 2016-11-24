
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex_Select {

	public static void main(String[] args) {

		//오라클 DB 접속문자열
		/*
		 * ※ Library 추가 방법 (자바 리플렉션)
		 * 
		 * 프로젝트 > 프로퍼티 > Java Builder Path > Libraries > External Jars
		 * ojdbc14.jar 추가
		 * Referenced Libraries 에 ojdbc14.jar 추가됨
		 * 
		 */

		try {
				Class.forName("oracle.jdbc.OracleDriver");
				
				String url ="jdbc:oracle:thin:@localhost:1521:xe";
				String user = "system";
				String pwd = "1111";
				
				Connection con = DriverManager.getConnection(url, user, pwd);
				
				//SQL 쿼리 조회
				//Statement 인터페이스는 Connection에서 얻어온 정보로 만들어지며
				//sql문을 사용할수 있도록함.
				Statement st = con.createStatement();
				
				ResultSet rs = st.executeQuery("select * from TEST_TABLE");
				
				while(rs.next()) {
					System.out.printf("%s/%d", rs.getString("name"), rs.getInt("age"));
					
					//System.out.printf("%s/%d", rs.getString(1), rs.getInt(2));
					//int columnIndex는 1번부터 시작

					System.out.println();
				}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
