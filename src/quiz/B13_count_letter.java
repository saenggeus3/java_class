package quiz;

public class B13_count_letter {
	
	public static void main(String[] args) {
		
		// 사용자로부터 문장을 하나 입력받았다 치고
		// 해당 문장에 어떤 알파벳이 몇번 등장했는지 세어서 출력
		// 대소문자 구분x
		
		String str = "hello,world";
		str = str.toUpperCase();
		
		char[] strArr = str.toCharArray();
		
		char[] ch = new char[26];
		int[] count = new int[26];
		
		// 알파벳 배열을 만들어 비교하지 않고
		// 받은 알파벳 - 'a' 로 인덱스를 찾아 count의 인덱스를 하나씩올리는 방법
		
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
				System.out.println(ch[i] + " : " + count[i] + "회");
			}
		}
		
	}

}
