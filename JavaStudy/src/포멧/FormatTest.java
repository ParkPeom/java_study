package ����;

import java.text.DateFormat;
import java.text.SimpleDateFormat; // text ��Ű�� 
import java.util.Calendar;

public class FormatTest {
	public FormatTest() {
		// ��¥ �����͸� ��½� ���ϴ� �������� ������� �Ҷ� ����ϴ� Ŭ����
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
