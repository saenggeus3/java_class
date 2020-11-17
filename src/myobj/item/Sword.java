package myobj.item;

public class Sword {
	
	// 필드
	// 공격력
	// 강화수치
	// 강화확률 (강화 수치에따라 다름)
	int damage;
	int reinforcement;	//수치
	int reinforce_probability;	//확률
	int num_reinforce;	//횟수
	int max_reinforcement=20;
	int user_hp;
	
	// 메서드
	// 강화하기 (성공률에 따라 성공실패가 적용됨)
	// 최대 강화 레벨까지 도달하기에 걸린 강화 횟수를 출력
	// 공격 (대상에게 공격력 만큼의 데미지를 입힘)
	// 대상이 되는 객체는 HP가 있어야함
	
	// 인스턴스 메서드를 만들 때는 static을 빼야함
	// static 메서드는 인스턴스 변수를 활용할 수 없음
	
	public Sword() {
		damage = (int)(Math.random()*99+1);
		reinforcement = 0;
		reinforce_probability = 0;
		num_reinforce = 0;
	}
	
	public void reinforce() {
		if(100-reinforce_probability<1 || reinforcement == max_reinforcement) {
			System.out.println("더이상 강화할 수 없습니다");
			return;
		}
		
		if(probability(reinforce_probability)) {
			System.out.println();
			System.out.println("강화성공");
			reinforcement++;
			damage+=damage/10;
		}else {
			if(probability(50)) {
				System.out.println();
				System.out.println("강화실패");
			}else {
				System.out.println();
				System.out.println("강화실패 등급하락");
				if(reinforcement<0) {
					reinforcement=0;
				}else {
					reinforcement--;
					damage -= damage/10;
				}
			}
		}
		reinforce_probability+=(int)(Math.random()*5+1);
		num_reinforce++;
		}
	
	
	
	public void stat() {
		System.out.println("공격력 : " + damage);
		System.out.println("강화수치 : +"+reinforcement);
		if (0<100-reinforce_probability) {
			System.out.println("현재강화확률 : "+(100-reinforce_probability)+"%");
		}else {
			System.out.println("현재강화확률 : 0%");
		}
		
	}
	
	public boolean probability(int reinforce_probability) {
		int ran = (int)(Math.random()*99+1);
		int n = 100-reinforce_probability;
		
		if(ran<n) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public void atk(Sword s1,Monster m1) {
		System.out.println("공격!");
		System.out.println("몬스터 hp : "+m1.hp);
		System.out.println("가한 데미지 : "+(s1.damage-m1.defense));
		m1.hp -= s1.damage-m1.defense;
		if(m1.hp<1) {
			System.out.println("몬스터 hp : 0");
			System.out.println("처치!");
		}else {
			System.out.println("몬스터 hp : "+m1.hp);
		}
	}
	
	
	
}
