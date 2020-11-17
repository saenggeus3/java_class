
public class B00_operator01 {
	
	public static void main(String[] args) {
		
		//연산자 (operator)
		// 계산할 때 사용하는 것
		
		// 산술 연산자
		
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.printf("a = %d, b = %d\n",a,b);
		
		// 연산의 우선 순위는 사칙 연산의 우선순위를 따름
		System.out.println("+ : " + (a + b));
		System.out.println("- : " + (a - b));
		System.out.println(a * b);
		
		//정수끼리 나누면 몫만 나옴
		System.out.println(a / b);
		//정수와 실수를 나누면 정확한 계산을함
		System.out.println(a / c);
		System.out.println(a / (double)b);
		System.out.println(a % b);//나머지연산
		
		//제곱 (결과 double타입)
		System.out.println(Math.pow(a, b));
		//제곱근
		System.out.println(Math.sqrt(2));
		//절대값
		System.out.println(Math.abs(-20));
		//반올림
		System.out.println(Math.round(1.856));
		//올림
		System.out.println(Math.ceil(1.001));
		//내림
		System.out.println(Math.floor(1.999));
		
		System.out.println("더 큰숫자 : " + Math.max(a, b));
		System.out.println("더 작은숫자 : " + Math.min(a, b));
		
		System.out.println(a ^ b);//제곱x XOR
		// 10 = 1010
		// 7  = 0111 ^	서로다르면 1
		//	   ------
		//		1101
		// 1101 = 13
		
	}

}
