import java.io.*;
import java.util.*;

class ScheduleMain{

	public static void main(String[] args) throws Exception{	
		Vector schedule = new Vector();
		try{
			BufferedReader br = new BufferedReader(new FileReader(new File("Schedule.dat")));
			while(true){
				String filedata = br.readLine();
				if(filedata == null) break;
				else schedule.add(new ScheduleSave(filedata));
			}
		} catch(Exception e){
			System.out.println("오류");
		}

		ScheduleInput input = new ScheduleInput();
		Calendar cal = Calendar.getInstance();
		
		int tnyeondo = cal.get(Calendar.YEAR);
		int todaydal = cal.get(Calendar.MONTH)+1;
		int today = cal.get(Calendar.DATE); // 오늘 날짜
		int todayyoil = cal.get(Calendar.DAY_OF_WEEK); // 오늘의 요일	
		int fday = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
		int fdayyoil = cal.get(Calendar.DAY_OF_WEEK);
		int eday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		wh:while(true){
			input.clear();
			System.out.println();
			System.out.println("♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬");
			System.out.println("♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬");
			System.out.println("♬♬                                                  ♬♬");
			System.out.println("♬♬        일정 관리 프로그램                        ♬♬");
			System.out.println("♬♬                                                  ♬♬");
			System.out.println("♬♬        1)  일정 등록                             ♬♬");
			System.out.println("♬♬        2)  오늘의 일정 보기                      ♬♬");
			System.out.println("♬♬        3)  이 달의 일정 보기                     ♬♬");
			System.out.println("♬♬        4)  일정 검색                             ♬♬");
			System.out.println("♬♬        5)  프로그램 종료                         ♬♬");
			System.out.println("♬♬                                                  ♬♬");
			System.out.println("♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬");
			System.out.println("♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬");
			System.out.println();
			System.out.print("메뉴를 선택하세요.(1~5) ");

			try{
				switch(Integer.parseInt(input.in.readLine())){
					case 1 : // 일정 등록
						ScheduleSave s = input.inputSchedule(schedule);
						schedule.add(s);

						input.clear();
						System.out.println();
						System.out.println("날짜 : " + s.getYear() + " 년 " + s.getMonth() + " 월 " + s.getDay() + " 일");
						System.out.println("내용 : " + s.getMemo());
						System.out.println();
						
						PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("Schedule.dat"))));
						for(int temp = 0; temp<schedule.size();temp++){
							ScheduleSave a = (ScheduleSave)schedule.get(temp);
							pw.println(a.getNo() + ";" + a.getYear() + ";" + a.getMonth() + ";" + a.getDay() + ";" + a.getMemo());
						}
						pw.close();
						System.out.println("저장되었습니다. 2초후에 메인화면으로 돌아갑니다.");
						Thread.sleep(2000);
						break;
						
						

					case 2 : 
						input.clear();
						System.out.println("\t♬♬ 오늘의 일정 보기 ♬♬");
						System.out.print("\n" + tnyeondo + " 년 " + todaydal + " 월 " + today + " 일 ");
						if(todayyoil==1) System.out.print("일요일\n\n");
						else if(todayyoil==2) System.out.print("월요일\n\n");
						else if(todayyoil==3) System.out.print("화요일\n\n");
						else if(todayyoil==4) System.out.print("수요일\n\n");
						else if(todayyoil==5) System.out.print("목요일\n\n");
						else if(todayyoil==6) System.out.print("금요일\n\n");
						else if(todayyoil==7) System.out.print("토요일\n\n");
						
						int temp2=1;
						for(int temp1 = 0; temp1<schedule.size();temp1++){
							
							ScheduleSave b = (ScheduleSave)schedule.get(temp1);

							if(tnyeondo == b.getYear() && todaydal == b.getMonth() && today==b.getDay()){
								System.out.println(temp2 + ". " + b.getMemo());
								temp2++;
							}
						}
						while(true){
							System.out.print("\n프로그램을 종료하겠습니까?(y/n) ");
							String yn2 = input.in.readLine();
							if(yn2.equals("y") || yn2.equals("Y") || yn2.equals("ㅛ")){
								break wh;
							}
							else if(yn2.equals("n") || yn2.equals("N") || yn2.equals("ㅜ")){
								continue wh;
							}
							else continue;
						}

					case 3 :
						input.clear();
						System.out.println("\t♬♬ 이 달의 일정 보기 ♬♬");
						System.out.println("\n" + tnyeondo + " 년 " + todaydal + " 월 \n");
						
						while(true){
							
							for(int temp3=0;temp3<schedule.size();){
								if(((ScheduleSave)schedule.get(temp3)).getMonth() == todaydal && ((ScheduleSave)schedule.get(temp3)).getDay() == fday){
									System.out.println(fday + " 일 " + ((ScheduleSave)schedule.get(temp3)).getMemo());
									System.out.println();
									temp3++;
								}
								else{
									temp3++;
								}
							}
							if(fday==eday) break;
							fday++;
						}
						fday=1;
						while(true){
								System.out.print("\n프로그램을 종료하겠습니까?(y/n) ");
								String yn3 = input.in.readLine();
								if(yn3.equals("y") || yn3.equals("Y") || yn3.equals("ㅛ")){
									break wh;
								}
								else if(yn3.equals("n") || yn3.equals("N") || yn3.equals("ㅜ")){
									continue wh;
								}
							}

					case 4 : 
						input.clear();
						System.out.println("\t♬♬ 일정 검색 ♬♬");
						System.out.println("검색할 날짜를 입력하세요");
						for(int temp4=0; temp4<schedule.size(); temp4++){
							System.out.print("년도 : ");
							int searchYear = Integer.parseInt(input.in.readLine());
							System.out.println();
							System.out.print("월 : ");
							int searchMonth = Integer.parseInt(input.in.readLine());
							System.out.println();
							System.out.print("일 : ");
							int searchDay = Integer.parseInt(input.in.readLine());
							System.out.println();
							if(((ScheduleSave)schedule.get(temp4)).getYear() == searchYear && ((ScheduleSave)schedule.get(temp4)).getMonth() == searchMonth && ((ScheduleSave)schedule.get(temp4)).getDay() == searchDay){
								input.clear();
								System.out.println("날짜 : " + ((ScheduleSave)schedule.get(temp4)).getYear() + " 년 " + ((ScheduleSave)schedule.get(temp4)).getMonth() + " 월 " + ((ScheduleSave)schedule.get(temp4)).getDay() + " 일");
								System.out.println("내용 : " + ((ScheduleSave)schedule.get(temp4)).getMemo());
							}
							else{
								input.clear();
								System.out.println("날짜 : " + ((ScheduleSave)schedule.get(temp4)).getYear() + " 년 " + ((ScheduleSave)schedule.get(temp4)).getMonth() + " 월 " + ((ScheduleSave)schedule.get(temp4)).getDay() + " 일");
								System.out.println("일정이 없습니다");
							}
							while(true){
								System.out.print("\n프로그램을 종료하겠습니까?(y/n) ");
								String yn4 = input.in.readLine();
								if(yn4.equals("y") || yn4.equals("Y") || yn4.equals("ㅛ")){
									break wh;
								}
								else if(yn4.equals("n") || yn4.equals("N") || yn4.equals("ㅜ")){
									continue wh;
								}
							}
						}

						

					case 5 : // 프로그램 종료
						break wh;

					default : // 1~5 이외의 것이 입력될 때
						System.out.println();
						System.out.println("메뉴를 다시 선택하세요");
						Thread.sleep(1000);
						continue;
				} // try {}
			}catch(Exception e){
				System.out.println();
				System.out.println("메뉴를 다시 선택하세요");
				Thread.sleep(1000);
				continue;
			} // catch{}
		} // wh:while{}
	} // main{}
} // class ScheduleMain{}
			