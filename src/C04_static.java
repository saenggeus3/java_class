
public class C04_static {
	
	// static (���� ����, Ŭ���� ����)  <==> (�ν��Ͻ� ����)
	// ���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� ����
	// �ν��Ͻ� ������ ������ ���ο� ������ �Ҵ�
	// ���� ������ ������� ������ �����ؼ� �����
	// static ������ Ŭ���� �� �ϳ��̱� ������ Ŭ���� �̸��� .�� ��� ����ϴ� ���� �����
	// �ν��Ͻ��� .�� ��� ����ص� �ᱹ �� ���� ���� ����Ű�� ����
	// static ������ �ڿ�(����/�޼���)�� �ν��Ͻ��� ����������� ȣ���� �� ����
	// �ν��Ͻ��� �������� ���� ���� static�� ���� ���ɼ��� �ֱ⶧���� static �޼��忡���� instance�ڿ��� ����� �� ����
	// (�ν��Ͻ����� ����ƽ������ ������ �����)
	
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

// myobj ��Ű�� ���ο� static ������ �޼��带 ���� Ŭ������ �ϳ� ����
// (������ ����, �����ڵ� ����, width/height ����)




class Card {
	// �� ī�帶�� �ٸ� ���� ������ �־�� �ϴ� ����(�ν��Ͻ�)
	// -> �ν��Ͻ� ������ ����ϱ⿡ ����
	String shape;
	int number;
	
	// ī���� ũ��� ��� ī�忡�� �ݵ�� ���ƾ� ��
	// -> ��� ī�尡 ���� ���� ������ �־�� �ϱ⿡ �ν��Ͻ������� ����ϸ� ������ �Ʊ��
	// ���������� �����
	static int width;
	static int height;
	
	// ������ ��� static block���� �ʱ�ȭ�� �����ϴ� ���� ����
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
		
		// �����ڿ��� static������ �ʱ�ȭ�ϴ°��
		// �ʱ�ȭ �������� static �ʵ带 ����� ������ ����
		//width =100;
		//height=200;
	}
	
	// static method : static ������ Ȱ���� �� �ִ� �޼���
	// �Ű������� ����ϰų� static ������ ��밡��
	// �ν��Ͻ��� �����ϰ� �׻� ������ ����� ������ �� �����
	public static void changeCardSize(int width, int height) {
		// static �޼��忡���� this�� ������������
		// this�� �ν��Ͻ��� ����Ű�°��̱� ������ static�޼��带 ���������� �ν��Ͻ��� ������������ ��������
		
		Card.width = width;
		Card.height = height;
	}
	
	public static int[] getCardSize() {
		return new int[] {width, height};
	}
	
	
}

class coffee{
	
	int from; // �������� ��ȣ�� ǥ���ϱ�� ��
	
	// ������ ��ȣ�� ��� Ŀ�ǵ��� ���� ��ȣ�� ����ؾ���
	// -> ���� ����
	final static int SOUTH_KOREA = 0;
	final static int COLUMBIA = 1;
	final static int BRAZIL = 2;
	
}



