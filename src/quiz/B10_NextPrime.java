package quiz;

import java.util.Scanner;

public class B10_NextPrime {
	
	public static void main(String[] args) {
		
		// 사용자로 부터 숫자를 입력받으면
		// 입력받은 수보다 더 크거나 같은 다음 소수를 찾아서 출력
		
		System.out.printf("숫자 입력 > ");
		int uin = new Scanner(System.in).nextInt();
		
		for (int cin = uin;;cin++) {
			boolean prime = true;
			int sqrt = (int)Math.sqrt(cin);
			for (int j = 2; j <= sqrt; j++) {
				if (cin%j==0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.print("입력한 수 : " + uin + "  찾은수 : " + cin);
				break;
			}
		}
		
		
		
		
	}

}
