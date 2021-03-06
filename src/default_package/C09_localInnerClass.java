package default_package;

public class C09_localInnerClass {
	
	//지역 내부 클래스
	// 메서드 내부에서도 클래스 사용이 가능하다
	// 메서드의 범위를 벗어날 수 없다
	
	void method() {
		class Apple{
			int size;
			String color;
		}
		Apple a = new Apple();
		System.out.println(a.size);
	}
	
	public static void main(String[] args) {
		
		String a = "대구";
		String b = "빨간색";
		
		//지역내부 클래스 (메서드가 끝나면 클래스도 사라지게 됨)
		class Apple{
			String addr=a;
			String color=b;
		}
		Apple apple = new Apple();
		
		System.out.println(apple.addr);
	}
	
}
