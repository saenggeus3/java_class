package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {
	
	public static void main(String[] args) {
		
		// 점수를 입력받으면 해당하는 등급을 출력해주는 프로그램을 작성
		
		//90 이상 A
		//80 이상 B
		//70 이상 C
		//60 이상 D
		//그 외   F
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		
		if(score<0 || score>100) {
			System.out.println("다시입력해주세요");
			return; // main()을 종료함
			// System.exit(0); - 프로그램을 종료함
		}else if (score > 89) {
			System.out.println("A");
		}else if (score > 79) {
			System.out.println("B");
		}else if (score > 69) {
			System.out.println("C");
		}else if (score > 59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		
		
		
	}

}
