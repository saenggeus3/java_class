package quiz;

import java.util.Scanner;

public class B01_celToFahr {

	
	public static void main(String[] args) {
		
		//����ڷκ��� ���� �µ��� �Է¹޾� ȭ���µ��� ��ȯ�Ͽ� ��� (�Ҽ� ù° �ڸ�����)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �µ��� �Է����ּ��� > ");
		double c = sc.nextDouble();
		
		//(�����µ� X 1.8) + 32
		
		System.out.println("ȭ���µ��� " + (c*1.8 + 32) + "�� �Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
	
}
