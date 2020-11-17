
public class C08_innerClass {
	
	//클래스 내부에 클래스 사용하기
	public static void main(String[] args) {
		
		AppleBox box = new AppleBox(20);
		System.out.println(box.box[0].color);
		
		// 외부에서 다른 클래스의 inner class를 사용하기 (거의안함)
		AppleBox.Apple apple01 = new AppleBox(10).new Apple();
		
		System.out.println(apple01.color);
		
	}

}
//outer class (외부 클래스)
// 접근 제어자에 default와 public만 사용할 수 있음 (내부에 속해있지 않기때문)
class AppleBox{
	Apple[] box;
	
	public AppleBox(int size) {
		box = new Apple[size];
		for (int i = 0; i < box.length; i++) {
			// 같은 클래스 내부의 자원 이기 때문에 this를 생략하고 사용할 수 있음
			box[i] = new Apple();
		}
	}
	
	//inner class (내부 클래스)
	// AppleBox의 인스턴스가 생기기전에는 inner class Apple이 존재하지 않음
	// 접근 제어자를 자유롭게 사용할 수 있음
	// outer class의 필드에 따라 달라지는 클래스를 작성할 수 있음(동적 클래스 작성)
	public class Apple{
		int color;
		int size;
	}
	
}
