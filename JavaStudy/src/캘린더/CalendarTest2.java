package Ķ����;

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
		// Calendar ��ü�� ��¥ ���� �����ϱ�
		// set() �����ε�
		// set(Calendar.Year() , 2022) �� �ٲܼ��ִ�. 
		//2022��/5��/10�� �� �ٲٱ�  
		now.set(2022, love, 10);
		
		year = now.get(Calendar.YEAR); 
		month = now.get(Calendar.MONTH)+1;//0->1��,1->2�� �׷��� ���Ѱ��� +1 
		day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year +" " + month + " " + day);
	
	
		//	year = now.get(Calendar.YEAR); 
		//	month = now.get(Calendar.MONTH)+1;//0->1��,1->2�� �׷��� ���Ѱ��� +1 
		//	day = now.get(Calendar.DAY_OF_MONTH);		
		//	// 2021/11/4(��) 0:38:50(����)
		//	int hourSet12 = now.get(Calendar.HOUR);
		//	int day1 = now.get(Calendar.AM_PM);
	}
}
