
public class B07_operator03 {
	
	public static void main(String[] args) {
		
		// ���׿����� (���ǿ�����)
		// ������ if���� ���ٷ� ǥ���� �� �ִ�.
		// ���� ? �� : �ƴϿ�;
		
		//ex: �ʿ��� ��� ���� ���� ����ϱ�
		
		int app = 31;
		int size = 10;
		
		int needs = app % 10 == 0 ? app / size : app / size + 1;
		System.out.println("�ʿ��� ������ ��� " + needs + "���Դϴ�.");
		
		//ex: ����� Ȧ������ ¦������
		String msg = app % 2 == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		System.out.println("���� ����� ������ " + msg);
		
	}

}
