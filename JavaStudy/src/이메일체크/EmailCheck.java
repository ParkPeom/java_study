package �̸���üũ;

import java.util.Scanner;

/*
 	����
 	�̸����Է� = jkfdsk
 	�߸��� �̸��� �Դϴ�. �ٽ��Է��ϼ���.. ( "@" contains())
 	�̸����Է� = fjdkslf@fds    
 	�߸��� �̸��� �Դϴ�. �ٽ��Է��ϼ���..
 	
 	
 	�̸����Է� = jkfds.ksl@fds  // @ 64 �տ� . 46 �� ������ �ȵ� 
 
 	�߸��� �̸��� �Դϴ�. �ٽ��Է��ϼ���..
 	
 	�̸����Է� = abced@nate.com 
 	���̵�:abced
 	������:nate.com
 	�̸����Է� = 
 	
 	String���� �ް� �迭�� ����  ���� 
 	
 */
public class EmailCheck {
	
	public EmailCheck() {
		System.out.println("����");
	}
	public void print() {
		System.out.println("�߸��� �̸��� �Դϴ�. �ٽ��Է��ϼ���..");
	}
	
	public void start() {	
		while(true) {
			System.out.print("�̸��� �Է� = ");
			Scanner sc = new Scanner(System.in);
			String email = sc.nextLine();
			char[] emailch = email.toCharArray();
			
				System.out.println();
			}	
		// ���̵� ������ ��� 
	}
	public static void main(String[] args) {
		new EmailCheck().start();
	}
}
