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
		System.out.print("�⵵=");
		year = sc.nextInt();
		System.out.print("��=");
		month = sc.nextInt();
		calc();
		yundal();
		print();
	}
	public void calc() {
		int week = now.DAY_OF_WEEK; // ���� 1- > �� , 2 -> �� , 3 -> ȭ , 4 -> �� , 5 -> �� , 6 -> �� , 7 -> ��
		now.set(Calendar.YEAR, year);
		now.set(Calendar.DAY_OF_MONTH, month);
		System.out.println(String.format("\t\t%d�� %d��\t\t",now.get(Calendar.YEAR),now.get(Calendar.DAY_OF_MONTH)));
		String str ="";
		for(int i = 1; i <= Calendar.DAY_OF_WEEK; i++) {
			switch(i) {
			   case 1: str = "��"; break; case 2: str = "��"; break; case 3: str = "ȭ"; break; case 4: str = "��"; break;
			   case 5: str = "��"; break; case 6: str = "��"; break; case 7: str = "��";
			}
			System.out.print(str + "\t");
		}
		System.out.println();
		// 4�� ��� �̰� 100�� ����� �ƴϸ� ����
		// 4�� ����̰� 400�� ����̸� ����
		// �����̸� 2���� 29�ϱ��� �ƴϸ� 28�ϱ���
		// 1, 3, 5, 7, 8, 10, 12 = 31��
		// 4, 6, 9, 11 = 30��
		}	
		public void yundal() {
				switch(month) {
				// ���� ���� 
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
				// ���� ù ��¥
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
