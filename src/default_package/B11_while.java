package default_package;
import java.util.Scanner;

public class B11_while {
	
	// while
	// for���� ������ �ణ �ٸ� �ݺ���
	// �ʱⰪ�� �������� ��ġ�� ������ ���� ����
	// �������� ��ġ�� ���� �ݺ��� ����� �޶��� �� ����
	
	//()���� ������ ���ε��� {}���� ������ �ݺ��Ѵ�
	
	public static void main(String[] args) {
		
		int i = 0;
		while (i < 10) {
			System.out.println("hello, while! " + i);
			i++;
		}
		
		
		//while���� ����ϰԲ� ����� Ŭ������
		// has , next���� ���ľ ���� �Լ�(�޼���)�� ������ ����
		//	ex : Scanner
		
		// System.in : �ܼ��� ���� �Է��� �ϴ� ���(inputStream)
		
		// System.in ��� ���ڿ��� ���� ��ĳ�ʿ� �Է�
		Scanner sc1 = new Scanner("apple banana orange ");
		Scanner sc2 = new Scanner("dog cat rat bird ");
		
		//sc1�� ���� ������ �ִ� ����
		while(sc1.hasNext()) {
			System.out.println(sc1.next());
		}
		while(sc2.hasNext()) {
			System.out.println(sc2.next());
		}
	
		// ���ѷ����� ���� ���α׷� �����ϱ�
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. ����ϱ�");
			System.out.println("2. �����ϱ�");
			int cmd = sc.nextInt();
			
			switch (cmd) {
			case 1: 
				System.out.println("����մϴ�.");
				break;
			case 2:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
		
		
		
		
		
	}
	
	
	
	

}
