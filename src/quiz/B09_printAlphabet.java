package quiz;

public class B09_printAlphabet {
	
	public static void main(String[] args) {
		
		// �ݺ����� �̿��Ͽ� A���� Z���� ���
		// �ݺ����� �̿��Ͽ� z���� a���� ���
		
		
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i);
		}
		
		System.out.println();
		
		for (int i = 'z'; i >= 'a' ; i--) {
			System.out.print((char)i);
		}
		
	}

}
