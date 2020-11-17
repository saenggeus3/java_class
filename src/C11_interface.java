import myobj.animal.Animal;

public class C11_interface {
	
	// 인터페이스 (interface)
	// abstract class와 유사하지만 여러개 상속받을 수 있는 것
	// 추상을 통해 클래스에 성질을 부여하고 싶지만
	// 이미 상속받은 클래스가 있는 경우 인터페이스를 사용함
	// 인터페이스로도 업캐스팅이 가능함
	// 인터페이스의 메서드는 자동으로 abstract public메서드가 됨
	// 인터페이스의 변수는 자동으로 final static이 됨
	// 인터페이스의 default method : 기본동작이있는 메서드를 정의함
	// 인터페이스의 static : 모든 인터페이스에서 공통으로 사용하는 메서드를 구현할 수 있다
	
	public static void swimContest(Swimmer s) {
		System.out.println(Swimmer.getTime());
		s.swim();
		s.kick();
		s.front();
	}
	public static void main(String[] args) {
		swimContest(new Bear());
		swimContest(new Swimmer() {
			@Override
			public void swim() {
				System.out.println("익명의 수영선수는 자유영을 했습니다.");				
			}
			
			@Override
			public void kick() {
				System.out.println("익명의 수영선수는 발차기를 열심히 했습니다.");				
			}
		});
	}

}

interface Swimmer{
	double water_regist = 123; // final static    인터페이스 타입의 변수와 메서드에 자동으로 붙음
	void swim(); // abstract public
	default void kick() {
		System.out.println("물장구치기");
	}
	default void front() {
		System.out.println("마구헤엄치기");
	}
	
	static long getTime() {
		return System.currentTimeMillis();
	}
}

interface CookFish {
	void cookfish();
}

interface BoatDriving{
	void driveboat();
}
// 인터페이스 끼리도 상속을 받을 수 있고, 여러개 받을 수 있음
interface Fishing extends BoatDriving, CookFish{
	void fish();
}

class Bear extends Animal implements Swimmer,Fishing{
	@Override
	public void swim() {
		System.out.println("곰영");
	}
	@Override
	public void fish() {
		System.out.println("곰낚시");
		
	}
	@Override
	public void driveboat() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cookfish() {
		// TODO Auto-generated method stub
		
	}
	
	
}