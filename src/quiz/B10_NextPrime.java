package quiz;

import java.util.Scanner;

public class B10_NextPrime {
	
	public static void main(String[] args) {
		
		// ����ڷ� ���� ���ڸ� �Է¹�����
		// �Է¹��� ������ �� ũ�ų� ���� ���� �Ҽ��� ã�Ƽ� ���
		
		System.out.printf("���� �Է� > ");
		int uin = new Scanner(System.in).nextInt();
		
		for (int cin = uin;;cin++) {
			boolean prime = true;
			int sqrt = (int)Math.sqrt(cin);
			for (int j = 2; j <= sqrt; j++) {
				if (cin%j==0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.print("�Է��� �� : " + uin + "  ã���� : " + cin);
				break;
			}
		}
		
		
		
		
	}

}
