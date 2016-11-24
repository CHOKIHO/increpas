import java.io.*;
import java.util.*;

public class ScheduleInput{
	static void clear(){ // 화면 청소
		for(int i=0; i<=80;i++)
			System.out.println();
	}
	public BufferedReader in = new BufferedReader(new InputStreamReader (System.in));

	public ScheduleSave inputSchedule(Vector schedule) throws Exception{
		ScheduleSave save = new ScheduleSave();

		save.setNo(schedule);
		clear();
		System.out.println("\t♬♬ 일정 등록 ♬♬");
		System.out.println();
		System.out.println("등록할 일정의 날짜를 입력하세요.");
		Calendar cal3 = Calendar.getInstance();
		
		int tnyeondo3 = cal3.get(Calendar.YEAR);
		int todaydal3 = cal3.get(Calendar.MONTH)+1;
		int today3 = cal3.get(Calendar.DATE); // 오늘 날짜
		int todayyoil3 = cal3.get(Calendar.DAY_OF_WEEK); // 오늘의 요일	
		System.out.print("오늘 날짜 : " + tnyeondo3 + " 년 " +  todaydal3 + " 월 " + today3 + " 일 ");
		if(todayyoil3==1) System.out.print("일요일\n");
		else if(todayyoil3==2) System.out.print("월요일\n");
		else if(todayyoil3==3) System.out.print("화요일\n");
		else if(todayyoil3==4) System.out.print("수요일\n");
		else if(todayyoil3==5) System.out.print("목요일\n");
		else if(todayyoil3==6) System.out.print("금요일\n");
		else if(todayyoil3==7) System.out.print("토요일\n");

		while(true){
			System.out.println();
			System.out.print("년도 : ");
			if(save.setYear(Integer.parseInt(in.readLine()))) break;
			else System.out.println("오류! 다시 입력하세요.");
		}

		while(true){
			System.out.println();
			System.out.print("월 : ");
			if(save.setMonth(Integer.parseInt(in.readLine()))) break;
			else System.out.println("오류! 다시 입력하세요.");
		}

		while(true){
			System.out.println();
			System.out.print("일 : ");
			if(save.setDay(Integer.parseInt(in.readLine()))) break;
			else System.out.println("오류! 다시 입력하세요.");
		}
		
		while(true){
			System.out.println();
			System.out.println("등록할 내용을 입력하세요.(30자 이하) ");
			if(save.setMemo(in.readLine())) break;
			else System.out.println("오류! 다시 입력하세요.");
		}
		
	return save;
	}

}
