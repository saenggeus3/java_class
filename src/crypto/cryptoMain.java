package crypto;

import java.util.Scanner;

public class cryptoMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] crypto_text_arr = new String[100];
		int[] crypto_key_arr = new int[100];
		int num;
		//사용자가 메세지와 키값을 설정하여 원하는 암호 알고리즘으로
		//암호화/복호화 작업을 할 수 있는 프로그램을 만듬
		
		while(true) {
			System.out.println("1.암호화\n2.복호화\n3.종료");
			System.out.print(" > ");
			int input = sc.nextInt();
			String crypto_text;
			int i = 0;
			
			switch (input) {
			case 1:
				System.out.println("암호화 방법선택\n1.CaesarCipher\n2.TranspositionCipher");
				System.out.print("> ");
				int input2 = sc.nextInt();
				System.out.println(sc.nextLine());
				System.out.print("암호화시킬 텍스트 입력 : ");
				crypto_text = sc.nextLine();
				System.out.println("key값을 입력하세요");
				System.out.print("> ");
				int input_key = sc.nextInt();
				System.out.println();
				
				if (input2==1) {
					CaesarCipher cc = new CaesarCipher(input_key);
					crypto_text = cc.encryption(crypto_text);
				}else if(input2==2){
					TranspositionCipher2 tp = new TranspositionCipher2(input_key);
					crypto_text = tp.encryption(crypto_text);
				}else {
					System.out.println("잘못된 입력");
				}
				System.out.println(crypto_text + "   "+i+"번에 저장되었습니다");
				System.out.println();
				crypto_text_arr[i] = crypto_text;
				crypto_key_arr[i] = input_key;
				i++;
				break;
			case 2: 
				System.out.println("복호화 방법선택\n1.CaesarCipher\n2.TranspositionCipher");
				System.out.print("> ");
				input2 = sc.nextInt();
				System.out.println(sc.nextLine());
				System.out.print("복호화시킬 텍스트 선택 : ");
				num = sc.nextInt();
				crypto_text = crypto_text_arr[num];
				input_key = crypto_key_arr[num];
				System.out.println();
				
				if (input2==1) {
					CaesarCipher cc = new CaesarCipher(input_key);
					crypto_text = cc.decryption(crypto_text);
				}else if(input2==2){
					TranspositionCipher2 tp = new TranspositionCipher2(input_key);
					crypto_text = tp.decryption(crypto_text);
				}else {
					System.out.println("잘못된 입력");
				}
				
				System.out.println(crypto_text);
				System.out.println();
				
				break;
			case 3:
				return;
			default:
				break;
			}
		}
		
		
	}

}
