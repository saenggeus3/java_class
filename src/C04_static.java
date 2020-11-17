
public class C04_static {
	
	// static (정적 영역, 클래스 영역)  <==> (인스턴스 영역)
	// 같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역
	// 인스턴스 영역은 생성시 새로운 공간을 할당
	// 정적 영역은 만들어진 공간을 공유해서 사용함
	// static 영역은 클래스 당 하나이기 때문에 클래스 이름에 .을 찍고 사용하는 것이 권장됨
	// 인스턴스에 .을 찍고 사용해도 결국 다 같은 값을 가르키기 때문
	// static 영역의 자원(변수/메서드)은 인스턴스가 생기기전에도 호출할 수 있음
	// 인스턴스가 존재하지 않을 때도 static이 사용될 가능성이 있기때문에 static 메서드에서는 instance자원을 사용할 수 없음
	// (인스턴스에서 스태틱으로의 접근은 허용함)
	
	public static void main(String[] args) {
//		System.out.println(Card.width);
//		System.out.println(Card.height);
//		
//		
//		
		Card s1 = new Card("Spade",1);
		Card s2 = new Card("Spade",1);
//		Card s3 = new Card("Spade",1);
//		Card h1 = new Card("Heart",1);
//		
//		Card.width = 333;
//		
//		System.out.println(Card.width);
//		System.out.println(s1.width);
//		System.out.println(s2.width);
//		System.out.println(s3.width);
		
	}

}

// myobj 패키지 내부에 static 변수와 메서드를 가진 클래스를 하나 설계
// (원산지 금지, 지역코드 금지, width/height 금지)




class Card {
	// 각 카드마다 다른 값을 가지고 있어야 하는 변수(인스턴스)
	// -> 인스턴스 영역을 사용하기에 적합
	String shape;
	int number;
	
	// 카드의 크기는 모든 카드에서 반드시 같아야 함
	// -> 모든 카드가 같은 값을 가지고 있어야 하기에 인스턴스영역을 사용하면 공간이 아까움
	// 정적영역을 사용함
	static int width;
	static int height;
	
	// 생성자 대신 static block에서 초기화를 진행하는 것이 좋음
	static {
		width = 100;
		height = 200;
		System.out.println("static block called");
	}
	
	{
		System.out.println("instance block called");
	}
	
	public Card(String shape, int number) {
		this.shape = shape;
		this.number = number;
		
		System.out.println("constructor called");
		
		// 생성자에서 static변수를 초기화하는경우
		// 초기화 되지않은 static 필드를 사용할 위험이 있음
		//width =100;
		//height=200;
	}
	
	// static method : static 변수만 활용할 수 있는 메서드
	// 매개변수만 사용하거나 static 변수만 사용가능
	// 인스턴스와 무관하게 항상 일정한 기능을 구현할 때 사용함
	public static void changeCardSize(int width, int height) {
		// static 메서드에서는 this가 존재하지않음
		// this는 인스턴스를 가르키는것이기 때문에 static메서드를 실행했을때 인스턴스가 존재하지않을 수가있음
		
		Card.width = width;
		Card.height = height;
	}
	
	public static int[] getCardSize() {
		return new int[] {width, height};
	}
	
	
}

class coffee{
	
	int from; // 원산지를 번호로 표현하기로 함
	
	// 원산지 번호는 모든 커피들이 같은 번호를 사용해야함
	// -> 공동 영역
	final static int SOUTH_KOREA = 0;
	final static int COLUMBIA = 1;
	final static int BRAZIL = 2;
	
}



