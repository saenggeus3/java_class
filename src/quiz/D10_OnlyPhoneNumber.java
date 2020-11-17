package quiz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {
	
	// 사용자로부터 전화번호만 입력받아보세요
	// 전화번호 형태가 아닐경우 에러메세지를 출력 후 다시 입력
	
	public static void main(String[] args) {
		String phoneNumber_regex = "^[0][1][0-9][0-9]{7,8}$";
		String phoneNumber_regex2 = "^01[01679]-[\\d]{3,4}-[\\d]{4}$";
		
		Pattern pattern = Pattern.compile(phoneNumber_regex);
		String phonNum = "1190000000";
		Matcher matcher = pattern.matcher(phonNum);
		if (matcher.find()) {
			System.out.println("정상적인 전화번호");
		}else {
			System.out.println("다시입력");
		}
		
		
		
		String num;
		while(true) {
			System.out.print("번호입력 : ");
			num = new Scanner(System.in).nextLine();
			if(Pattern.matches(phoneNumber_regex, num)){
				System.out.println("정상적인 전화번호");
				break;
			}else if(Pattern.matches(phoneNumber_regex2, num)){
				System.out.println("정상적인 전화번호");
				break;
			}else {
				System.out.println("다시입력");
				num = new Scanner(System.in).nextLine();
			}
		}
		
	}

}
