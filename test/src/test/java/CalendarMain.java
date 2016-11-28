package test.java;

import java.util.Calendar;
import java.util.Random;

public class CalendarMain {

	public static void main(String[] args) {

		
		
		Random r = new Random(Calendar.getInstance().getTimeInMillis());
		
		System.out.println(Calendar.getInstance().getTimeInMillis());
		
		System.out.println(r.nextInt(2));
		

		
		
	}

}
