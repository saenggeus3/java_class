package crypto;

public class CaesarHacker {
	
	// ��ȣ���� charset�� �˰����� ������ȣ ������� �˰��ִٰ� ������ ���·�
	// ��ȣ���� �̿��Ͽ� ���� ����
	
	// ��ȣ�� �������� ���� �� ���� 3������ ��� �����ڰ� �˰��ִٰ� ������
	public static void main(String[] args) {
		
		CaesarCipher cc = new CaesarCipher(3);
		
		String test = cc.encryption("Hello, wolrd!");
		System.out.println(test);
		
		
		
	}
	

}
