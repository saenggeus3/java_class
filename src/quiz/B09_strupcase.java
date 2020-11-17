package quiz;

import java.util.Scanner;

public class B09_strupcase {
	
	public static void main(String[] args) {
		
		// "문자열".toUpperCase() - 문자열의 소문자 알파벳을 대문자로 변환
		// "문자열".toLowerCase() - 문자열의 대문자 알파벳을 소문자로 변환
		
		// 입력받은 문자열의 모든 알파벳을 대문자로 변환
		// 원본이 훼손되지 않고 새로운 문자열이 생성
		
		System.out.print("입력 > ");
		String str = new Scanner(System.in).nextLine();
		StringBuilder str2 = new StringBuilder("");
		
		for (int i = 0 , len = str.length(); i < len; i++) {
			char ch = str.charAt(i);
			if(ch < 'a' || ch > 'z') {
				str2.append(ch);
			}else {
				// 소문자를 대문자로 변환하는 방법
				// ch -= Math.abs('a' - 'A');
				ch-=32;
				str2.append(ch);
			}
		}
		
		System.out.println(str);
		System.out.println(str2);
		
	}

}
