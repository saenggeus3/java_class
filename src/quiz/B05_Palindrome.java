package quiz;

import java.util.Scanner;

public class B05_Palindrome {
	
	public static void main(String[] args) {
		
		//����ڷκ��� �ܾ� �ϳ��� �Է¹ް�
		//�ش� �ܾ ȸ���̶�� "PALINDROME" �����
		//ȸ���� �ƴ϶�� "NOT PALINDROME" �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ �Է����ּ��� > ");
		String uin = sc.nextLine();
		int check = 0;
		int len = uin.length()-1;
		
		if(len<=0) {
			System.out.println("�߸��� �Է�");
			check = 2;
		}else {
			for (int i = 0; i < uin.length()/2; i++) {
				if(uin.charAt(i)!=uin.charAt(len)) {
					check = 1;
					break;
				}
				len--;
			}
		
	}
		
		if (check==0) System.out.println("PALINDROME");
		else if(check==1) System.out.println("NOT PALINDROME");
		
		
		sc.close();
	}

}
