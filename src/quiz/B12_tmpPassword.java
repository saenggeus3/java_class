package quiz;

import java.util.Random;

public class B12_tmpPassword {
	
	public static void main(String[] args) {
		
		//랜덤 4자리의 임시 비밀번호 문자열을 생성하는 프로그램을 만들어보세요
		// (비밀번호를 구성하는 문자 - 알파벳 대문자, 숫자)
		// 알파벳 대문자의 범위 65~90
		
		StringBuilder password = new StringBuilder("");
		StringBuilder password2 = new StringBuilder("");
		
		Random ran = new Random();
		
		while (password.length() < 4) {
			//나와야하는 총범위 0~9 ~ 65~90
			
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
			// 조건으로 숫자범위와 알파벳범위중 하나를 추가시킴 (절반확률)
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
