package default_package;

public class B03_typeCasting {
	
	public static void main(String[] args) {
		
		// Ÿ�� ĳ����
		// Ÿ���� �ڿ������� ���ϴ� ��� (������ ���� ������ ���� ��)
		// Ÿ���� ������ ��ȯ��Ű�� ��� (������ ���� ������ ���� ��)
		
		//Ÿ���� ũ��
		// ���� Ÿ�� : byte(1) < char, short(2) < int(4) < long(8)
		// �Ǽ� Ÿ�� : float(4) < double(8)
		
		byte _byte = 10;
		int _int = 20_0000_0000; // ���� ���ͷ��� _�� ���� �ڸ��� ǥ���� ������ _�� ��µ�������
		
		//�ڿ������� Ÿ��ĳ����
		_int = _byte;
		System.out.println(_int);
		
		//���� �ջ�� �����ִ� ��쿡���� �����Ϸ��� �����
		_int = 2000000001;
		_byte = (byte)_int;
		System.out.println(_byte);
		
		
		//����Ÿ���� �� ���� ũ���� �Ǽ�Ÿ�Կ��� �� �� �ִ�
		
		long _long = 200000000000L;
		float _float = _long;
		
		System.out.println(_float);
		
		_float = 123.123f;
		_long = (long)_float;// �Ҽ��� �Ʒ��� ����� �� �����Ƿ� ���
		System.out.println(_long);
		
		
		// ���� ���̴��� �ٸ��� �ؼ��� �� �ִ� Ÿ���� ��쿡 Ÿ��ĳ������ �ʿ��ϴ�
		
		int a = 70;
		System.out.println("a : " + a);
		System.out.println("a : " + (char)a);
		System.out.println("F : " + (int)'F');
		
		//���� 70�̴��� � Ÿ���̳Ŀ� ���� �ؼ� ����� �޶���
		//charŸ���� ����ǥ(charset)�� ���� �ؼ��ϰ� �ǰ�
		//intŸ���̶�� �״�� ���ڷ� �޾Ƶ���
		
		//�ڵ�ǥ�� �ܿ� �ʿ䰡 ����
		System.out.println((int)'��');
		System.out.println((int)'��');
		
		//char Ÿ���� �����ڵ带 �����ϱ� ���ϵ��� 2byte ����� �����ϵ��� ����Ǿ� ����
		
		//char Ÿ���� ������ �������� ���ϰ� �ձ� ������ �����̰�����
		System.out.println('K' - 'A');
		System.out.println((char)('A' + 10));
		System.out.println("���ĺ��� ��� �� ��? " + ('Z' - 'A' + 1) + "��");
		
		
		
		
		
		
		
		
	}

}
