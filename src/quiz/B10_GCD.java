package quiz;

import java.util.Scanner;

public class B10_GCD {
	
	public static void main(String[] args) {
		
		// �� ���ڸ� �Է¹����� �� ������ �ִ� ������� ���غ�����
		// �ִ����� : �� ������ ����� �� ���� ū �����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ΰ� �Է� > ");
		int uin1 = sc.nextInt(), uin2 = sc.nextInt();
		
		if (uin1 > uin2) {
			int tmp = uin1;
			uin1 = uin2;
			uin2 = tmp;
		}
		
		
		int GCD = 1;
		for (int i = 2;i <= uin1 ; i++) {
			if (uin1%i == 0 && uin2%i == 0) {
				GCD = i;
			}
		}
		
		
		System.out.println("���ڵ� " + GCD);
		
		
		int n;
		while(uin1!=0){
	        n = uin2%uin1;
	        uin2 = uin1;
	        uin1 = n;
	    }
		
		System.out.println("��Ŭ���� ȣ���� " + uin2);
		
		
	}

}
