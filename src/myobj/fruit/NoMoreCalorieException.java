package myobj.fruit;

// 예외 클래스를 상속받으면 반드시 처리해야하는 예외가 됨
public class NoMoreCalorieException extends Exception {

	public NoMoreCalorieException() {
		super("더이상 먹을 수 없는 사과");
	}
	
}
