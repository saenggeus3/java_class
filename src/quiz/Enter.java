package quiz;

import java.util.Scanner;

public class Enter {
	
//	����ڰ� �ð��� ���� ������� �Է��Ѵ�.
//	9�� 10�� �����̶�� "����"��, 9�� 10�� ���Ķ�� "����"��, ���� 3�� ���Ķ�� "�Ἦ"�� ����Ѵ�.
//	���������� ���� �ð� �Ǵ� ���� �Էµȴٸ� "����"�� ����Ѵ�.
//	(��, �ð��� 24�ð����� �Է¹޴´�)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ð��� �Է��ϼ���");
		System.out.print("> ");
		int h = sc.nextInt();
		System.out.println("���� ���� �Է��ϼ���");
		System.out.print("> ");
		int m = sc.nextInt();
		
		System.out.println(h + ":" + m);
		
		if(h>24 || h<0 || m<0 || m>59) {
			System.out.println("����");
			return;
		}
		System.out.println();
		if(h<9) {
			System.out.println("����");
		}else if(h==9 && m<11) {
			System.out.println("����");
		}else if(h>=9 && h<15) {
			System.out.println("����");
		}else if(h>=15){
			System.out.println("�Ἦ");
		}
		
		
		
//		1. intŸ�� ���� a�� Ȧ���� �� true
//		2. charŸ�� ���� ch�� �����ڰ� �ƴ� �� true
//		3. booleanŸ�� ���� complete�� false�� �� true
//		4. StringŸ�� �������� str�� "yes"�� �� true
//		5. StringŸ�� �������� command�� 8������ �� true
//		6. StringŸ�� �������� command�� �� ��° ���ڰ� ��/�ҹ��� ������� q�϶� true
		
//		int a = 3;
//		char ch = '1';
//		boolean complete = false;
//		String str = "yes";
//		String command ="abqdefgh";
//		
//		if (command.charAt(2)=='q' || command.charAt(2)=='Q') {
//			System.out.println("com");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
