package quiz;

import java.util.Scanner;

public class B11_count_369_clap {
	
	public static void main(String[] args) {
		
		//사용자로부터 정수 하나를 입력받고
		//해당 숫자까지 369게임이 진행된다면 박수를 총 몇번 쳐야하는지 세어보세요
		
		//int를 String으로 변환 String str = "" + int타입;
		
		//프로그램 실행시간 측정
		long start_time = System.currentTimeMillis();
		
		int count =0;
		int n = 1;
		boolean debugmod = false; // 로그출력 on/off
		
		System.out.print("숫자 입력 > ");
		int input = new Scanner(System.in).nextInt();
		
		while(n<=input) {
			int i = n;
			int tmp = 0;
			while(i>0) {
				if(i%10==3 || i%10==6 || i%10==9) {
				tmp++;
				}
				i = i/10;
			}
			if(debugmod)System.out.printf("%d일때 %d번 \n",n,tmp);
			n++;
			count += tmp;
		}
		
		System.out.println();
		System.out.println(count + "번");
	
	}

}
