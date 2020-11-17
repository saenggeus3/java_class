package quiz;

import java.util.Scanner;

public class B11_reverse_number {
	
	public static void main(String[] args) {
		
		// 사용자로부터 정수를 하나 입력받고
		// 그 정수를 일의 자리부터 순서대로 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 > ");
		int input = sc.nextInt();
		
		if (input==0) {
			System.out.println("0");
		}else if (input<0) {
			input = input*-1;
			System.out.print("-");
			while(input>0) {
				System.out.print(input%10);
				input=input/10;
			}
		}else {
			while(input>0) {
				System.out.print(input%10);
				input=input/10;
			}
		}
		
		
		
	}

}
