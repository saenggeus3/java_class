package quiz;

import java.util.Scanner;

public class B01_celToFahr {

	
	public static void main(String[] args) {
		
		//사용자로부터 섭씨 온도를 입력받아 화씨온도로 변환하여 출력 (소수 첫째 자리까지)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("섭씨 온도를 입력해주세요 > ");
		double c = sc.nextDouble();
		
		//(섭씨온도 X 1.8) + 32
		
		System.out.println("화씨온도는 " + (c*1.8 + 32) + "℉ 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
	
}
