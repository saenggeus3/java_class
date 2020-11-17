package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {
	
	public static void main(String[] args) {
		
		//사용자가 숫자를 입력했을 때
		//1. 10부터 입력한 숫자까지의 총합을 구함
		//2. 1부터 입력한 숫자 사이의 3의 배수만 모두 출력하고 총 몇 개 인지도 출력해보세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 >");
		int uin = sc.nextInt();
		
		System.out.println("\n\n");
		
		int sum = 0;
		
		if(uin>10) {
			for (int i = 10; i <= uin; i++) {
				sum+=i;
			}
		}else {
			for (int i = 10; i >= uin; i--) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
		
		
		System.out.println("\n\n");
		
		
		int sum2=0;
		int count = 0;
		if (uin>0) {
			for (int i = 1; i <= uin; i++) {
				if(i%3==0) {
					System.out.println(i);
					sum2+=i;
					count++;
				}
			}
		}else {
			for (int i = 1; i >= uin; i--) {
				if (i==0)continue;
				if (i%3==0) {
					System.out.println(i);
					sum2-=i;
					count++;
				}
			}
		}
		
		System.out.println(count + "개");
		
	}

}
