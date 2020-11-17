package myobj.poker_an;

public enum Suit {
	// order�� name�� �⺻������ ������
	// ����� �߰��ϰ� �ʹٸ� �����ڸ� �̿�
	SPADE(3,'��'),	// order 0, name "SPADE"	, suitValue 3
	DIAMOND(2,'��'),	// order 1, name "DIAMOND" 	, suitValue 2
	HEART(1,'��'),	// order 2, name "HEART"	, suitValue 1
	CLUB(0,'��');	// order 3, name "CLUB"		, suitValue 0
	
	private int SuitValue;
	private char suitPic;
	
	//enumŸ�� ��ü�� �����ڰ� �ݵ�� private�� �������
	Suit(int SuitValue, char suitPic){
		this.SuitValue = SuitValue;
		this.suitPic = suitPic;
	}
	
	public static final int NUM_OF_SUIT=4;
	
	//Ctrl + Space �� get��ġ�� �˾Ƽ� private ��������� ã�Ƽ� �޼��带 ��������
	
	public char getSuitPic() {
		return suitPic;
	}
	
	public int getSuitValue() {
		return SuitValue;
	}
	
}
