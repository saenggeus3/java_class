package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {
	
	public static void main(String[] args) {
		
		// ������ �Է¹����� �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ�
		
		//90 �̻� A
		//80 �̻� B
		//70 �̻� C
		//60 �̻� D
		//�� ��   F
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		int score = sc.nextInt();
		
		if(score<0 || score>100) {
			System.out.println("�ٽ��Է����ּ���");
			return; // main()�� ������
			// System.exit(0); - ���α׷��� ������
		}else if (score > 89) {
			System.out.println("A");
		}else if (score > 79) {
			System.out.println("B");
		}else if (score > 69) {
			System.out.println("C");
		}else if (score > 59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		
		
		
	}

}
