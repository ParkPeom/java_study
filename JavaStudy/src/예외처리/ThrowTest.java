package 예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowTest {
	int first , second , total;
	int result , result2;
	public ThrowTest() {
		// TODO Auto-generated constructor stub
	}
	public void start() {
		first = setMessage("첫번째 숫자");
		second = setMessage("두번째 숫자");
		total = first + second;
		total(total);
		div();
	}
	public int setMessage(String msg) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print(msg +" = ");
	try {
		result = sc.nextInt();
	} catch(InputMismatchException e) {
		System.out.println(e.getMessage());
	}
	return result;	
	}
	public void total(int total) {
		System.out.println("합계 = " + total);
	}
	
	public void div() {
	try {
		result2 = first / second;
		if(result2 >= 10) {
			throw new ThrowTestException();
		}
	} catch(NullPointerException e) {
		System.out.println(e.getMessage());
	} catch(ThrowTestException e) {
		System.out.println("몫은 10이상 나오면 안됩니다.");
	}
		System.out.println("나눗셈의 결과 몫은 =  " + result2);
	}
	public static void main(String[] args) {
		new ThrowTest().start();
	}
}
