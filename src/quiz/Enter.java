package quiz;

import java.util.Scanner;

public class Enter {
	
//	사용자가 시간과 분을 순서대로 입력한다.
//	9시 10분 이전이라면 "정상"을, 9시 10분 이후라면 "지각"을, 오후 3시 이후라면 "결석"을 출력한다.
//	정상적이지 않은 시간 또는 분이 입력된다면 "에러"를 출력한다.
//	(단, 시간은 24시간제로 입력받는다)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 시간을 입력하세요");
		System.out.print("> ");
		int h = sc.nextInt();
		System.out.println("현재 분을 입력하세요");
		System.out.print("> ");
		int m = sc.nextInt();
		
		System.out.println(h + ":" + m);
		
		if(h>24 || h<0 || m<0 || m>59) {
			System.out.println("에러");
			return;
		}
		System.out.println();
		if(h<9) {
			System.out.println("정상");
		}else if(h==9 && m<11) {
			System.out.println("정상");
		}else if(h>=9 && h<15) {
			System.out.println("지각");
		}else if(h>=15){
			System.out.println("결석");
		}
		
		
		
//		1. int타입 변수 a가 홀수일 때 true
//		2. char타입 변수 ch가 영문자가 아닐 때 true
//		3. boolean타입 변수 complete가 false일 때 true
//		4. String타입 참조변수 str이 "yes"일 때 true
//		5. String타입 참조변수 command가 8글자일 때 true
//		6. String타입 참조변수 command의 세 번째 글자가 대/소문자 관계없이 q일때 true
		
//		int a = 3;
//		char ch = '1';
//		boolean complete = false;
//		String str = "yes";
//		String command ="abqdefgh";
//		
//		if (command.charAt(2)=='q' || command.charAt(2)=='Q') {
//			System.out.println("com");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
