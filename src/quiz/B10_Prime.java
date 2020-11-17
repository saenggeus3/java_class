package quiz;

import java.util.Scanner;

public class B10_Prime {
	
	public static void main(String[] args) {
		
		//사용자로부터 숫자를 입력받으면
		//1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력
		
		// 소수 : 약수가 1과 자기 자신밖에 없는 숫자
		
		System.out.print("숫자입력 > ");
		int n = new Scanner(System.in).nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			boolean prime = true;
			for (int j = 2; j*j <= i; j++) { // j <= (int)Math.sqrt(i) 제곱근을 찾는 방법
				if (i%j==0) {
					prime = false;
					break;
				}
			}
			if(prime)System.out.print(i+" ");
		}
	}
}
