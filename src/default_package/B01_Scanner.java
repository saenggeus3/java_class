package default_package;

//import
//�ٸ���Ű���� �ִ� Ŭ������ ����ϱ� ���ؼ��� �ش� Ŭ������ import�ؾ���
//�ٸ� ��Ű������ �̸� ������ �ҽ��� �����ͼ� ����� �� ����
//���� ��Ű���� �̸������� �ҽ��� import���� �ʾƵ� ����� �� ����
import java.util.Scanner;
import quiz.A01_printquiz;


public class B01_Scanner {
	
	public static void main(String[] args) {
		
		// java.util.Scanner Ŭ����
		// ���α׷� �ܺηκ��� �Է��� ���� �� �ִ� ��ɵ��� ���ִ� Ŭ����
		// ��� �Է¹����� �����ϰ� �پ��� ������� �Է¹��� �� �ִ�
		// �ַܼκ��� �Է��� ���� ���� system.in�� �̿�
		
		A01_printquiz.main(null);
		
		//A00_Hello.main(null);
		
		//���ο� ��ĳ�ʸ� ������ �� ���� sc�� ������ ��ĳ�ʸ� ��Ƴ���
		//���ο� ��ĳ�ʸ� ������ �� ��𼭿��� �Է¹������� ������ �� ����
		// system.out : �ַܼ� ����ϴ� ���
		// system.in  : �ֿܼ��� �Է¹޴� ���
		Scanner sc = new Scanner(System.in);
		
		// next()
		// ��ο� �����ϴ� ���� ���� �ϳ��� ������
		// Ÿ���� �ٲ������� (�⺻ String)
		
		// nextŸ��()
		// ��ο� �����ϴ� ���� ���� �ϳ��� ���� �� �ش�Ÿ������ ��ȯ
		// ��ο� �ƹ� ���� ���ٸ� �Է��� �ɶ����� ��ٸ�
		// ��ο� �����ϴ� ���� ���� �ش�Ÿ���� �� �� ���ٸ� ������ �߻���
		
		// nextLine()
		// ��ο� �����ϴ� ���� �� �� ���� ������ (\n���� ����)
		
		System.out.println("�ƹ� ���̳� �Է��ϼ��� > ");
		int num = sc.nextInt();
		
		System.out.println("�Է� ���� �� : " + num);
		System.out.println("�Է� ���� ���� ����" + Math.pow(num, 2));
		
		int num2 = sc.nextInt();
		System.out.println("�ι�° �� : " + num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
	}

}
