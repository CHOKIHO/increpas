
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex_Update {

	public static void main(String[] args) {

		try {
				Class c = Class.forName("oracle.jdbc.OracleDriver");
				
				String url ="jdbc:oracle:thin:@localhost:1521:xe";
				String user = "system";
				String pwd = "1111";

				Connection con = DriverManager.getConnection(url, user, pwd);
				
				Scanner sc = new Scanner(System.in);

				String sql ="update test_table set age=? where name=?";
				PreparedStatement ps = con.prepareStatement(sql);
				
				System.out.print("나이 : ");
				String age = sc.next();
				System.out.print("이름 : " );
				String name = sc.next();
				
				ps.setString(1, age);
				ps.setString(2, name);
				
				int count =  ps.executeUpdate();
				
				if (count>0) {
					System.out.println("update : " + count);
				}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
