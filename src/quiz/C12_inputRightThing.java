package quiz;

import java.util.Scanner;

public class C12_inputRightThing {
	
	//����ڷκ��� intŸ���� �����͸� �Է¹ް� ����� ������.
	//�߸��� Ÿ���� �����Ͱ� �������� ���α׷��� ������� �ʾƾ� �մϴ�.
	//�ùٸ��� int�� �Էµ� ��� ���α׷��� �����
	
	public static int input(String s) {
		int input;
		while(true) {
			System.out.print(s);
			try {
				input = new Scanner(System.in).nextInt();
				System.out.println("�Է��Ͻ� ���ڴ� : "+input);
				return input;
			} catch (Exception e) {
				System.err.println("\n�߸����Է�\n");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(input("���ڸ��Է��ϼ��� : "));
		
		
		
		
		
		
	}

}
