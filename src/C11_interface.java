import myobj.animal.Animal;

public class C11_interface {
	
	// �������̽� (interface)
	// abstract class�� ���������� ������ ��ӹ��� �� �ִ� ��
	// �߻��� ���� Ŭ������ ������ �ο��ϰ� ������
	// �̹� ��ӹ��� Ŭ������ �ִ� ��� �������̽��� �����
	// �������̽��ε� ��ĳ������ ������
	// �������̽��� �޼���� �ڵ����� abstract public�޼��尡 ��
	// �������̽��� ������ �ڵ����� final static�� ��
	// �������̽��� default method : �⺻�������ִ� �޼��带 ������
	// �������̽��� static : ��� �������̽����� �������� ����ϴ� �޼��带 ������ �� �ִ�
	
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
				System.out.println("�͸��� ���������� �������� �߽��ϴ�.");				
			}
			
			@Override
			public void kick() {
				System.out.println("�͸��� ���������� �����⸦ ������ �߽��ϴ�.");				
			}
		});
	}

}

interface Swimmer{
	double water_regist = 123; // final static    �������̽� Ÿ���� ������ �޼��忡 �ڵ����� ����
	void swim(); // abstract public
	default void kick() {
		System.out.println("���屸ġ��");
	}
	default void front() {
		System.out.println("�������ġ��");
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
// �������̽� ������ ����� ���� �� �ְ�, ������ ���� �� ����
interface Fishing extends BoatDriving, CookFish{
	void fish();
}

class Bear extends Animal implements Swimmer,Fishing{
	@Override
	public void swim() {
		System.out.println("����");
	}
	@Override
	public void fish() {
		System.out.println("������");
		
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