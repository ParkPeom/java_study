package 포멧;

import java.text.DateFormat;
import java.text.SimpleDateFormat; // text 패키지 
import java.util.Calendar;

public class FormatTest {
	public FormatTest() {
		// 날짜 데이터를 출력시 원하는 패턴으로 만들고자 할때 사용하는 클래스
		Calendar now = Calendar.getInstance();
		
		// 202
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss(a)");
		String dataStr = fmt.format(now.getTime());
		System.out.println(dataStr);
	}
	public static void main(String[] args) {
		new FormatTest();
	}
}
