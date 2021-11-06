package 캘린더;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest2 {
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		int love = 4;
		
		int year;
		int month;
		int day;
		
		System.out.println(now.get(Calendar.YEAR));
		// Calendar 객체의 날짜 정보 변경하기
		// set() 오버로딩
		// set(Calendar.Year() , 2022) 로 바꿀수있다. 
		//2022년/5월/10일 로 바꾸기  
		now.set(2022, love, 10);
		
		year = now.get(Calendar.YEAR); 
		month = now.get(Calendar.MONTH)+1;//0->1월,1->2월 그래서 구한값에 +1 
		day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year +" " + month + " " + day);
	
	
		//	year = now.get(Calendar.YEAR); 
		//	month = now.get(Calendar.MONTH)+1;//0->1월,1->2월 그래서 구한값에 +1 
		//	day = now.get(Calendar.DAY_OF_MONTH);		
		//	// 2021/11/4(목) 0:38:50(오후)
		//	int hourSet12 = now.get(Calendar.HOUR);
		//	int day1 = now.get(Calendar.AM_PM);
	}
}
