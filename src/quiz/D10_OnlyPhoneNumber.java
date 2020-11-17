package quiz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {
	
	// ����ڷκ��� ��ȭ��ȣ�� �Է¹޾ƺ�����
	// ��ȭ��ȣ ���°� �ƴҰ�� �����޼����� ��� �� �ٽ� �Է�
	
	public static void main(String[] args) {
		String phoneNumber_regex = "^[0][1][0-9][0-9]{7,8}$";
		String phoneNumber_regex2 = "^01[01679]-[\\d]{3,4}-[\\d]{4}$";
		
		Pattern pattern = Pattern.compile(phoneNumber_regex);
		String phonNum = "1190000000";
		Matcher matcher = pattern.matcher(phonNum);
		if (matcher.find()) {
			System.out.println("�������� ��ȭ��ȣ");
		}else {
			System.out.println("�ٽ��Է�");
		}
		
		
		
		String num;
		while(true) {
			System.out.print("��ȣ�Է� : ");
			num = new Scanner(System.in).nextLine();
			if(Pattern.matches(phoneNumber_regex, num)){
				System.out.println("�������� ��ȭ��ȣ");
				break;
			}else if(Pattern.matches(phoneNumber_regex2, num)){
				System.out.println("�������� ��ȭ��ȣ");
				break;
			}else {
				System.out.println("�ٽ��Է�");
				num = new Scanner(System.in).nextLine();
			}
		}
		
	}

}
