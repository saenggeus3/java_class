package quiz;

public class B13_count_letter_case {
	
	public static void main(String[] args) {
		
		// ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
		// �ش� ���忡 � ���ĺ��� ��� �����ߴ��� ��� ���
		// �빮��, �ҹ���, ���ڸ� ����
		
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
				System.out.println((char)('a'+i) + " : " + count_lower[i] + "ȸ");
			}
		}
		for (int i = 0; i < count_upper.length; i++) {
			if(count_upper[i]>0) {
				System.out.println((char)('A'+i) + " : " + count_upper[i] + "ȸ");
			}
		}
		for (int i = 0; i < count_num.length; i++) {
			if(count_num[i]>0) {
				System.out.println((char)('0'+i) + " : " + count_num[i] + "ȸ");
			}
		}
		
		
		
		
		
		
	}

}
