package default_package;

/**
 문서화 주석
 이클립스가 이 설명을 읽어줌
 */

// ctrl + y <--> ctrl + z
// tab <--> shif + tab

// public class의 이름은 반드시 파일명과 같아야 함
public class A00_Hello {
// 에러가생겨 나온 빨간줄에 커서를 올리고 F2를 누르면 해당에러에 대한 정보와 해결책을 볼 수 있음
	
	// main() 함수
	// 프로그램의 시작 지점
	// 프로그램을 시작하면 가장 먼저 main() 함수를 찾아 실행시킴
	// main() 함수의 범위는 중괄호로 결정됨
	public static void main(String[] args) {//프로그램의 시작지점
		
		// System.out.println() 함수
		// ()안에 전달한 데이터를 콘솔에 출력하는 함수 
		
		// 함수란
		// 단어 뒤에 ()가 붙어 있는 것은 모두 함수
		
		// 콘솔이란
		// 글자만 나오는 검은 화면 (옛 컴퓨터 화면)
		// Eclipse에서 테스트용으로 하얀 바탕의 콘솔을 제공하는 것 뿐
		// 실제로 작성한 프로그램을 검은화면에서 실행하면 검은 화면에 출력됨
		
		System.out.println("Hello, world!");
		System.out.println("Hello, world!");
		System.out.println("Hello, world!");
		
		//자바의 데이터
		
		// 1. "" 사이에 적는 것 - 문자열 (String)
		System.out.println("hi 안녕");
		
		// 2. 숫자 : 정수 (int, Integer)
		System.out.println(123);
		System.out.println(123*2);
		System.out.println(123+100);
		
		// 3. 소수 : 실수 (Double, Float)
		System.out.println(123.1234567);	// 기본은 double
		System.out.println(123.123456f);	// f를 붙이면 float
		
		// 4. '' 사이에 적는 것 - 문자 (Character) 문자 단 하나
		// 문자를 여러개 넣으면 에러가 발생
		System.out.println('d');
		System.out.println('ㅇ');
		System.out.println('%');
		
		// 문자가 실제로 가지고 있는 숫자값 보기
		System.out.println("家의 코드값 : " + (int)'家');
		System.out.println("$의 코드값 : " + (int)'$');
		System.out.println("가의 코드값 : " + (int)'가');
		
		System.out.println((char)45012);
		
		
		// 다른타입 + 정수
		//문자열 + 정수는 이어붙임
		System.out.println("123" + 456);
		
		//실수 + 정수는 실수가 됨
		System.out.println(1234.56 + 10);
		
		//문자 + 정수는 ??
		 System.out.println('탁' + 100);
		 
		// ; (세미콜론) - 한 명령어가 끝났음을 알림
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//프로그램의 끝

}

//실행 ctrl + F11