package guess_number;

import java.util.Scanner;

public class GuessingNumbers {
	Scanner sc = new Scanner(System.in);
	int random = (int)(Math.random()*100)+1;
	int count;
	public GuessingNumbers() {
	}
	public void start() {
		System.out.println("���� �̸� ���� = " +random);
		while(true) {
			try {
			System.out.print("1���� 100���� ���� �Է� = ");
			int choice = sc.nextInt();
			// �߸��Ȱ��� �޾Ƽ� throw ��������ó��
			if(0 >= choice || choice > 100) {
				count++;
				throw new OutOfRangeException();
			}
			if(choice < random) {
				System.out.println("�� ���� �Է��� �ּ���.");
				count++;
			}
			if(choice > random) {
				System.out.println("�� ���� �Է��� �ּ���.");
				count++;
			}
			if(choice == random) {
				count++;
				System.out.println(count + "�� ���� �����Դϴ�.");
				break;
			}
		} catch(OutOfRangeException e) {
			System.out.println("1~100������ ���ڸ� �Է����ּ���.");
			}
		}
	}
	public static void main(String[] args) {
		new GuessingNumbers().start();
	}

}
