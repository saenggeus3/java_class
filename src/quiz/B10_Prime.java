package quiz;

import java.util.Scanner;

public class B10_Prime {
	
	public static void main(String[] args) {
		
		//����ڷκ��� ���ڸ� �Է¹�����
		//1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ���
		
		// �Ҽ� : ����� 1�� �ڱ� �ڽŹۿ� ���� ����
		
		System.out.print("�����Է� > ");
		int n = new Scanner(System.in).nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			boolean prime = true;
			for (int j = 2; j*j <= i; j++) { // j <= (int)Math.sqrt(i) �������� ã�� ���
				if (i%j==0) {
					prime = false;
					break;
				}
			}
			if(prime)System.out.print(i+" ");
		}
	}
}
