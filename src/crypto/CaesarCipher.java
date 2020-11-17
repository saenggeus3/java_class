package crypto;

import java.util.Scanner;

public class CaesarCipher {
	
	// ��ȣ�� �����ΰ�?
	// ��� �޼����� �ְ�ޱ� ���� �� (��ȣ�� �������� ����ä���� ���� ������ ����)
	// ��ȣȭ(Encryption)
	//		��(�Ϲ� �޼���)�� ��ȣ��(��� �޼���)�� �ٲٴ� ��
	// ��ȣȭ(Decryption)
	//		��ȣ���� ������ �ǵ����� ��
	// Ű(key)
	//		��ȣȭ�� ��ȣȭ�� ���Ǵ� ��� ��
	
	// ����(ī�̻縣) ��ȣ
	// ���ĺ��� Ű(key)�� ��ŭ ���������� �̵���Ű�� ��ȣ���
	// ��ȣȭ : ���� Ű �� ��ŭ ���������� �̵���Ŵ
	// ��ȣȭ : ��ȣ���� Ű �� ��ŭ �������� �̵���Ŵ
	
	// ��/��ȣȭ�� ��
	// ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdef...
	// key���� 3�� ��� ��ȣȭ (+3)
	// "Hello, World!"	=>		"Khoorc#Zruog%"
	// key���� 3�� ��� ��ȣȭ (-3)
	// "Khoorc#Zruog%"	=>		"Hello, World!"
	
	int key;
	
	
	public CaesarCipher(int key) {
		this.key = key;
		
	}
	
	//32~126
	
	public String encryption(String plain_text) {
		//�Ű������� ���� ���� ��ȣȭ �Ͽ� �����ϴ� �Լ�
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
		// �Ű������� ���� ��ȣ���� ��ȣȭ �Ͽ� �����ϴ� �Լ�
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
