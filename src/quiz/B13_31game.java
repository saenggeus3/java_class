package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B13_31game {
	
	public static void main(String[] args) {
		
		// 31����
		// ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� ���� (1,2,3)
		// ��ǻ�ʹ� �������� ���ڸ� ����
		// �������� 31�� �θ��� ��� Ȥ�� ��ǻ�Ͱ� �й�
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int[] max = new int[31];
		
		while(true) {
			int count = 0;
			int i = 0;
			boolean turn = true; //ran.nextBoolean();
			if(turn) {
				while(true) {
					System.out.print("���� �Է� : ");
					
					
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
								System.out.print("�ٽ� �Է��ϼ��� : ");
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
						System.out.println("�й�!");
						break;
					}
					
						//System.out.println(i + " " + count + " " + max[i]);
					System.out.print("��ǻ�� : ");
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
