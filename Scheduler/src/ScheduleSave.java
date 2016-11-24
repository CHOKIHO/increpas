import java.io.*;
import java.util.*;

public class ScheduleSave{
	private int no;
	private int year;
	private int month;
	private int day;
	private String memo;

	public ScheduleSave(){}

	public ScheduleSave(String st){
		StringTokenizer token = new StringTokenizer(st,";");
			this.no = Integer.parseInt(token.nextToken());
			this.year = Integer.parseInt(token.nextToken());
			this.month = Integer.parseInt(token.nextToken());
			this.day = Integer.parseInt(token.nextToken());
			this.memo = token.nextToken();

	}

	public void setNo(Vector schedule){
		int maxno=0;
		for(int i=0;i<schedule.size();i++){
			if(maxno<((ScheduleSave)schedule.get(i)).getNo()){
				maxno = ((ScheduleSave)schedule.get(i)).getNo();
			}
		}
		this.no=maxno+1;
	}

	public int getNo(){
		return no;
	}
	
	public boolean setYear(int year){
		if(year<1900 || year>3000) return false;
		else this.year = year; return true;
	}

	public int getYear(){
		return year;
	}

	public boolean setMonth(int month){
		if(month < 1 || month > 12) return false;
		else this.month = month; return true;

	}

	public int getMonth(){
		return month;
	}

	public boolean setDay(int day){
		Calendar cal2 = Calendar.getInstance();
		cal2.set(cal2.YEAR,this.year); 
		cal2.set(cal2.MONTH,this.month);
		
		int fday2 = cal2.getActualMinimum(cal2.DAY_OF_MONTH);
		int eday2 = cal2.getActualMaximum(cal2.DAY_OF_MONTH);

		if(day>eday2 || day<1) return false;
		else this.day = day; return true;

	}

	public int getDay(){
		return day;
	}

	public boolean setMemo(String memo){
		if(memo.length()>30 || memo.length()<1){
			return false;
		}
		else{
		//	for(int me=0; me<=memo.length();me++){
		//		if(memo.charAt(me)==";" || memo.charAt(me)==" ") return false;
		//		else 
					this.memo = memo; return true;
		//	}
		}
	}

	public String getMemo(){
		return memo;
	}



}

