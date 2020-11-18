package default_package;

public class A05_print {
	
	public static void main(String[] args) {
		
		//�ֿܼ� ����ϱ����� �������� �Լ���

		//print()
		//���� �ڵ����� �ٲ��� ������ ���
		
		System.out.print("Hello,world");
		System.out.print("Hello,world");
		System.out.print("Hello,world ");
		
		//println()
		//���� �ڵ����� �ٲٸ� ����ϴ� �Լ�
		//������ �������� \n�� �߰��Ͽ� ���
		System.out.println("Hello, world!");
		System.out.println("Hello, world!");
		
		//printf()
		//���Ĺ��ڸ� �̿��� ����� �� �ִ� �Լ�
		//	%d 	 : 10���� ���� (decimal)
		// 	%x,X : 16���� ����	(hexa decimal) (�ҹ��ڷ����,�빮�ڷ����)
		//	%o	 : 8���� ����	(octal)
		//	%s	 : ���ڿ�  	(String)
		//	%c	 : ����		(Character)
		//	%f	 : �Ǽ�		
		
		int year = 2020;
		int month = 10;
		int day = 20;
		
		System.out.printf("%d�� %d�� %d��",year,month,day);
		System.out.printf("%x%x%X\n",10,11,12);
		System.out.printf("%f %.2f\n",123.1234561212232121,123.1234561212232121);
		System.out.printf("%d[%c],%x(16),%o(8)\n",65,65,65,65);
		
		
		// ���Ĺ��� �ɼ�
		
		//%���ڼ��Ĺ��� : ���ڸ�ŭ ĭ�� Ȯ���Ͽ� �����������Ͽ� �����
		System.out.printf("�̸� : %15s\n", "Hong gildong");
		System.out.printf("���� : %15d\n", 15);
		
		//%-���ڼ��Ĺ��� : ���ڸ�ŭ ĭ�� Ȯ���Ͽ� ���������Ͽ� �����
		System.out.printf("%-10s : Hong Gildong\n", "Fullname");
		System.out.printf("%-10s : 15\n", "AGE");
		
		//%0���ڼ��Ĺ��� : ���ڸ�ŭ ĭ�� Ȯ���� �� �� ĭ�� 0�� ä�� �����
		System.out.printf("%010d\n",123);
		System.out.printf("%020f\n",123.123);
		
		//%+���ڼ��Ĺ��� : ����տ� ��ȣ�� �ٿ� ���
		System.out.printf("������ ���� %+d���Դϴ�.\n",-5);
		System.out.printf("������ ���� %+d���Դϴ�.\n",5);
		
		//%.����f : �Ҽ� �ڸ����� ����
		System.out.printf("%f %.2f %.10f\n",123.123,123.123,123.123);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
