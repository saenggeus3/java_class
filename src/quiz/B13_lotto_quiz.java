package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_lotto_quiz {
	
	public static void main(String[] args) {
		
		// 1부터 45까지의 중복없는 랜덤 숫자 6개로 이루어진 배열을 생성
		
		Random ran = new Random();
//		int[] number = new int[45];
//		for (int i = 0; i < number.length; i++) {
//			number[i] = i + 1;
//		}
//		
//		
//		for (int i = 0 ; i < 5000; i++) {
//			int random_index = ran.nextInt(44+1);
//			
//			int tmp = number[0];
//			number[0] = number[random_index];
//			number[random_index] = tmp;
//		}
		
		
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < 6; i++) {
			int num = (int)(Math.random()*45+1);
			
			for (int j = 0; j < i; j++) {
				if(lotto[j]==num) {
					num = (int)(Math.random()*45+1);
					j=0;
				}
			}
			lotto[i] = num;
			
		}
		
		Arrays.sort(lotto); // 배열을 오름차순으로 정렬
		
		System.out.println(Arrays.toString(lotto));
		
		
		
		
		
	}

}
