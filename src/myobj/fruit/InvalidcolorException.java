package myobj.fruit;

// RuntimeException�� ��ӹ��� ��ü�� �ݵ�� ó������ �ʾƵ� �Ǵ� ���� ��ü�� ��
public class InvalidcolorException extends RuntimeException{
	
	public InvalidcolorException() {
		super("�̻��� ���� ����");
		}
	
	//throw�� ����������, �ݵ�� ó���϶�� �������� ���� ����

}
