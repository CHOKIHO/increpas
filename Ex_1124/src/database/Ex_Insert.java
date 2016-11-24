
package database;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Ex_Insert {

	public static void main(String[] args) {

		try {
				Class c = Class.forName("oracle.jdbc.OracleDriver");
				
/*				Method[] m = c.getMethods();
				
				for (int i=0;i<m.length;i++) {
					System.out.println(m[i].toString());
				}*/
				
				String url ="jdbc:oracle:thin:@localhost:1521:xe";
				String user = "system";
				String pwd = "1111";
				
				Connection con = DriverManager.getConnection(url, user, pwd);
				
				Statement st = con.createStatement();
				
				int result=0;
				
				//result = st.executeUpdate("insert into TEST_TABLE values ('김길동', 30)");
				//System.out.println("result :" + result );
				
				Scanner sc = new Scanner(System.in);
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				String sql ="insert into TEST_TABLE values('" + name + "'," + age + ")";
						
				result = st.executeUpdate(sql);

				System.out.println("result :" + result );
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
