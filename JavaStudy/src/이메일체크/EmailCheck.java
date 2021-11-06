package 이메일체크;

import java.util.Scanner;

/*
 	실행
 	이메일입력 = jkfdsk
 	잘못된 이메일 입니다. 다시입력하세요.. ( "@" contains())
 	이메일입력 = fjdkslf@fds    
 	잘못된 이메일 입니다. 다시입력하세요..
 	
 	
 	이메일입력 = jkfds.ksl@fds  // @ 64 앞에 . 46 이 있으면 안됨 
 
 	잘못된 이메일 입니다. 다시입력하세요..
 	
 	이메일입력 = abced@nate.com 
 	아이디:abced
 	도메인:nate.com
 	이메일입력 = 
 	
 	String으로 받고 배열로 구함  ㅇㅇ 
 	
 */
public class EmailCheck {
	
	public EmailCheck() {
		System.out.println("실행");
	}
	public void print() {
		System.out.println("잘못된 이메일 입니다. 다시입력하세요..");
	}
	
	public void start() {	
		while(true) {
			System.out.print("이메일 입력 = ");
			Scanner sc = new Scanner(System.in);
			String email = sc.nextLine();
			char[] emailch = email.toCharArray();
			
				System.out.println();
			}	
		// 아이디 도메인 출력 
	}
	public static void main(String[] args) {
		new EmailCheck().start();
	}
}
