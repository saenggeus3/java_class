package quiz;

import java.util.Scanner;

public class B11_count_369_clap {
	
	public static void main(String[] args) {
		
		//����ڷκ��� ���� �ϳ��� �Է¹ް�
		//�ش� ���ڱ��� 369������ ����ȴٸ� �ڼ��� �� ��� �ľ��ϴ��� �������
		
		//int�� String���� ��ȯ String str = "" + intŸ��;
		
		//���α׷� ����ð� ����
		long start_time = System.currentTimeMillis();
		
		int count =0;
		int n = 1;
		boolean debugmod = false; // �α���� on/off
		
		System.out.print("���� �Է� > ");
		int input = new Scanner(System.in).nextInt();
		
		while(n<=input) {
			int i = n;
			int tmp = 0;
			while(i>0) {
				if(i%10==3 || i%10==6 || i%10==9) {
				tmp++;
				}
				i = i/10;
			}
			if(debugmod)System.out.printf("%d�϶� %d�� \n",n,tmp);
			n++;
			count += tmp;
		}
		
		System.out.println();
		System.out.println(count + "��");
	
	}

}
