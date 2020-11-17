import java.util.Scanner;

public class C02_OOP {
	
	
	
	public static void main(String[] args) {
		
		// 객체지향 프로그래밍 (OOP : Object Oriented Programming)
		// 세상에 존재하는 모든 것을 변수와 함수로 표현하려는 프로그래밍 방법
		//  ex 강의실 -> 인원 수(변수), 최대 수용인원(상수)
			// 사람이 들어옴 : 인원수++;
		// 변수와 함수를 무분별하게 사용하기 보다는 현실에 존재하는 객체처럼 보이도록 하여 가독성을 올림
		// 객체(Object) : 세상에 존재하는 모든 개념 (사물, 개념, 알고리즘 등등...)
		
		// ex 사과
		// 사과의 변수 : 크기, 색, 수확 날짜, 당도, 칼로리, ...
		// 사과의 메서드 : 
		//		먹는다 (크기, 칼로리 변화)
		//		갈변  (색, 당도변화)
		//		던진다 (보유한 데미지에 따라 맞았을 때 아픈 정도가 달라짐)
		
		// 메서드 : 객체의 변수에 영향을 미치는 함수를 메서드라고 부름
		
		// 클래스 (class)
		// 객체를 프로그래밍 언어로 표현한 것
		// 클래스는 객체의 설계도 (정의한 시점에서는 실체가 없음)
		// 클래스를 통해 생성하는 실제 객체를 '인스턴스'라고 부름
		// 클래스는 참조형 변수 타입
		//	 만약 사과 클래스를 만든다면 사과 타입을 사용할 수 있게됨
		
		// Scanner 설계도로 실체(Scanner 인스턴스)를 만들어 그 실체의 주소를 변수 sc에 저장
		Scanner sc = new Scanner(System.in);
		
		// Apple 설계도로 실체(Apple 인스턴스)를 만들고 그 실체의 주소를 변수 apple01에 저장
		Apple apple1 = new Apple();
		Apple apple2 = new Apple();
		Apple apple3 = new Apple();
		
		// 클래스 타입 배열을 만듬 시점에서는 인스턴스가 생성되지 않음
		// (배열의 실체만 생성됨)
		Apple[] appleBox = new Apple[10];
		
		apple1.birthday = "2020/10/29";
		apple1.size = 10;
		apple1.calorie = apple1.size * 10;
		apple1.color = "red";
		apple1.sweet = 7;
		
		apple1.eat();
		apple1.eat();
		apple1.eat();
		apple1.eat();
		
		
		
		
		
		
		
	}

}
// 들여쓰기를 잘 맞춰놨다면 중괄호만 봐도 클래스 바깥인것을 짐작할 수 있음
class Apple{
	
	// 인스턴스 변수
	// 모든 인스턴스마다 각자 다른 값을 가지고 있는 변수
	// 필드, 멤버변수, 인스턴스변수, 상태 .. 등 다양하게 부름
	int size;
	int sweet;
	int calorie;
	int damage;
	String color;
	String birthday;
	
	//인스턴스 메서드
	// 인스턴스 변수를 활용하는 메서드
	// 기능, 메서드, 함수
	void eat() {
		System.out.println(this.sweet + "만큼 기분이 좋아졌습니다.");
		this.size-=1;
		this.calorie -= 10;
		System.out.printf("크기 : %d, 보유 칼로리 : %d\n",this.size,this.calorie);
	}
}

//ex 사과
			// 사과의 변수 : 크기, 색, 수확 날짜, 당도, 칼로리, ...
			// 사과의 메서드 : 
			//		먹는다 (크기, 칼로리 변화)
			//		갈변  (색, 당도변화)
			//		던진다 (보유한 데미지에 따라 맞았을 때 아픈 정도가 달라짐)











