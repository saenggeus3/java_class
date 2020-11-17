package crypto;

public class TranspositionCipher2 {

	// # ��ġ ��ȣ 	
	//  - �޼����� Key�� ��ŭ�� ���̷� ���� �� �ٸ� �������� �о ��ȣȭ �ϴ� ���
	
	// ex> 
	
	//	plain : Common sense is not so common.
	//	key : 8
	
	//  0 1 2 3 4 5 6 7 
	//  ---------------
	//	C o m m o n   s
	//	e n s e   i s 	
	//	n o t   s o   c
	//	o m m o n .
	
	
	//  crypto : Cenoonommstmme oo snnio. s s c
	
	//  0 1 2 3
	//	C e n o
	//  o n o m
	//  m s t m
	//  m e   o
	//  o   s n
	//  n i o .
	//    s   X 
	//  s	c X
	
	int key;
	
	public TranspositionCipher2(int key) {
		this.key = key;
	}
	
	// encryption �޼����� ������ ������ȣ�� ��ġ��Ű�� ���� ����
	public String encryption(String plain) {
		StringBuilder[] builders = getBuilders(key);	
		
		int len = plain.length();
		
		for (int i = 0; i < len; ++i) {
			builders[i % key].append(plain.charAt(i));
		}
		
		return joinBuilders(builders);
	}
	
	public String decryption(String crypto) {
		int len = crypto.length();
			
		int columnSize = len % key > 0 ? len / key + 1 : len / key;
		int numOfBlanks = columnSize * key - len;
		int numOfFull = key - numOfBlanks;
		
//		System.out.println(len);
//		System.out.println(columnSize);
//		System.out.println(numOfBlanks);
//		System.out.println(numOfFull);
		
		StringBuilder[] builders = getBuilders(columnSize);	

		
		
		for (int column = 0; column < columnSize; ++column) {	
			
			int crypto_index = column;
			
			// �� ���� �ݺ��ɶ����� FullLine�� ��� �÷���ŭ �ε��� ���� 
			// FullLine�� �ƴ� ��� �÷�-1 ��ŭ �ε��� ���� 
			for (int row = 0; row < key; ++row) {
				builders[column].append(crypto.charAt(crypto_index));
				
				 //System.out.printf("%d�� ������ %c[%d]�� �߰���\n", 
				 //		column, crypto.charAt(crypto_index), crypto_index);
				
				if (row < numOfFull) {
					crypto_index += columnSize;
				} else {
					crypto_index += columnSize - 1;
				}
				
				// �߰��� index�� ������ �÷��̸鼭 ���ÿ� ������ fullline�� ���
				if (column == columnSize - 1 && row == numOfFull -1) {
					break;
				} else if (crypto_index >= len) {
					break;
				}
			}						
		}
		
		return joinBuilders(builders);
	}	
	
	
	private String joinBuilders(StringBuilder[] builders) {		
		StringBuilder result = new StringBuilder();
		
		for (StringBuilder builder : builders) {
			result.append(builder);
		}
		
		return result.toString();
	}
	
	
	private StringBuilder[] getBuilders(int columnSize) {
		StringBuilder[] builders = new StringBuilder[columnSize];		
		
		// �� �߸��� �ҽ�
		//	- �ӽ� ������ builder�� ���ο� �ν��Ͻ��� ����� �ִ� ���̱� ������
		//	  ������ �ȴ�
//		for (StringBuilder builder : builders) {
//			builder = new StringBuilder();
//		}
		
		for (int i = 0; i < builders.length; ++i) {
			builders[i] = new StringBuilder();			
		}
		
		return builders;
	}
	
	
	public static void main(String[] args) {
		
		String crypto = new TranspositionCipher2(8)
				.encryption("Common sense is not so common.  ");
		
		System.out.println(crypto);

		String plain = new TranspositionCipher2(8)
				.decryption(crypto);
		
		System.out.println(plain);
	}
	
}