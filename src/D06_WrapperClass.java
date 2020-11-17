
public class D06_WrapperClass {
	
	public static void main(String[] args) {
		
		//wrapperClass
		// �⺻�� Ÿ�Ե��� ������ Ÿ������ ����ϰ� ������ �����
		// �� Ÿ�Ե鿡 ���� ������ ��ɵ��� ������
		
		// �⺻�� : byte, short, char, int, long, float, double
		// ������ : Byte, Short, Character, Integer, Long, Float, Double
		
		int a = 10;
		//Integer b = new Integer(10); // JDK9���ķ� deprecated
		Integer b = 10;
		
		
		// typeValue() �ø��� : �������� ����� ���� ���ϴ� �⺻ Ÿ������ ��ȯ��
		System.out.println(b.byteValue());
		System.out.println(b.doubleValue());
		
		
		//parse �ø��� : ���ڿ��� ����� ���� ���ϴ� Ÿ������ ��ȯ��
		String str = "10";
		
		System.out.println(Integer.parseInt(str));
		System.out.println(Integer.parseInt(str,16));
		System.out.println(Double.parseDouble(str));
		System.out.println(Byte.parseByte(str));
		
		
		//�� (������������ �� = �ּҰ� ��)
		System.out.println(new Integer(10) == new Integer(10));
		System.out.println(new Integer(10).equals(new Integer(10)));
		
		// WrapperŬ������ toString�� ���� ���� ��ȯ�� ������ (radix(����)������ 10����)
		System.out.println(Integer.toString(123,10));
		System.out.println(Integer.toString(123,16).toUpperCase());
		System.out.println(Integer.toString(123,8).toUpperCase());
		
		// ���ڿ��� Boolean���� ��ȯ
		Boolean b1 = Boolean.valueOf("true");
		
		System.out.println(b1);
		
		// �ش������� ���ڸ� charŸ������ ��ȯ
		//ex : 36������ 35�� �ش��ϴ� ���ڸ� ��ȯ
		System.out.println(Character.forDigit(35, 36));
		
		
	}

}
