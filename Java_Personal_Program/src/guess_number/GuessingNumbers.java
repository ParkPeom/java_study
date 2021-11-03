package guess_number;

import java.util.Scanner;

public class GuessingNumbers {
	Scanner sc = new Scanner(System.in);
	int random = (int)(Math.random()*100)+1;
	int count;
	public GuessingNumbers() {
	}
	public void start() {
		System.out.println("정답 미리 공개 = " +random);
		while(true) {
			try {
			System.out.print("1부터 100사이 숫자 입력 = ");
			int choice = sc.nextInt();
			// 잘못된값을 받아서 throw 강제예외처리
			if(0 >= choice || choice > 100) {
				count++;
				throw new OutOfRangeException();
			}
			if(choice < random) {
				System.out.println("더 높게 입력해 주세요.");
				count++;
			}
			if(choice > random) {
				System.out.println("더 낮게 입력해 주세요.");
				count++;
			}
			if(choice == random) {
				count++;
				System.out.println(count + "번 만에 정답입니다.");
				break;
			}
		} catch(OutOfRangeException e) {
			System.out.println("1~100사이의 숫자를 입력해주세요.");
			}
		}
	}
	public static void main(String[] args) {
		new GuessingNumbers().start();
	}

}
