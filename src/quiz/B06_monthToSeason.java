package quiz;

import java.util.Scanner;

public class B06_monthToSeason {
	
	// swtich_case문 사용
	// 사용자로부터 달을 입력 받으면 해당하는 계절을 출력
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달을 입력해주세요 > ");
		
		String mon = sc.next();
		
		switch (mon.charAt(0)) {
		case '1': case '2':  
			System.out.println("겨울입니다.");
			break;
		case '3': case '4': 
			System.out.println("봄입니다.");
			break;
		case '5': case '6': case '7': case '8':
			System.out.println("여름입니다.");
			break;
		case '9':
			System.out.println("가을입니다.");
			break;
		default:
			System.out.println("잘못된 입력");
			break;
		}
		
	}
	
	

}
