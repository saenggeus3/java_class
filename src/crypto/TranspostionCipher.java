package crypto;

import java.util.Arrays;

public class TranspostionCipher {
	
	// 전치암호
	// 메세지를 key값 만큼의 길이로 나눈 뒤 다른 방향으로 읽어서 암호화 하는 방식
	
	// ex
	
	// Plain : Common sense is not so common.
	// key : 8
	
	// 0 1 2 3 4 5 6 7
	// ---------------
	// C o m m o n   s
	// e n s e   i s 
	// n o t   s o   c
	// o n m o n .
	
	// crypto : Cenoonommstmme oo snnio. s s c
	
	int key;
	
	public TranspostionCipher(int key) {
		this.key=key;
	}
	
	public String encryption(String plain_text) {
		StringBuilder sb = new StringBuilder("");
		int len;
		if (plain_text.length()%key==0) {
			len = plain_text.length()/key;
		}else {
			len = plain_text.length()/key+1;
		}
		String[] strArr = new String[len];
		
		int j = 0;
		for (int i = 0; i < plain_text.length(); i++) {
			sb.append(plain_text.charAt(i));
			if (i==key-1 || i%key==key-1) {
				strArr[j]=sb.toString();
				sb = new StringBuilder("");
				j++;
			}else {
				strArr[j]=sb.toString();
			}
		}
		
		sb = new StringBuilder("");
		
		for (int k = 0; k < key; k++) {
			for (int i = 0; i < strArr.length; i++) {
				if (strArr[i].length()-1<k) {
					
				}else {
					sb.append(strArr[i].charAt(k));
				}
			}
		}
		
		
		return sb.toString();
	}
	
	
	public String decryption(String crypto_text) {
		int nob = (int)Math.ceil(crypto_text.length() / (double)key);
		
		StringBuilder sb = new StringBuilder("");
		int len;
		if (crypto_text.length()%key==0) {
			len = crypto_text.length()/key;
		}else {
			len = crypto_text.length()/key+1;
		}
		String[] strArr = new String[len];
		
		
		for (int i = 0; i < crypto_text.length(); i++) {
				if(i%4==0) {
					sb.append(crypto_text.charAt(i));
				}
			
		}
		
		
		System.out.println(sb.toString());
		
		
		
		
		
		
		
		
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
