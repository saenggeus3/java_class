package default_package;

public class B02_operator02 {
	
	public static void main(String[] args) {
		
		// �� ����
		// �񱳿����� ����� �� �Ǵ� ���� (booleanŸ��)
		// �������� �񱳿����� �Բ� ������ ��������� ���� ���
		
		int a = 7, b = 9;
		
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(a == b);
		System.out.println(a != b);
		
		// �� ����
		// && : ���ϴ°��� ��� true�� �� true (AND) 
		// || : ���ϴ°� �� �ϳ��� true���� true (OR)
		// !  : true�� false, false�� true (NOT)
		
		System.out.println((a>5) && (b>8));
		
		
	}

}
