package default_package;

public class B06_switch {
	
	public static void main(String[] args) {
		
		//switch-case��
		// ()���� ���� ����� ���� ������ �ڵ带 ����
		// if������ ��ü����
		// break�� �� ���� break�� ������ ���� ��� case�� ����
		
		int a = 10;
		switch (a % 2) {
		case 0:
			System.out.println("¦���Դϴ�.");
			break;
		case 1:
			System.out.println("Ȧ���Դϴ�.");
			break;
		default:
			break;
		}
		
		String word = "apple";
		
		switch (word.charAt(0)) {
		case 'A': case 'a':
			System.out.println("a�� �����ϴ� �ܾ��Դϴ�.");
			break;
		case 'B': case 'b':
			System.out.println("b�� �����ϴ� �ܾ��Դϴ�.");
			break;
		case 'C': case 'c':
			System.out.println("c�� �����ϴ� �ܾ��Դϴ�.");
			break;
		default:
			System.out.println("���� case�� ��� �ƴմϴ�.");
				
		}
		
	}

}
