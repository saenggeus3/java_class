package default_package;

public class B06_switch {
	
	public static void main(String[] args) {
		
		//switch-case문
		// ()안의 연산 결과에 따라 실행할 코드를 결정
		// if문으로 대체가능
		// break를 안 쓰면 break를 만날때 까지 모든 case를 실행
		
		int a = 10;
		switch (a % 2) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
			break;
		default:
			break;
		}
		
		String word = "apple";
		
		switch (word.charAt(0)) {
		case 'A': case 'a':
			System.out.println("a로 시작하는 단어입니다.");
			break;
		case 'B': case 'b':
			System.out.println("b로 시작하는 단어입니다.");
			break;
		case 'C': case 'c':
			System.out.println("c로 시작하는 단어입니다.");
			break;
		default:
			System.out.println("위의 case가 모두 아닙니다.");
				
		}
		
	}

}
