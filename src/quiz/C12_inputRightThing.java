package quiz;

import java.util.Scanner;

public class C12_inputRightThing {
	
	//사용자로부터 int타입의 데이터를 입력받고 출력해 보세요.
	//잘못된 타입의 데이터가 들어오더라도 프로그램이 종료되지 않아야 합니다.
	//올바르게 int가 입력된 경우 프로그램이 종료됨
	
	public static int input(String s) {
		int input;
		while(true) {
			System.out.print(s);
			try {
				input = new Scanner(System.in).nextInt();
				System.out.println("입력하신 숫자는 : "+input);
				return input;
			} catch (Exception e) {
				System.err.println("\n잘못된입력\n");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(input("숫자를입력하세요 : "));
		
		
		
		
		
		
	}

}
