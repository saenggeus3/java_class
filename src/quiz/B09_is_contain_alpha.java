package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {
	
	public static void main(String[] args) {
		
		//����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ� ������ true��� ������ false���
		
		System.out.print("�Է� > ");
		String str = new Scanner(System.in).nextLine();
		
		// length()�Լ��� �ѹ��� ȣ���ϴ� ���
		for (int i = 0,len = str.length(); i <= len-1 ; i++) {
			
			if(str.charAt(i) >= 'a' && str.charAt(i) <='z' ||
					str.charAt(i) >= 'A' && str.charAt(i) <='Z') {
				System.out.println("true");
				break;
			}
			if (i == str.length()-1) {
				System.out.println("false");
			}
		}
		
	}

}
