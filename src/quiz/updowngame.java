package quiz;

import java.util.Scanner;

public class updowngame {
	
	public static void main(String[] args) {
		
//		��ǻ�Ͱ� 0���� 1000 ������ ������ �����ϸ�
//		����ڰ� ���ڸ� �Է��Ͽ� ������ ���ߴ� ������ ��������
//
//		����ڰ� ���ڸ� �Է����� �� ��Ȳ���� �˸��� ������ ����ؾ� �մϴ�
//		����ڰ� ������ ���ڰ� ���亸�� ���� ������ ��� - UP!
//		����ڰ� ������ ���ڰ� ���亸�� ���� ������ ��� - DOWN!
//		����ڰ� ������ ������ - ����!
//
//		���� ����� �����̾��� ���ڿ� ���±����� �� �õ�Ƚ���� ����ؾ� �մϴ�.
//		����� > 5
//		UP!
//		����� > 577
//		DOWN!
//		����� > 400
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*1001);
		int uin=-1;
		int count = 0;
		while(uin!=num) {
			System.out.println("���ڸ� �Է��ϼ���");
			System.out.print("> ");
			uin = sc.nextInt();
			if(uin>num) {
				System.out.println("Down!");
			}else if(uin<num){
				System.out.println("UP!");
			}
			count++;
		}
		System.out.println("����!\n");
		System.out.printf("������ %d    �� %dȸ �õ�",num,count);
		
		
	}

}
