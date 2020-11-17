package crypto;

import java.util.Scanner;

public class cryptoMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] crypto_text_arr = new String[100];
		int[] crypto_key_arr = new int[100];
		int num;
		//����ڰ� �޼����� Ű���� �����Ͽ� ���ϴ� ��ȣ �˰�������
		//��ȣȭ/��ȣȭ �۾��� �� �� �ִ� ���α׷��� ����
		
		while(true) {
			System.out.println("1.��ȣȭ\n2.��ȣȭ\n3.����");
			System.out.print(" > ");
			int input = sc.nextInt();
			String crypto_text;
			int i = 0;
			
			switch (input) {
			case 1:
				System.out.println("��ȣȭ �������\n1.CaesarCipher\n2.TranspositionCipher");
				System.out.print("> ");
				int input2 = sc.nextInt();
				System.out.println(sc.nextLine());
				System.out.print("��ȣȭ��ų �ؽ�Ʈ �Է� : ");
				crypto_text = sc.nextLine();
				System.out.println("key���� �Է��ϼ���");
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
					System.out.println("�߸��� �Է�");
				}
				System.out.println(crypto_text + "   "+i+"���� ����Ǿ����ϴ�");
				System.out.println();
				crypto_text_arr[i] = crypto_text;
				crypto_key_arr[i] = input_key;
				i++;
				break;
			case 2: 
				System.out.println("��ȣȭ �������\n1.CaesarCipher\n2.TranspositionCipher");
				System.out.print("> ");
				input2 = sc.nextInt();
				System.out.println(sc.nextLine());
				System.out.print("��ȣȭ��ų �ؽ�Ʈ ���� : ");
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
					System.out.println("�߸��� �Է�");
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
