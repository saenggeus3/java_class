package crypto;

public class CaesarHacker {
	
	// 암호문과 charset과 알고리즘이 시저암호 방식임을 알고있다고 가정한 상태로
	// 암호문을 이용하여 평문을 추출
	
	// 암호의 강력함을 논할 때 위의 3가지는 모두 공격자가 알고있다고 가정함
	public static void main(String[] args) {
		
		CaesarCipher cc = new CaesarCipher(3);
		
		String test = cc.encryption("Hello, wolrd!");
		System.out.println(test);
		
		
		
	}
	

}
