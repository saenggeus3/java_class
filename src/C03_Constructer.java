
public class C03_Constructer {
	
	// 클래스의 생성자 (Constructor)
	
	// 클래스의 이름과 똑같은 이름의 함수 
	// new와 함께 생성자를 호출하면 클래스의 정의된대로 인스턴스가 생성됨
	// 생성자가 모두 실행된 후에는 생성된 인스턴스의 주소가 반환됨
	// 생성자를 따로 정의하지 않으면 아무것도 정의되지 않은 기본 생성자가 자동으로 생성됨
	//	기본생성자 - 매개변수가 없는 생성자
	
	public static void main(String[] args) {
		Orange o1 = new Orange(10,10,"오렌지");
		
		System.out.println(o1.color);
		System.out.println(o1.size);
		System.out.println(o1.sweet);
		
		Strawberry s1 = new Strawberry();
		
		s1.color = "red";
		
		Grape g1 = new Grape(30);
		for (int i = 0; i < 31; i++) {
			g1.eat();
		}
		
	}

}


class Orange{
	
	int sweet;
	int size;
	String color;
	
	// 생성자
	// 리턴타입이 없고 클래스명과 같은 이름을 가짐
	// 인스턴스 생성시에 가장 먼저 호출됨
	// 주로 인스턴스 변수 값을 초기화하는 용도로 사용함
	public Orange() {
		// 평상시에는 클래스 내부에서 this를 생략해도 필드에 접근할 수 있음
		sweet = 10;
		size = 5;
		color = "orange";
		
	}
	
	//생성자도 함수처럼 오버로딩이 가능함
	// 하나의 클래스가 다양한 형태의 생성자를 가지고 있을 수 있음
	public Orange(int sweet, int size, String color) {
		// 필드값과 지역변수명이 겹치는 경우
		// this를 통해 어느쪽 변수인지 명확하게 지정할 수 있음
		
		// this 
		// 클래스 내부에서 현재 인스턴스를 참조할 때 사용하는 키워드
		
		this.sweet = sweet;
		this.size = size;
		this.color = color;
		
	}
	
	
	
}


class Strawberry{
	int seed;
	String color;
}

class Grape{
	int podo;
	int skin;
	
	// 다른생성자가 있어 기본생성자가 생성되지 않으므로 직접 정의
	public Grape() {
		//생성자에서 this()를 통해 다른생성자를 호출할수 잇음
		this(20); //  Grape(20)이 호출됨
		System.out.println("기본생성자로 돌아왔습니다.");
		// 다른 생성자는 반드시 생성자 맨 윗줄에서 호출해야함 (this(20)으로 갔다가 끝나면 다시 기본생성자로 돌아와 sysout을 실행시키고 끝남)
	}
	
	public Grape(int podo) {
		this.podo = podo;
		this.skin = 0;
	}
	
	public void eat() {
		if(podo==0) {
			System.out.println("이 포도는 다 먹었습니다.");
			return;
		}
		
		podo--;
		skin++;
		System.out.printf("현재 남은 포도는 %d개, 잔해는 %d개 입니다.\n",podo,skin);
	}
	
}
















