package quiz;

import java.util.Scanner;

public class B01_GuessAge {
	
	public static void main(String[] args) {
		
		// 사용자로부터 올해의 년도와 나이를 입력받으면
		// 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어보세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재년도를 입력해주세요 > ");
		int year = sc.nextInt();
		System.out.println("출생년도를 입력해주세요 > ");
		int birthYear = sc.nextInt();
		
		System.out.println(year-birthYear+1 + "살입니다.");
		
		
		
		
		
		
		
		sc.close();
	}

}
