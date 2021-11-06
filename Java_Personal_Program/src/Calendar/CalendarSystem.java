package Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarSystem {
	Scanner sc = new Scanner(System.in);	
	int year , month; 
	int lastDay = 31;
	Calendar now = Calendar.getInstance();
	
	public CalendarSystem() {
	}
	public void showmenu() {
		System.out.print("년도=");
		year = sc.nextInt();
		System.out.print("월=");
		month = sc.nextInt();
		calc();
		yundal();
		print();
	}
	public void calc() {
		int week = now.DAY_OF_WEEK; // 요일 1- > 일 , 2 -> 월 , 3 -> 화 , 4 -> 수 , 5 -> 목 , 6 -> 금 , 7 -> 토
		now.set(Calendar.YEAR, year);
		now.set(Calendar.DAY_OF_MONTH, month);
		System.out.println(String.format("\t\t%d년 %d월\t\t",now.get(Calendar.YEAR),now.get(Calendar.DAY_OF_MONTH)));
		String str ="";
		for(int i = 1; i <= Calendar.DAY_OF_WEEK; i++) {
			switch(i) {
			   case 1: str = "일"; break; case 2: str = "월"; break; case 3: str = "화"; break; case 4: str = "수"; break;
			   case 5: str = "목"; break; case 6: str = "금"; break; case 7: str = "토";
			}
			System.out.print(str + "\t");
		}
		System.out.println();
		// 4의 배수 이고 100의 배수가 아니면 윤년
		// 4의 배수이고 400의 배수이면 윤년
		// 윤년이면 2월은 29일까지 아니면 28일까지
		// 1, 3, 5, 7, 8, 10, 12 = 31일
		// 4, 6, 9, 11 = 30일
		}	
		public void yundal() {
				switch(month) {
				// 윤년 조건 
				case 2:
					if(year % 4==0 && year % 100 !=0 || year % 4 == 0 && year % 400 ==0) {
						lastDay = 29;
					} else {
						lastDay = 28; 
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					   lastDay = 30;
				}
			}
			public void print() {
				// 월의 첫 날짜
				int count = 0;
				for(int j = 0; j <= lastDay; j++) {	
					System.out.print(j + "\t");
						count++;
					if(count % 7 == 0) {
						System.out.println();
					} 
				}
			}
	public static void main(String[] args) {
		new CalendarSystem().showmenu();
	}
}
