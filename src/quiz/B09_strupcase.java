package quiz;

import java.util.Scanner;

public class B09_strupcase {
	
	public static void main(String[] args) {
		
		// "���ڿ�".toUpperCase() - ���ڿ��� �ҹ��� ���ĺ��� �빮�ڷ� ��ȯ
		// "���ڿ�".toLowerCase() - ���ڿ��� �빮�� ���ĺ��� �ҹ��ڷ� ��ȯ
		
		// �Է¹��� ���ڿ��� ��� ���ĺ��� �빮�ڷ� ��ȯ
		// ������ �Ѽյ��� �ʰ� ���ο� ���ڿ��� ����
		
		System.out.print("�Է� > ");
		String str = new Scanner(System.in).nextLine();
		StringBuilder str2 = new StringBuilder("");
		
		for (int i = 0 , len = str.length(); i < len; i++) {
			char ch = str.charAt(i);
			if(ch < 'a' || ch > 'z') {
				str2.append(ch);
			}else {
				// �ҹ��ڸ� �빮�ڷ� ��ȯ�ϴ� ���
				// ch -= Math.abs('a' - 'A');
				ch-=32;
				str2.append(ch);
			}
		}
		
		System.out.println(str);
		System.out.println(str2);
		
	}

}
