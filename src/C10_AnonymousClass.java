import myobj.animal.Animal;

public class C10_AnonymousClass {

	//익명 클래스
	// 클래스를 바로 구현하여 사용하는 방식
	// 따로 저장되지 않고 한번만 사용함
	
	public static void useAnimal(Animal animal) {
		animal.breath();
		animal.eat();
	}
	
	public static void main(String[] args) {
		
		Animal animal01 = new Animal();
		
		//이렇게 생성한 클래스는 다시는 사용할 수 없기 때문에 익명클래스라 불림
		//Animal을 상속받은 이름없는 클래스를 작성할 수 있음
		Animal animal02 = new Animal() {
			@Override
			public void breath() {
				System.out.println("물고기의 숨쉬기");
			}
			@Override
			public void eat() {
				System.out.println("물고기의 먹이 먹기");
			}
		};
		
		//익명으로 선언한 새로운 클래스를 함수의 인자로 전달
		useAnimal(new Animal() {
			@Override
			public void breath() {
				System.out.println("고양이의 숨쉬기");
			}
			
			@Override
			public void eat() {
				System.out.println("고양이의 참치캔먹기");
			}
		});
		
		animal02.eat();
		animal02.breath();
		
		//추상 클래스는 인스턴스화가 불가능함
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
				System.out.printf("%d의 공격력으로 공격합니다.\n",attack*150);
			}
			
			@Override
			void attacked() {
				System.out.println("체력이 1 감소했습니다.");
			}
		};
		
		monster.attack();
		monster.attacked();
		
		
	}
	
}
