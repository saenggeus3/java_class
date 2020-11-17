import myobj.animal.Animal;

public class C10_AnonymousClass {

	//�͸� Ŭ����
	// Ŭ������ �ٷ� �����Ͽ� ����ϴ� ���
	// ���� ������� �ʰ� �ѹ��� �����
	
	public static void useAnimal(Animal animal) {
		animal.breath();
		animal.eat();
	}
	
	public static void main(String[] args) {
		
		Animal animal01 = new Animal();
		
		//�̷��� ������ Ŭ������ �ٽô� ����� �� ���� ������ �͸�Ŭ������ �Ҹ�
		//Animal�� ��ӹ��� �̸����� Ŭ������ �ۼ��� �� ����
		Animal animal02 = new Animal() {
			@Override
			public void breath() {
				System.out.println("������� ������");
			}
			@Override
			public void eat() {
				System.out.println("������� ���� �Ա�");
			}
		};
		
		//�͸����� ������ ���ο� Ŭ������ �Լ��� ���ڷ� ����
		useAnimal(new Animal() {
			@Override
			public void breath() {
				System.out.println("������� ������");
			}
			
			@Override
			public void eat() {
				System.out.println("������� ��ġĵ�Ա�");
			}
		});
		
		animal02.eat();
		animal02.breath();
		
		//�߻� Ŭ������ �ν��Ͻ�ȭ�� �Ұ�����
		abstract class Monster{
			int attack;
			int hp;
			
			public Monster(int attack, int hp) {
				this.attack = attack;
				this.hp = hp;
			
			}
			
			abstract void attack();
			abstract void attacked();
		}
		
		Monster monster = new Monster(50,300) {
			
			@Override
			void attack() {
				System.out.printf("%d�� ���ݷ����� �����մϴ�.\n",attack*150);
			}
			
			@Override
			void attacked() {
				System.out.println("ü���� 1 �����߽��ϴ�.");
			}
		};
		
		monster.attack();
		monster.attacked();
		
		
	}
	
}
