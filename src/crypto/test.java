package crypto;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("key 입력 : ");
//		CaesarCipher cc = new CaesarCipher(sc.nextInt());
//		
//		
//		String test = cc.encryption("Hello, wolrd! 안녕하세요");
//		System.out.println(test);
//		test = cc.decryption(test);
//		System.out.println(test);
		
		TranspostionCipher tc = new TranspostionCipher(8);
		
		String str = tc.encryption("Common sense is not so common.");
		System.out.println(str);
		
		System.out.println(tc.decryption(str));
	}	

}
