
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex_Delete {

	public static void main(String[] args) {

		try {
				Class c = Class.forName("oracle.jdbc.OracleDriver");
				
				String url ="jdbc:oracle:thin:@localhost:1521:xe";
				String user = "system";
				String pwd = "1111";

				Connection con = DriverManager.getConnection(url, user, pwd);
				
				Scanner sc = new Scanner(System.in);

				String sql ="delete from test_table where name=? and age=?";
				PreparedStatement ps = con.prepareStatement(sql);
				
				System.out.print("이름 : " );
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				ps.setString(1, name);
				ps.setInt(2, age);
				
				int count =  ps.executeUpdate();
				
				if (count>0) {
					System.out.println("삭제행수 : " + count);
				}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
