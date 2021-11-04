package Ķ����;

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
		//��¥,�ð��� ���õ� ���� �ý����� ��� ������ ��ü�� �����ִ� Ŭ����
		// �����޼��尡 protected�̱� ������ new Ű����� ��ü �����Ҽ� ����
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		// 2001-11-04(��) 11:02:33
		// 1 : YEAR 2 : MONTH int�� ���ڷ� �ܿ�⺸�� Calendar Ŭ������ �̿��ؼ� 
		int year = now.get(Calendar.YEAR); 
		int month = now.get(Calendar.MONTH)+1;//0->1��,1->2�� �׷��� ���Ѱ��� +1 
		int day = now.get(Calendar.DAY_OF_MONTH);
		// ���� ���Ѵ�.
		int week = now.get(Calendar.DAY_OF_WEEK); // ���� 1- > �� , 2 -> �� , 3 -> ȭ , 4 -> �� , 5 -> �� , 6 -> �� , 7 -> ��
		String str ="";
		switch(week) {
		  case 1: str ="��"; break;
		  case 2: str ="��"; break; case 3: str ="ȭ"; break; case 4: str ="��"; break;
		  case 5: str ="��"; break; case 6: str ="��"; break; case 7: str ="��"; break;
		}
		// �ð�
		int hour = now.get(Calendar.HOUR_OF_DAY); // 24�ð� ���� , HOUR�� 12�ð� ���� 
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.printf("%d��%d��%d��(%s) %d��%d��%d��\n",year,month,day,str,hour,minute,second);
		// ���� ��ĥ°�ΰ� ���� �p�֤��ΰ� 
		System.out.println("���ش� = " +now.get(Calendar.DAY_OF_YEAR) + "��° �Դϴ�.");
		System.out.println("���ش� = " +now.get(Calendar.WEEK_OF_YEAR) + "��° �Դϴ�.");
		
		// Calendar ��ü�� ��¥ ���� �����ϱ�
		// set() �����ε�
		// set(Calendar.Year() , 2022) �� �ٲܼ��ִ�. 
		//2022��/5��/10�� �� �ٲٱ�  
		now.set(2022, 4, 10);
		// 2020,10,10
		now.set(2020, 9, 10, 17, 30); 
		// ����Ͻú����� 1���� ������ �����Ҷ� ��� 
		now.set(Calendar.MONTH, 2);//���� 3����
		
		year = now.get(Calendar.YEAR); 
		month = now.get(Calendar.MONTH)+1;//0->1��,1->2�� �׷��� ���Ѱ��� +1 
		day = now.get(Calendar.DAY_OF_MONTH);		
		// 2021/11/4(��) 0:38:50(����)
		int hourSet12 = now.get(Calendar.HOUR);
		int day1 = now.get(Calendar.AM_PM);
		String str2 ="";
//		String amPmTxt = (day1==0) ? "����":"����";
		if(day1 == 1) {
		    str2 = "����";
		} else if(day1 == 0) {
			str2 = "����";
		}
		System.out.printf("%d/%d/%d(%s) %d:%d:%d(%s)\n",year,month,day,str,hourSet12,minute,second,str2);
		
		//����� �ú����� +, -
		// 1000�� �Ĵ� ���� �ΰ�
//		now.add(Calendar.DATE, 1000);
		// 1000�� ���� ���� �ΰ�
//		now.add(Calendar.DATE, -1000);
		// 120�ð� �� 
		now.add(Calendar.HOUR, -120);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss(a)");
		String sdf = df.format(now.getTime());
		System.out.println("1000�� �Ĵ� = " + sdf);
		/////////////////////////////////////////////////////////////////
		// 123685 --> 1,236,485��
		// ������ ȭ�� ������ format�� �����Ͽ� ���ڿ��� ���Ѵ�.
		int money = 1236485;
		DecimalFormat dcf = new DecimalFormat("#,###��");
		String won = dcf.format(money);
 		System.out.println("decimalFormat --> " + won);
 		
 		// �Ҽ��� ���� �غ��� 
 		double moneyDb1 = 525125211.42;
 		DecimalFormat dcf2 = new DecimalFormat("#,##.#��");
 		String won2 = dcf2.format(moneyDb1);
 		System.out.println("decimalFormat --> " + won2);
 		
 		// "1,236,485��" ����ȭ�� ���ڸ� -> ���������� ��ȯ�ϱ�  
 		NumberFormat nfm = NumberFormat.getInstance();
 		try {
			Number parseData = nfm.parse(won2);
			double wonDbl = parseData.doubleValue();
			System.out.println(wonDbl*0.1);
			//���ڷ� �ٲٰ��� ������ ����� 
		} catch (ParseException e) { 
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		new CalendarTest().start();
	}
}
