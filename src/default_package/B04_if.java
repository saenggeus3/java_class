package default_package;

public class B04_if {
	
	public static void main(String[] args) {
		
		// if��
		// ()���� ���� true �϶� {}���� ������ ������
		// ()���� ���� false�� �� {}���� ������ ������
		// {}�ȿ� �� ������ �����̶�� {]�� ������ �� ����
		// else if �� �ܵ����� ����� �� ����
		// else if �� ������ ��ø�ؼ� ����� �� ����
		// else �� if�� else if�� ��� true�� �ƴ϶�� {}�ȿ� ������ ������
		
		// {}���ο��� ������ ������ �߰�ȣ�� ����� ã�� �� ����
		
		String result;
		
		char lastName = '��';
		
		if (lastName == '��') {
			System.out.println("hi");
			result = "�达�Դϴ�";
		}else if (lastName == '��') {
			result = "�־��Դϴ�";
		}else if (lastName == '��') {
			result = "�ھ��Դϴ�";
		}else {
			result = "�ش��ϴ� ���� �����ϴ�.";
		}
		
		System.out.println(result);
		
		
		int num = 999999;
		
		if (num > 10000) {
			System.out.println("num�� 10000���� Ů�ϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
