package 캘린더;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public CalendarTest() {
		// TODO Auto-generated constructor stub
	}
	public void start() {
		//날짜,시간에 관련된 현재 시스템의 모든 정보를 객체로 구해주는 클래스
		// 생성메서드가 protected이기 때문에 new 키워드로 객체 생성할수 없다
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		// 2001-11-04(목) 11:02:33
		// 1 : YEAR 2 : MONTH int형 숫자로 외우기보다 Calendar 클래스를 이용해서 
		int year = now.get(Calendar.YEAR); 
		int month = now.get(Calendar.MONTH)+1;//0->1월,1->2월 그래서 구한값에 +1 
		int day = now.get(Calendar.DAY_OF_MONTH);
		// 요일 구한다.
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일 1- > 일 , 2 -> 월 , 3 -> 화 , 4 -> 수 , 5 -> 목 , 6 -> 금 , 7 -> 토
		String str ="";
		switch(week) {
		  case 1: str ="일"; break;
		  case 2: str ="월"; break; case 3: str ="화"; break; case 4: str ="수"; break;
		  case 5: str ="목"; break; case 6: str ="금"; break; case 7: str ="토"; break;
		}
		// 시간
		int hour = now.get(Calendar.HOUR_OF_DAY); // 24시간 기준 , HOUR은 12시간 기준 
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.printf("%d년%d월%d일(%s) %d시%d분%d초\n",year,month,day,str,hour,minute,second);
		// 올해 며칠째인가 올해 몆주쨰인가 
		System.out.println("올해는 = " +now.get(Calendar.DAY_OF_YEAR) + "일째 입니다.");
		System.out.println("올해는 = " +now.get(Calendar.WEEK_OF_YEAR) + "주째 입니다.");
		
		// Calendar 객체의 날짜 정보 변경하기
		// set() 오버로딩
		// set(Calendar.Year() , 2022) 로 바꿀수있다. 
		//2022년/5월/10일 로 바꾸기  
		now.set(2022, 4, 10);
		// 2020,10,10
		now.set(2020, 9, 10, 17, 30); 
		// 년월일시분초중 1개의 정보만 변경할때 사용 
		now.set(Calendar.MONTH, 2);//월을 3월로
		
		year = now.get(Calendar.YEAR); 
		month = now.get(Calendar.MONTH)+1;//0->1월,1->2월 그래서 구한값에 +1 
		day = now.get(Calendar.DAY_OF_MONTH);		
		// 2021/11/4(목) 0:38:50(오후)
		int hourSet12 = now.get(Calendar.HOUR);
		int day1 = now.get(Calendar.AM_PM);
		String str2 ="";
//		String amPmTxt = (day1==0) ? "오전":"오후";
		if(day1 == 1) {
		    str2 = "오후";
		} else if(day1 == 0) {
			str2 = "오전";
		}
		System.out.printf("%d/%d/%d(%s) %d:%d:%d(%s)\n",year,month,day,str,hourSet12,minute,second,str2);
		
		//년월일 시분초의 +, -
		// 1000일 후는 언제 인가
//		now.add(Calendar.DATE, 1000);
		// 1000일 전은 언제 인가
//		now.add(Calendar.DATE, -1000);
		// 120시간 전 
		now.add(Calendar.HOUR, -120);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss(a)");
		String sdf = df.format(now.getTime());
		System.out.println("1000일 후는 = " + sdf);
		/////////////////////////////////////////////////////////////////
		// 123685 --> 1,236,485원
		// 정수를 화폐 단위로 format을 생성하여 문자열을 구한다.
		int money = 1236485;
		DecimalFormat dcf = new DecimalFormat("#,###원");
		String won = dcf.format(money);
 		System.out.println("decimalFormat --> " + won);
 		
 		// 소수점 으로 해보기 
 		double moneyDb1 = 525125211.42;
 		DecimalFormat dcf2 = new DecimalFormat("#,##.#원");
 		String won2 = dcf2.format(moneyDb1);
 		System.out.println("decimalFormat --> " + won2);
 		
 		// "1,236,485원" 패턴화된 문자를 -> 숫자형으로 변환하기  
 		NumberFormat nfm = NumberFormat.getInstance();
 		try {
			Number parseData = nfm.parse(won2);
			double wonDbl = parseData.doubleValue();
			System.out.println(wonDbl*0.1);
			//숫자로 바꾸가다 에러가 생기면 
		} catch (ParseException e) { 
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		new CalendarTest().start();
	}
}
