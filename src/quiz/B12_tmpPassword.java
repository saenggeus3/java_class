package quiz;

import java.util.Random;

public class B12_tmpPassword {
	
	public static void main(String[] args) {
		
		//���� 4�ڸ��� �ӽ� ��й�ȣ ���ڿ��� �����ϴ� ���α׷��� ��������
		// (��й�ȣ�� �����ϴ� ���� - ���ĺ� �빮��, ����)
		// ���ĺ� �빮���� ���� 65~90
		
		StringBuilder password = new StringBuilder("");
		StringBuilder password2 = new StringBuilder("");
		
		Random ran = new Random();
		
		while (password.length() < 4) {
			//���;��ϴ� �ѹ��� 0~9 ~ 65~90
			
			int random = (int)(Math.random()*91);
			if (random>=0 && random<10) {
				password.append(random);
			}else if(random>=65 && random<91) {
				password.append((char)random);
			}
		}
		
		System.out.println(password);
		
		for (int i = 0; i < 4; i++) {
			
			char ch;
			// �������� ���ڹ����� ���ĺ������� �ϳ��� �߰���Ŵ (����Ȯ��)
			if (ran.nextBoolean()) {
				ch = (char)(ran.nextInt(26)+'A');
			}else {
				ch = (char)(ran.nextInt(10)+'0');
			}
			
			password2.append(ch);
		}
		
		System.out.println(password2);
		
		
	}

}
