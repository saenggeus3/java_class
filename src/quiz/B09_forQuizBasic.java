package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {
	
	public static void main(String[] args) {
		
		//����ڰ� ���ڸ� �Է����� ��
		//1. 10���� �Է��� ���ڱ����� ������ ����
		//2. 1���� �Է��� ���� ������ 3�� ����� ��� ����ϰ� �� �� �� ������ ����غ�����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� >");
		int uin = sc.nextInt();
		
		System.out.println("\n\n");
		
		int sum = 0;
		
		if(uin>10) {
			for (int i = 10; i <= uin; i++) {
				sum+=i;
			}
		}else {
			for (int i = 10; i >= uin; i--) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
		
		
		System.out.println("\n\n");
		
		
		int sum2=0;
		int count = 0;
		if (uin>0) {
			for (int i = 1; i <= uin; i++) {
				if(i%3==0) {
					System.out.println(i);
					sum2+=i;
					count++;
				}
			}
		}else {
			for (int i = 1; i >= uin; i--) {
				if (i==0)continue;
				if (i%3==0) {
					System.out.println(i);
					sum2-=i;
					count++;
				}
			}
		}
		
		System.out.println(count + "��");
		
	}

}
