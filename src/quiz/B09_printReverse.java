package quiz;

import java.util.Scanner;

public class B09_printReverse {
	
	public static void main(String[] args) {
		
		//사용자가 문장을 입력하면 그문장을 거꾸로 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 누적연산으로 문자열을 점차 완성시킬수 있지만 속도가느림
		// String str = "hello";
		// str += ", world";
		
		// StringBuilder.reverse() - 빌드한 문자열을 거꾸로 뒤집어줌
		
		// # StringBuilder는 += 대신 append() 함수를 통해 문자열을 만듬
		StringBuilder str = new StringBuilder("hello");
		str.append(", world!");
		
		String build_result = str.toString();
		System.out.println(build_result);
		
		StringBuilder reverse = new StringBuilder("");
		
		System.out.print("문장을 입력하세요 > ");
		String uin = sc.nextLine();
		for (int i = uin.length(); i > 0; i--) {
			System.out.print(uin.charAt(i-1));
			reverse.append(uin.charAt(i-1));
		}
		
		System.out.println("\n" + reverse);
		
	}
}
