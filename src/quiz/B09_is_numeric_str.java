package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {
	
	public static void main(String[] args) {
		
		// �Է¹��� ���ڿ��� ���ڸ� ���ԵǾ� ������ ����� 1�� ����
		// �ٸ� ���ڰ� ���ԵǾ� �ִٸ� 0�� ����
		// ���ڿ��� ��������� ����� 2
		
		System.out.print("�Է� > ");
		String str = new Scanner(System.in).nextLine();
		
		//���ڿ��� �̻��� ���
		// 1 null : str�� ����Ű�� �ּҰ� ���� ���
		// 2 str�� ���� ""�ΰ��
		// 3 str�� ���̰� 0�ΰ��	//2��3�� �������
		
		int check = 1;
		
		if (str==null || str.length() == 0) {
			check = 2;
		}else {
			for (int i = 0 , len = str.length(); i < len; i++) {
				if(str.charAt(i) < '0' || str.charAt(i) > '9') {
					check = 0;
					break;
				}
			}
		}
		
		
		System.out.println(check);
	}
}
