package default_package;

//import
//다른패키지에 있는 클래스를 사용하기 위해서는 해당 클래스를 import해야함
//다른 패키지에서 미리 만들어둔 소스를 가져와서 사용할 수 있음
//같은 패키지의 미리만들어둔 소스는 import하지 않아도 사용할 수 있음
import java.util.Scanner;
import quiz.A01_printquiz;


public class B01_Scanner {
	
	public static void main(String[] args) {
		
		// java.util.Scanner 클래스
		// 프로그램 외부로부터 입력을 받을 수 있는 기능들이 모여있는 클래스
		// 어디서 입력받을지 결정하고 다양한 방법으로 입력받을 수 있다
		// 콘솔로부터 입력을 받을 때는 system.in을 이용
		
		A01_printquiz.main(null);
		
		//A00_Hello.main(null);
		
		//새로운 스캐너를 생성한 뒤 변수 sc에 생성한 스캐너를 담아놓음
		//새로운 스캐너를 생성할 때 어디서에서 입력받을지를 설정할 수 있음
		// system.out : 콘솔로 출력하는 통로
		// system.in  : 콘솔에서 입력받는 통로
		Scanner sc = new Scanner(System.in);
		
		// next()
		// 통로에 존재하는 다음 값을 하나만 꺼낸다
		// 타입을 바꾸지않음 (기본 String)
		
		// next타입()
		// 통로에 존재하는 다음 값을 하나만 꺼낸 뒤 해당타입으로 변환
		// 통로에 아무 값도 없다면 입력이 될때까지 기다림
		// 통로에 존재하는 다음 값이 해당타입이 될 수 없다면 에러가 발생함
		
		// nextLine()
		// 통로에 존재하는 값을 중 한 줄을 가져옴 (\n으로 구분)
		
		System.out.println("아무 값이나 입력하세요 > ");
		int num = sc.nextInt();
		
		System.out.println("입력 받은 값 : " + num);
		System.out.println("입력 받은 값의 제곱" + Math.pow(num, 2));
		
		int num2 = sc.nextInt();
		System.out.println("두번째 값 : " + num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
	}

}
