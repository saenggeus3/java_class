package myobj.poker_an;

public enum Suit {
	// order와 name은 기본적으로 설정됨
	// 상수를 추가하고 싶다면 생성자를 이용
	SPADE(3,'♠'),	// order 0, name "SPADE"	, suitValue 3
	DIAMOND(2,'◆'),	// order 1, name "DIAMOND" 	, suitValue 2
	HEART(1,'♥'),	// order 2, name "HEART"	, suitValue 1
	CLUB(0,'♣');	// order 3, name "CLUB"		, suitValue 0
	
	private int SuitValue;
	private char suitPic;
	
	//enum타입 객체는 생성자가 반드시 private로 만들어짐
	Suit(int SuitValue, char suitPic){
		this.SuitValue = SuitValue;
		this.suitPic = suitPic;
	}
	
	public static final int NUM_OF_SUIT=4;
	
	//Ctrl + Space 로 get만치면 알아서 private 멤버변수를 찾아서 메서드를 생성해줌
	
	public char getSuitPic() {
		return suitPic;
	}
	
	public int getSuitValue() {
		return SuitValue;
	}
	
}
