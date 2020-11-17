package quiz;

public class C01_functionQuiz {
	
	public static boolean alpha(String str) {
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) < 'a' || str.charAt(i) > 'z') {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static boolean multi3(int n) {
		return n%3==0;
	}
	
	public static String numcheck(int n) {
		return n % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	public static boolean prime(int n) {
		if(n==1) {
			return false;
		}
		
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int factorial(int n) {
		
		if(n==1) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
	
	public static int pow(int n, int n2) {
		int result = 1;
		
		if(n2==0) {
			return result;
		}
		
		for (int i = 0; i < n2; i++) {
			result = result*n;
		}
		
		return result;
	}
	
	public static int recursive_pow(int n, int n2) {
		if(n2==0) {
			return 1;
		}
		
		return n*recursive_pow(n, n2-1);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//다음 함수를 정의
		
		// 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
		System.out.println(alpha("ABCㅁ"));
		
		// 전달한 숫자가 3의 배수이면 true를 반환 아니면 false를 반환하는 함수
		System.out.println(multi3(13));
		
		// 숫자를 한 개 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
		System.out.println(numcheck(-2));
		
		// 전달한 숫자가 소수인지 아닌지 판별해주는 함수 (boolean)
		System.out.println(prime(15));
		
		// 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
		// 팩토리얼(factorial) : (n)*(n-1)*(n-2) ... 3*2*1
		System.out.println(factorial(4));
		
		// 숫자 두개를 전달하면 a의 b제곱을 반환하는 함수
		// (0제곱은 1을 반환해야함, Math.pow금지)
		System.out.println(pow(2, 5));
		System.out.println(recursive_pow(2,5));
		

		
		
		
	}

}
