package quiz;

import java.util.Arrays;

public class B14_Array2Quiz {
	
	public static void main(String[] args) {
		
		int[][] numArr = {
				{10, 10, 10, 10},
				{90, 50, 30, 70},
				{800, 500},
				{300, 300, 300}
		};
		
		//numArr의 총합과 평균(소수점 둘째자리까지)을 구해서 출력
		
		//numArr의 각 행의 합과 열의 합을 모두 구해서 출력
		//	0행의합 : 10 + 10 + 10 + 10
		//  0열의 합 : 10 + 90 + 800 + 300
		
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				sum+=numArr[i][j];
				count++;
			}
		}
		
		double avg = sum/(double)count;
		
		System.out.printf("numArr의 총합 : %d\nnumArr의 평균 : %.2f",sum,avg);
		
		System.out.println();
		
		System.out.println();
		
		for (int i = 0; i < numArr.length; i++) {
			int row = 0; //가로
			for (int j = 0; j < numArr[i].length; j++) {
				
				System.out.print(numArr[i][j] + " ");
				row += numArr[i][j];
			}
			System.out.print("\t\t" + i+"행의 합 : " + row);
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < numArr.length; i++) {
			int col = 0; //세로
			for (int j = 0; j < numArr.length; j++) {
				if(numArr[j].length-1<i) {
					System.out.print("    ");
					continue;
				}else {
					System.out.print(numArr[j][i] + " ");
					col += numArr[j][i];
				}
			}
			System.out.print("\t\t" + i+"열의 합 : " + col);
			System.out.println();
		}
		
		System.out.println();
		
		int[] rowSum = new int[numArr.length];
		int[] colSum = new int[4];
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				rowSum[i] += numArr[i][j];
				colSum[j] += numArr[i][j];
			}
		}
		
		System.out.println(Arrays.toString(rowSum));
		System.out.println(Arrays.toString(colSum));
		
		System.out.println(numArr[3][1]);
		System.out.println(Arrays.toString(numArr));

		
	}

}
