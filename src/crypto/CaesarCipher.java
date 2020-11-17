package crypto;

import java.util.Scanner;

public class CaesarCipher {
	
	// 암호란 무엇인가?
	// 비밀 메세지를 주고받기 위한 것 (암호란 누군가가 가로채가는 것을 전제로 만듬)
	// 암호화(Encryption)
	//		평문(일반 메세지)를 암호문(비밀 메세지)로 바꾸는 것
	// 복호화(Decryption)
	//		암호문을 평문으로 되돌리는 것
	// 키(key)
	//		암호화와 복호화에 사용되는 비밀 값
	
	// 시저(카이사르) 암호
	// 알파벳을 키(key)값 만큼 오른쪽으로 이동시키는 암호방식
	// 암호화 : 평문을 키 값 만큼 오른쪽으로 이동시킴
	// 복호화 : 암호문을 키 값 만큼 왼쪽으로 이동시킴
	
	// 암/복호화의 예
	// ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdef...
	// key값이 3인 경우 암호화 (+3)
	// "Hello, World!"	=>		"Khoorc#Zruog%"
	// key값이 3인 경우 복호화 (-3)
	// "Khoorc#Zruog%"	=>		"Hello, World!"
	
	int key;
	
	
	public CaesarCipher(int key) {
		this.key = key;
		
	}
	
	//32~126
	
	public String encryption(String plain_text) {
		//매개변수로 받은 평문을 암호화 하여 리턴하는 함수
		StringBuilder result = new StringBuilder("");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < plain_text.length(); i++) {
			if(plain_text.charAt(i)>=32 && plain_text.charAt(i)<=216) {
				if(plain_text.charAt(i)+key>126) {
					char tmp = plain_text.charAt(i);
					for (int j = 0; j < key%94; j++) {
						if(tmp==126) {
							tmp=32;
						}else {
							tmp++;
						}
					}
					result.append(tmp);
				}else {
					result.append((char)(plain_text.charAt(i)+key));
				}
				
			}else {
				result.append(plain_text.charAt(i));
			}
			
		}
		
		return result.toString();
	}
	

	public String decryption(String crypto_text) {
		// 매개변수로 받은 암호문을 복호화 하여 리턴하는 함수
		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < crypto_text.length(); i++) {
			if(crypto_text.charAt(i)>=32 && crypto_text.charAt(i)<=216) {
				if(crypto_text.charAt(i)-key<32) {
					char tmp = crypto_text.charAt(i);
					for (int j = 0; j < key%94; j++) {
						if(tmp==32) {
							tmp=126;
						}else {
							tmp--;
						}
					}
					result.append((char)tmp);
				}else {
					result.append((char)(crypto_text.charAt(i)-key));
				}
			}else {
				result.append(crypto_text.charAt(i));
			}
		}
		return result.toString();
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	

}
