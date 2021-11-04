package Ä¶¸°´õ;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest2 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		int y,m;
		System.out.println("¸î³âµµ ´Þ·Â Èñ¸Á?");
		y = sc.nextInt();
		
		for(int j = 1; j <= 12; j++) {
			cal.set(y, j);
		}
	}
}
