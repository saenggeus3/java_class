package quiz;

import java.util.Scanner;

public class B01_wontoDollar {
	
	// �ѱ� ���� �Է��ϸ�
	// �޷� ���Ž� �󸶸� �ްԵǴ��� ������ִ� ���α׷��� ��������
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ݾ��� �Է����ּ��� > ");
		int won = sc.nextInt();
		
		double dollar = won / 1145.60;
		
		System.out.printf("�޷�ȯ�� %.2f$\n",dollar);
		System.out.printf("������������ %.2f$\n",dollar*0.9825);
		
		
		
		
		
		sc.close();
	}
	
	
	
	

}
