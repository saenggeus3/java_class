package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B13_31game {
	
	public static void main(String[] args) {
		
		// 31게임
		// 컴퓨터와 사람이 번갈아가면서 숫자를 선택 (1,2,3)
		// 컴퓨터는 랜덤으로 숫자를 선택
		// 마지막에 31을 부르는 사람 혹은 컴퓨터가 패배
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int[] max = new int[31];
		
		while(true) {
			int count = 0;
			int i = 0;
			boolean turn = true; //ran.nextBoolean();
			if(turn) {
				while(true) {
					System.out.print("숫자 입력 : ");
					
					
					boolean ok = true;
					while(ok) {
						
						String input = sc.nextLine();
						String check[] = input.split(" ");
						for (int j = 0; j < check.length; j++) {
							if(count==0 && max[i]==(Integer.parseInt(check[j])-1)) {
								max[i]=(Integer.parseInt(check[j]));
								count++;
							}else if(max[i]==(Integer.parseInt(check[j])-1)) {
								++i;
								max[i]=(Integer.parseInt(check[j]));
								count++;
							}else {
								System.out.print("다시 입력하세요 : ");
								i-=j;
								count-=j;
								break;
							}
							
							if(j==check.length-1) {
								ok=false;
							}
							
						}
					}
					
					if(count==31) {
						System.out.println("패배!");
						break;
					}
					
						//System.out.println(i + " " + count + " " + max[i]);
					System.out.print("컴퓨터 : ");
					for (int j = 0; j < ran.nextInt(3)+1; j++) {
						System.out.print((max[i]+1)+ " ");
						max[i+1] = max[i]+1;
						count++;							i++;
					}
						
					System.out.println();
				}
					
			}else {
				
			}
			
			
		}
		
	}

}
