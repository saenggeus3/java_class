package quiz;

public class B13_count_letter {
	
	public static void main(String[] args) {
		
		// ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
		// �ش� ���忡 � ���ĺ��� ��� �����ߴ��� ��� ���
		// ��ҹ��� ����x
		
		String str = "hello,world";
		str = str.toUpperCase();
		
		char[] strArr = str.toCharArray();
		
		char[] ch = new char[26];
		int[] count = new int[26];
		
		// ���ĺ� �迭�� ����� ������ �ʰ�
		// ���� ���ĺ� - 'a' �� �ε����� ã�� count�� �ε����� �ϳ����ø��� ���
		
//		for (int i = 0; i < count.length; i++) {
//			
//			char ch = str.charAt(i);
//			
//			if(ch >= 'a' && ch <= 'z') {
//				count[ch - 'a'] += 1;
//			}
//			
//		}
		
		
		char a = 'A';
		
		for (int i = 0; i <= 25; i++) {
			ch[i] = a;
			a++;
		}
		
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(strArr[i]==ch[j]) {
					count[j]++;
					break;
				}
			}
			
		}
		
	
		
		
		for (int i = 0; i < count.length; i++) {
			if(count[i]>0) {
				System.out.println(ch[i] + " : " + count[i] + "ȸ");
			}
		}
		
	}

}
