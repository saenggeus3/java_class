package quiz;

import java.util.Scanner;

public class B06_monthToSeason {
	
	// swtich_case�� ���
	// ����ڷκ��� ���� �Է� ������ �ش��ϴ� ������ ���
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է����ּ��� > ");
		
		String mon = sc.next();
		
		switch (mon.charAt(0)) {
		case '1': case '2':  
			System.out.println("�ܿ��Դϴ�.");
			break;
		case '3': case '4': 
			System.out.println("���Դϴ�.");
			break;
		case '5': case '6': case '7': case '8':
			System.out.println("�����Դϴ�.");
			break;
		case '9':
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�߸��� �Է�");
			break;
		}
		
	}
	
	

}
