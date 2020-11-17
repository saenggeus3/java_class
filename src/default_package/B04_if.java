package default_package;

public class B04_if {
	
	public static void main(String[] args) {
		
		// if문
		// ()안의 값이 true 일때 {}안의 내용을 실행함
		// ()안의 값이 false일 때 {}안의 내용을 무시함
		// {}안에 들어갈 내용이 한줄이라면 {]를 생략할 수 있음
		// else if 는 단독으로 사용할 수 없음
		// else if 는 여러개 중첩해서 사용할 수 있음
		// else 는 if와 else if가 모두 true가 아니라면 {}안에 내용을 실행함
		
		// {}내부에서 선언한 변수는 중괄호를 벗어나면 찾을 수 없음
		
		String result;
		
		char lastName = 'ㅇ';
		
		if (lastName == '김') {
			System.out.println("hi");
			result = "김씨입니다";
		}else if (lastName == '최') {
			result = "최씨입니다";
		}else if (lastName == '박') {
			result = "박씨입니다";
		}else {
			result = "해당하는 성이 없습니다.";
		}
		
		System.out.println(result);
		
		
		int num = 999999;
		
		if (num > 10000) {
			System.out.println("num이 10000보다 큽니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
