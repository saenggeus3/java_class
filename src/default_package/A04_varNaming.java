package default_package;

public class A04_varNaming {
	
	public static void main(String[] args) {
		
		//변수를 사용해야하는 이유
		//값을 한번에 변경 가능
		//값에 의미를 부여해서 소스코드의 가독성을 올림
		
		int apple_count = 45;
		int apple_price = 485;
		int apple_gram = 50;
		System.out.println(apple_count * apple_price + "원 입니다.");
		System.out.println(apple_count * apple_gram + "g 입니다.");
		
		// 변수 작명 규칙 (권장사항)
		
		// 두 단어 이상을 이어붙인 경우 _를 활용한다 (snake_case)
		// ex: apple_count, apple_calorie
		
		// 두 단어 이상을 이어붙인 변수명을 사용할 때 대문자를 활용 (CamelCase)
		// ex: appleCount, appleCalorie
		
		// 변수명의 첫 글자는 소문자를 사용함 (클래스명 첫 글자에 대문자를 사용)
		
		// 프로그램 내에서 값이 변하지 않을 변수(상수)는 모두 대문자를 사용함
		// ex: APPLE_PRICE
		
		// 변수의 내용을 추측할 수 있는 적절한 단어를 사용
		
		
		
		// 변수의 작명 규칙 (필수)
		
		//변수명 첫번째 글자는 숫자가 될 수 없음
		
		//변수 사이에는 공백을 사용할 수 없음
		
		//특수문자는 _와 $만 사용할 수 있음
		
		//이미 자바에서 사용하고 있는 키워드는 사용할 수 없음
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
