package quiz;

//ctrl + shift + o : �ڵ� import
import java.util.Scanner;

public class B04_appleQuiz {
	
	
	public static void main(String[] args) {
		
		// ����� 10���� ���� �� �ִ� �ٱ��ϰ� ���� ��
		// ����ڰ� ����� ������ �Է��Է��ϸ� �ʿ��� �ٱ����� ������ ���
		
		// �����տ� final �� ������ ������ �Ұ����� ������ ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� ������ �Է��ϼ��� > ");
		long app = sc.nextLong();
		
		if (app<0) {
			System.out.println("�߸��� �� �Է�");
		}else if(app%10==0) {
			System.out.println(app/10 + "���� �ٱ��ϰ� �ʿ��մϴ�.");
		}else{
			System.out.println(app/10+1 + "���� �ٱ��ϰ� �ʿ��մϴ�.");
		}
		
	}

}
