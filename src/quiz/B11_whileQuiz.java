package quiz;

public class B11_whileQuiz {
	
	public static void main(String[] args) {
		
		//while���� �̿��Ͽ�
		
		// 1. 1���� 100������ 3�� ����� ������ ���ض�
		
		// 2. 200���� 1���� ���
		
		// 3. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ������ ���ض�
		
		int n = 1;
		int total = 0;
		
		while(n<=100) {
			if (n%3==0) {
				total+=n;
			}
			n++;
		}
		
		System.out.println(total);
		
		n=200;
		while(n>0) {
			System.out.println(n);
			n--;
		}
		
		n=1;
		total = 0;
		while(n<=200) {
			if (n%2!=0 && n%3!=0) {
				total+=n;
			}
			n++;
		}
		
		System.out.println(total);
		
		
		
		
		
		
		
		
	}

}
