package ����ó��;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowTest {
	int first , second , total;
	int result , result2;
	public ThrowTest() {
		// TODO Auto-generated constructor stub
	}
	public void start() {
		first = setMessage("ù��° ����");
		second = setMessage("�ι�° ����");
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
		System.out.println("�հ� = " + total);
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
		System.out.println("���� 10�̻� ������ �ȵ˴ϴ�.");
	}
		System.out.println("�������� ��� ���� =  " + result2);
	}
	public static void main(String[] args) {
		new ThrowTest().start();
	}
}
