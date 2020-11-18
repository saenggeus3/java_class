package default_package;

public class A05_print {
	
	public static void main(String[] args) {
		
		//콘솔에 출력하기위한 여러가지 함수들

		//print()
		//줄을 자동으로 바꾸지 않으며 출력
		
		System.out.print("Hello,world");
		System.out.print("Hello,world");
		System.out.print("Hello,world ");
		
		//println()
		//줄을 자동으로 바꾸며 출력하는 함수
		//데이터 마지막에 \n을 추가하여 출력
		System.out.println("Hello, world!");
		System.out.println("Hello, world!");
		
		//printf()
		//서식문자를 이용해 출력할 수 있는 함수
		//	%d 	 : 10진수 정수 (decimal)
		// 	%x,X : 16진수 정수	(hexa decimal) (소문자로출력,대문자로출력)
		//	%o	 : 8진수 정수	(octal)
		//	%s	 : 문자열  	(String)
		//	%c	 : 문자		(Character)
		//	%f	 : 실수		
		
		int year = 2020;
		int month = 10;
		int day = 20;
		
		System.out.printf("%d년 %d월 %d일",year,month,day);
		System.out.printf("%x%x%X\n",10,11,12);
		System.out.printf("%f %.2f\n",123.1234561212232121,123.1234561212232121);
		System.out.printf("%d[%c],%x(16),%o(8)\n",65,65,65,65);
		
		
		// 서식문자 옵션
		
		//%숫자서식문자 : 숫자만큼 칸을 확보하여 오른쪽정렬하여 출력함
		System.out.printf("이름 : %15s\n", "Hong gildong");
		System.out.printf("나이 : %15d\n", 15);
		
		//%-숫자서식문자 : 숫자만큼 칸을 확보하여 왼쪽정렬하여 출력함
		System.out.printf("%-10s : Hong Gildong\n", "Fullname");
		System.out.printf("%-10s : 15\n", "AGE");
		
		//%0숫자서식문자 : 숫자만큼 칸을 확보한 뒤 빈 칸에 0을 채워 출력함
		System.out.printf("%010d\n",123);
		System.out.printf("%020f\n",123.123);
		
		//%+숫자서식문자 : 양수앞에 부호를 붙여 출력
		System.out.printf("오늘은 섭씨 %+d℃입니다.\n",-5);
		System.out.printf("오늘은 섭씨 %+d℃입니다.\n",5);
		
		//%.숫자f : 소수 자릿수를 설정
		System.out.printf("%f %.2f %.10f\n",123.123,123.123,123.123);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
