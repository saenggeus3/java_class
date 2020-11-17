package quiz;

public class B09_printAlphabet {
	
	public static void main(String[] args) {
		
		// 반복문을 이용하여 A부터 Z까지 출력
		// 반복문을 이용하여 z부터 a까지 출력
		
		
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i);
		}
		
		System.out.println();
		
		for (int i = 'z'; i >= 'a' ; i--) {
			System.out.print((char)i);
		}
		
	}

}
