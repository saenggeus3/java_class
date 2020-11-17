package quiz;

public class B13_count_letter_case {
	
	public static void main(String[] args) {
		
		// 사용자로부터 문장을 하나 입력받았다 치고
		// 해당 문장에 어떤 알파벳이 몇번 등장했는지 세어서 출력
		// 대문자, 소문자, 숫자만 집계
		
		String str = "ZXCVBNM123456asdfg456789QWERTA0";
		
		int[] count_upper = new int[26];
		int[] count_lower = new int[26];
		int[] count_num = new int[10];
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				count_lower[ch - 'a'] += 1;
			}else if(ch >= 'A' && ch <= 'Z') {
				count_upper[ch-'A'] +=1;
			}else if(ch >= '0' && ch <= '9') {
				count_num[ch-'0'] += 1;
			}
			
		}
		
		
		for (int i = 0; i < count_lower.length; i++) {
			if(count_lower[i]>0) {
				System.out.println((char)('a'+i) + " : " + count_lower[i] + "회");
			}
		}
		for (int i = 0; i < count_upper.length; i++) {
			if(count_upper[i]>0) {
				System.out.println((char)('A'+i) + " : " + count_upper[i] + "회");
			}
		}
		for (int i = 0; i < count_num.length; i++) {
			if(count_num[i]>0) {
				System.out.println((char)('0'+i) + " : " + count_num[i] + "회");
			}
		}
		
		
		
		
		
		
	}

}
