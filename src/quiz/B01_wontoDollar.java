package quiz;

import java.util.Scanner;

public class B01_wontoDollar {
	
	// 한국 돈을 입력하면
	// 달러 구매시 얼마를 받게되는지 계산해주는 프로그램을 만들어보세요
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매할 금액을 입력해주세요 > ");
		int won = sc.nextInt();
		
		double dollar = won / 1145.60;
		
		System.out.printf("달러환율 %.2f$\n",dollar);
		System.out.printf("수수료차감후 %.2f$\n",dollar*0.9825);
		
		
		
		
		
		sc.close();
	}
	
	
	
	

}
