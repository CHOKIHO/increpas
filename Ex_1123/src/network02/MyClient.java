package network02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str = sc.nextLine();
		
		if (str.trim().length()>0) {
			
			Socket s = null;
			PrintWriter out = null;
			
			try {
				s = new Socket("192.169.0.16", 3001);

				out = new PrintWriter(s.getOutputStream());
				out.write(str);
				out.flush();
				
			} catch (IOException e) {

				e.printStackTrace();

			} finally {
				
				if (out != null) out.close();
				if (s !=null) s.close();
			}
		}
	}
}
