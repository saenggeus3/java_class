package quiz;

import java.util.Scanner;

public class B10_GCD {
	
	public static void main(String[] args) {
		
		// 두 숫자를 입력받으면 두 숫자의 최대 공약수를 구해보세요
		// 최대공약수 : 두 숫자의 공약수 중 가장 큰 공약수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 두개 입력 > ");
		int uin1 = sc.nextInt(), uin2 = sc.nextInt();
		
		if (uin1 > uin2) {
			int tmp = uin1;
			uin1 = uin2;
			uin2 = tmp;
		}
		
		
		int GCD = 1;
		for (int i = 2;i <= uin1 ; i++) {
			if (uin1%i == 0 && uin2%i == 0) {
				GCD = i;
			}
		}
		
		
		System.out.println("내코드 " + GCD);
		
		
		int n;
		while(uin1!=0){
	        n = uin2%uin1;
	        uin2 = uin1;
	        uin1 = n;
	    }
		
		System.out.println("유클리드 호제법 " + uin2);
		
		
	}

}
