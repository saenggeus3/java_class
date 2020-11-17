package quiz;

import java.util.Scanner;

public class B05_Palindrome {
	
	public static void main(String[] args) {
		
		//사용자로부터 단어 하나를 입력받고
		//해당 단어가 회문이라면 "PALINDROME" 을출력
		//회문이 아니라면 "NOT PALINDROME" 을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력해주세요 > ");
		String uin = sc.nextLine();
		int check = 0;
		int len = uin.length()-1;
		
		if(len<=0) {
			System.out.println("잘못된 입력");
			check = 2;
		}else {
			for (int i = 0; i < uin.length()/2; i++) {
				if(uin.charAt(i)!=uin.charAt(len)) {
					check = 1;
					break;
				}
				len--;
			}
		
	}
		
		if (check==0) System.out.println("PALINDROME");
		else if(check==1) System.out.println("NOT PALINDROME");
		
		
		sc.close();
	}

}
