package default_package;

public class B02_operator02 {
	
	public static void main(String[] args) {
		
		// 비교 연산
		// 비교연산의 결과는 참 또는 거짓 (boolean타입)
		// 산술연산과 비교연산이 함께 있으면 산술연산을 먼저 계산
		
		int a = 7, b = 9;
		
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(a == b);
		System.out.println(a != b);
		
		// 논리 연산
		// && : 비교하는값이 모두 true일 때 true (AND) 
		// || : 비교하는값 중 하나만 true여도 true (OR)
		// !  : true면 false, false면 true (NOT)
		
		System.out.println((a>5) && (b>8));
		
		
	}

}
