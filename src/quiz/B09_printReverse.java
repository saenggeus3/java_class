package quiz;

import java.util.Scanner;

public class B09_printReverse {
	
	public static void main(String[] args) {
		
		//����ڰ� ������ �Է��ϸ� �׹����� �Ųٷ� ���
		
		Scanner sc = new Scanner(System.in);
		
		// ������������ ���ڿ��� ���� �ϼ���ų�� ������ �ӵ�������
		// String str = "hello";
		// str += ", world";
		
		// StringBuilder.reverse() - ������ ���ڿ��� �Ųٷ� ��������
		
		// # StringBuilder�� += ��� append() �Լ��� ���� ���ڿ��� ����
		StringBuilder str = new StringBuilder("hello");
		str.append(", world!");
		
		String build_result = str.toString();
		System.out.println(build_result);
		
		StringBuilder reverse = new StringBuilder("");
		
		System.out.print("������ �Է��ϼ��� > ");
		String uin = sc.nextLine();
		for (int i = uin.length(); i > 0; i--) {
			System.out.print(uin.charAt(i-1));
			reverse.append(uin.charAt(i-1));
		}
		
		System.out.println("\n" + reverse);
		
	}
}
