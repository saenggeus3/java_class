package quiz;

import java.util.Scanner;

public class B05_CheckWord {
	
	public static void main(String[] args) {
		
		//사용자로부터 단어를 하나 입력받고
		// 첫 뻔째 단어와 마지막 단어가 일치하면 ok출력
		// 아니라면 not ok 출력
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("단어를 입력해주세요 > ");
		String uin = sc.next();
		
		if(uin == null || uin == "") {
			System.out.println("잘못된 입력");
			return;
		}
		
		if(uin.length()>1) {
			if(uin.charAt(0)==uin.charAt(uin.length()-1)) {
				System.out.println("ok");
			}else {
				System.out.println("not ok");
			}
		}else {
			System.out.println("비교할 수 있는 단어가 입력되지않음");
			return;
		}
		
		
	}

}
