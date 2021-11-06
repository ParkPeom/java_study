package Calendar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalendarApp {
	Scanner sc = new Scanner(System.in);
	int year , month;
	
	public CalendarApp() throws CalendarException {
		try {
			System.out.print("�⵵�� �Է����ּ��� > ");
			year = sc.nextInt();
			System.out.print("�� �� �Է����ּ��� > ");
			month = sc.nextInt();
			if(month < 1 || month > 12) {
				throw new CalendarException("1���� 12���� ���ڸ� �Է����ּ���.");
			}
			System.out.printf("\t\t %d��%d�� \t\t\n",year,month);	
			System.out.print("��\t��\tȭ\t��\t��\t��\t��\n");
		} catch (InputMismatchException e) {
			System.out.println("���� �� ���ڸ� �Է����ּ���.");
		}
		new CalendarSystem2(year,month);
	}
	public static void main(String[] args) throws CalendarException {
		new CalendarApp();
	}
}
