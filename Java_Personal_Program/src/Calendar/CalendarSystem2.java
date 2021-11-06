package Calendar;

import java.util.Calendar;

public class CalendarSystem2 {
	
	public CalendarSystem2() {}
	
	public CalendarSystem2(int year , int month) {
		start(year,month);
	}
	
	// DAY_OF_WEEK 1 ~ 7 ������ �����´�. ��~��
	// DAY_OF_MONTH ������ �����´�. 
	// AM_PM 1 ���� 0 ����
	// Calendar.WEEK_OF_MONTH  5��?
	// cal.getActualMinimum(�� ���������� �ð� ���� �־��� ������ �������� �ʵ��� �ּҰ��� ��ȯ�մϴ�.
	// getActualMaximum �� ���������� �ð� ���� �־��� ������ �������� �ʵ��� �ִ밪�� ��ȯ�մϴ�.
	
	public void start(int year , int month) { // ���� �Է��Ѱ� ����
		Calendar now = Calendar.getInstance();
		now.set(now.YEAR, year);
		now.set(now.MONTH, month - 1); // 1���� 0���� �����ؼ� -1 
		now.set(now.DAY_OF_MONTH , 1); // DAY_OF_MONTH�� 1�� ���� (���� ù��)
		int firstDay = now.getActualMinimum(now.DAY_OF_MONTH); //�̹��� ���� ��
		int lastDay = now.getActualMaximum(now.DAY_OF_MONTH); // �̹����� ������ �� 
		int week = now.get(now.DAY_OF_WEEK); // �� ���� ��ȯ �Ͽ���=1 ������=2
//		System.out.println(firstDay + " " + lastDay + " " + week );
		for(int i = 1; i < week; i++) { // ���� 
			System.out.printf("\t"," ");		
		}
		for(int i = 1; i <= lastDay; i++) { // ��� 
			System.out.printf("%d\t", i);
			if(week % 7 == 0) {
				System.out.println();
			}
			week++;
		}
	}
}
