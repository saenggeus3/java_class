package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {
	
	public static void main(String[] args) {
		
		//사용자가 입력한 문자열에 알파벳이 포함되어 있으면 true출력 없으면 false출력
		
		System.out.print("입력 > ");
		String str = new Scanner(System.in).nextLine();
		
		// length()함수를 한번만 호출하는 방식
		for (int i = 0,len = str.length(); i <= len-1 ; i++) {
			
			if(str.charAt(i) >= 'a' && str.charAt(i) <='z' ||
					str.charAt(i) >= 'A' && str.charAt(i) <='Z') {
				System.out.println("true");
				break;
			}
			if (i == str.length()-1) {
				System.out.println("false");
			}
		}
		
	}

}
