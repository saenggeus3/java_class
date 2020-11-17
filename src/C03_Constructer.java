
public class C03_Constructer {
	
	// Ŭ������ ������ (Constructor)
	
	// Ŭ������ �̸��� �Ȱ��� �̸��� �Լ� 
	// new�� �Բ� �����ڸ� ȣ���ϸ� Ŭ������ ���ǵȴ�� �ν��Ͻ��� ������
	// �����ڰ� ��� ����� �Ŀ��� ������ �ν��Ͻ��� �ּҰ� ��ȯ��
	// �����ڸ� ���� �������� ������ �ƹ��͵� ���ǵ��� ���� �⺻ �����ڰ� �ڵ����� ������
	//	�⺻������ - �Ű������� ���� ������
	
	public static void main(String[] args) {
		Orange o1 = new Orange(10,10,"������");
		
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
	
	// ������
	// ����Ÿ���� ���� Ŭ������� ���� �̸��� ����
	// �ν��Ͻ� �����ÿ� ���� ���� ȣ���
	// �ַ� �ν��Ͻ� ���� ���� �ʱ�ȭ�ϴ� �뵵�� �����
	public Orange() {
		// ���ÿ��� Ŭ���� ���ο��� this�� �����ص� �ʵ忡 ������ �� ����
		sweet = 10;
		size = 5;
		color = "orange";
		
	}
	
	//�����ڵ� �Լ�ó�� �����ε��� ������
	// �ϳ��� Ŭ������ �پ��� ������ �����ڸ� ������ ���� �� ����
	public Orange(int sweet, int size, String color) {
		// �ʵ尪�� ������������ ��ġ�� ���
		// this�� ���� ����� �������� ��Ȯ�ϰ� ������ �� ����
		
		// this 
		// Ŭ���� ���ο��� ���� �ν��Ͻ��� ������ �� ����ϴ� Ű����
		
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
	
	// �ٸ������ڰ� �־� �⺻�����ڰ� �������� �����Ƿ� ���� ����
	public Grape() {
		//�����ڿ��� this()�� ���� �ٸ������ڸ� ȣ���Ҽ� ����
		this(20); //  Grape(20)�� ȣ���
		System.out.println("�⺻�����ڷ� ���ƿԽ��ϴ�.");
		// �ٸ� �����ڴ� �ݵ�� ������ �� ���ٿ��� ȣ���ؾ��� (this(20)���� ���ٰ� ������ �ٽ� �⺻�����ڷ� ���ƿ� sysout�� �����Ű�� ����)
	}
	
	public Grape(int podo) {
		this.podo = podo;
		this.skin = 0;
	}
	
	public void eat() {
		if(podo==0) {
			System.out.println("�� ������ �� �Ծ����ϴ�.");
			return;
		}
		
		podo--;
		skin++;
		System.out.printf("���� ���� ������ %d��, ���ش� %d�� �Դϴ�.\n",podo,skin);
	}
	
}
















