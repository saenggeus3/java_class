
public class B08_operator04 {
	
	public static void main(String[] args) {
		
		// ���Կ���
		// = : ������ ������ �������� ���� ����
		
		int num = 10;
		num +=5;
		
		// ���� ���� ����
		// ������ ����� ������Ű�� ����
		num = 10;
		System.out.println(num += 2);
		System.out.println(num -= 2);
		System.out.println(num *= 2);
		System.out.println(num /= 2);
		System.out.println(num %= 2);
		
		num = 10;
		// ���� ����
		num++;
		++num;
		// num�ǰ��� 1������Ŵ
		
		//++,--�� ��ġ�� ���� ���� ����� �޶����⵵��
		int a=10, b=3;
		int result = a++*b;
		a--;
		//���� ����� result=30 a=11 b=3 �����ڿ� ++�� �ش���� ���� �� a�� 1������
		result = ++a*b;
		//�տ� ++�������� a�� 1������������ ����� result=33
		
		
		System.out.println(result);
		
		
	}

}
