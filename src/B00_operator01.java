
public class B00_operator01 {
	
	public static void main(String[] args) {
		
		//������ (operator)
		// ����� �� ����ϴ� ��
		
		// ��� ������
		
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.printf("a = %d, b = %d\n",a,b);
		
		// ������ �켱 ������ ��Ģ ������ �켱������ ����
		System.out.println("+ : " + (a + b));
		System.out.println("- : " + (a - b));
		System.out.println(a * b);
		
		//�������� ������ �� ����
		System.out.println(a / b);
		//������ �Ǽ��� ������ ��Ȯ�� �������
		System.out.println(a / c);
		System.out.println(a / (double)b);
		System.out.println(a % b);//����������
		
		//���� (��� doubleŸ��)
		System.out.println(Math.pow(a, b));
		//������
		System.out.println(Math.sqrt(2));
		//���밪
		System.out.println(Math.abs(-20));
		//�ݿø�
		System.out.println(Math.round(1.856));
		//�ø�
		System.out.println(Math.ceil(1.001));
		//����
		System.out.println(Math.floor(1.999));
		
		System.out.println("�� ū���� : " + Math.max(a, b));
		System.out.println("�� �������� : " + Math.min(a, b));
		
		System.out.println(a ^ b);//����x XOR
		// 10 = 1010
		// 7  = 0111 ^	���δٸ��� 1
		//	   ------
		//		1101
		// 1101 = 13
		
	}

}
