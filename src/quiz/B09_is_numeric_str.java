package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {
	
	public static void main(String[] args) {
		
		// 입력받은 문자열에 숫자만 포함되어 있으면 결과에 1을 저장
		// 다른 문자가 포함되어 있다면 0을 저장
		// 문자열이 비어있을때 결과가 2
		
		System.out.print("입력 > ");
		String str = new Scanner(System.in).nextLine();
		
		//문자열이 이상한 경우
		// 1 null : str이 가르키는 주소가 없는 경우
		// 2 str의 값이 ""인경우
		// 3 str의 길이가 0인경우	//2와3은 같은경우
		
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
