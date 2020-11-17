package default_package;

public class A03_varTypes {
	
	public static void main(String[] args) {
		
		/*
		 	정수타입
		 	타입마다 데이터를 저장할 수 있는 크기가 다름
		 	byte  (1byte)	-128	~ +127
		 	char  (2byte)	0		~ +65535 (문자에 최적화)
		 	short (2byte)	-32768 	~ +32767
		 	int   (4byte)	-2^16 	~ +2^16 대략 -21억 ~ 21억정도
		 	long  (8byte)
		 */
		
		// int의 범위를 벗어나는 숫자를 적을땐 뒤에 l을 붙여야함 (대소문자 상관x)
		long _long = 9000000000L;
		
		
		/*
		 	실수 타입 (거의 그래픽 계산에 사용됨)
		 	부동소수점 방식을 사용함
		 	
		 	 float  (4byte)
		 	 double (8byte)
		 */
		
		// float값을 적을땐 뒤에 f를 붙여야함
		float _float = 123.123f;
		double _double = 123.123;
		
		// 리터럴 (literal)
		// 그냥 적는 값
		// - "", '', 소수, 소수f, 정수, 정수l ...
		// - 0숫자(8진수) , 0x숫자(16진수) , 0b숫자(2)
		// true , false
		
		System.out.println("111(10) : " + 111);
		System.out.println("111(8) : " + 0111);
		System.out.println("111(6) : " + 0x111);
		
		
		/*
		 	참/거짓 타입
		 	boolean : true, false 두가지 값만 대입할 수 있는 변수 타입 
		 */
		
		
		/*
		 	참조형 타입 (클래스 타입)
		 	String : 문자열
		 	그 외 모든 클래스들...
		 	대문자로 시작하는 모든 타입들은 참조형 타입
		 	! String에 S가 대문자
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
