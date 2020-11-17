
public class B08_operator04 {
	
	public static void main(String[] args) {
		
		// 대입연산
		// = : 왼쪽의 변수에 오른쪽의 값을 대입
		
		int num = 10;
		num +=5;
		
		// 복합 대입 연산
		// 변수에 결과를 누적시키는 연산
		num = 10;
		System.out.println(num += 2);
		System.out.println(num -= 2);
		System.out.println(num *= 2);
		System.out.println(num /= 2);
		System.out.println(num %= 2);
		
		num = 10;
		// 단항 연산
		num++;
		++num;
		// num의값을 1증가시킴
		
		//++,--의 위치의 따라 실행 결과가 달라지기도함
		int a=10, b=3;
		int result = a++*b;
		a--;
		//위의 결과는 result=30 a=11 b=3 변수뒤에 ++은 해당식이 끝난 후 a에 1을더함
		result = ++a*b;
		//앞에 ++가잇으면 a에 1을먼저더한후 계산함 result=33
		
		
		System.out.println(result);
		
		
	}

}
