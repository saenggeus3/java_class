
public class C09_localInnerClass {
	
	//���� ���� Ŭ����
	// �޼��� ���ο����� Ŭ���� ����� �����ϴ�
	// �޼����� ������ ��� �� ����
	
	void method() {
		class Apple{
			int size;
			String color;
		}
		Apple a = new Apple();
		System.out.println(a.size);
	}
	
	public static void main(String[] args) {
		
		String a = "�뱸";
		String b = "������";
		
		//�������� Ŭ���� (�޼��尡 ������ Ŭ������ ������� ��)
		class Apple{
			String addr=a;
			String color=b;
		}
		Apple apple = new Apple();
		
		System.out.println(apple.addr);
	}
	
}
