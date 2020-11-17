package quiz;

import java.util.Scanner;

public class updowngame {
	
	public static void main(String[] args) {
		
//		컴퓨터가 0부터 1000 사이의 정답을 생성하면
//		사용자가 숫자를 입력하여 정답을 맞추는 게임을 만들어보세요
//
//		사용자가 숫자를 입력했을 때 상황별로 알맞은 정보를 출력해야 합니다
//		사용자가 선택한 숫자가 정답보다 낮은 숫자인 경우 - UP!
//		사용자가 선택한 숫자가 정답보다 높은 숫자인 경우 - DOWN!
//		사용자가 정답을 맞춘경우 - 정답!
//
//		게임 종료시 정답이었던 숫자와 여태까지의 총 시도횟수를 출력해야 합니다.
//		사용자 > 5
//		UP!
//		사용자 > 577
//		DOWN!
//		사용자 > 400
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*1001);
		int uin=-1;
		int count = 0;
		while(uin!=num) {
			System.out.println("숫자를 입력하세요");
			System.out.print("> ");
			uin = sc.nextInt();
			if(uin>num) {
				System.out.println("Down!");
			}else if(uin<num){
				System.out.println("UP!");
			}
			count++;
		}
		System.out.println("정답!\n");
		System.out.printf("정답은 %d    총 %d회 시도",num,count);
		
		
	}

}
