package quiz;

import java.util.Scanner;

public class B05_CheckWord {
	
	public static void main(String[] args) {
		
		//����ڷκ��� �ܾ �ϳ� �Է¹ް�
		// ù ��° �ܾ�� ������ �ܾ ��ġ�ϸ� ok���
		// �ƴ϶�� not ok ���
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�ܾ �Է����ּ��� > ");
		String uin = sc.next();
		
		if(uin == null || uin == "") {
			System.out.println("�߸��� �Է�");
			return;
		}
		
		if(uin.length()>1) {
			if(uin.charAt(0)==uin.charAt(uin.length()-1)) {
				System.out.println("ok");
			}else {
				System.out.println("not ok");
			}
		}else {
			System.out.println("���� �� �ִ� �ܾ �Էµ�������");
			return;
		}
		
		
	}

}
