package quiz;

import java.util.Scanner;

public class B01_GuessAge {
	
	public static void main(String[] args) {
		
		// ����ڷκ��� ������ �⵵�� ���̸� �Է¹�����
		// �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����⵵�� �Է����ּ��� > ");
		int year = sc.nextInt();
		System.out.println("����⵵�� �Է����ּ��� > ");
		int birthYear = sc.nextInt();
		
		System.out.println(year-birthYear+1 + "���Դϴ�.");
		
		
		
		
		
		
		
		sc.close();
	}

}
