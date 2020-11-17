package quiz;

//ctrl + shift + o : 자동 import
import java.util.Scanner;

public class B04_appleQuiz {
	
	
	public static void main(String[] args) {
		
		// 사과를 10개씩 담을 수 있는 바구니가 있을 때
		// 사용자가 사과의 개수를 입력입력하면 필요한 바구니의 개수를 출력
		
		// 변수앞에 final 이 붙으면 수정이 불가능한 변수가 됨
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사과의 개수를 입력하세요 > ");
		long app = sc.nextLong();
		
		if (app<0) {
			System.out.println("잘못된 수 입력");
		}else if(app%10==0) {
			System.out.println(app/10 + "개의 바구니가 필요합니다.");
		}else{
			System.out.println(app/10+1 + "개의 바구니가 필요합니다.");
		}
		
	}

}
