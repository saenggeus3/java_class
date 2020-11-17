
public class C08_innerClass {
	
	//Ŭ���� ���ο� Ŭ���� ����ϱ�
	public static void main(String[] args) {
		
		AppleBox box = new AppleBox(20);
		System.out.println(box.box[0].color);
		
		// �ܺο��� �ٸ� Ŭ������ inner class�� ����ϱ� (���Ǿ���)
		AppleBox.Apple apple01 = new AppleBox(10).new Apple();
		
		System.out.println(apple01.color);
		
	}

}
//outer class (�ܺ� Ŭ����)
// ���� �����ڿ� default�� public�� ����� �� ���� (���ο� �������� �ʱ⶧��)
class AppleBox{
	Apple[] box;
	
	public AppleBox(int size) {
		box = new Apple[size];
		for (int i = 0; i < box.length; i++) {
			// ���� Ŭ���� ������ �ڿ� �̱� ������ this�� �����ϰ� ����� �� ����
			box[i] = new Apple();
		}
	}
	
	//inner class (���� Ŭ����)
	// AppleBox�� �ν��Ͻ��� ����������� inner class Apple�� �������� ����
	// ���� �����ڸ� �����Ӱ� ����� �� ����
	// outer class�� �ʵ忡 ���� �޶����� Ŭ������ �ۼ��� �� ����(���� Ŭ���� �ۼ�)
	public class Apple{
		int color;
		int size;
	}
	
}
