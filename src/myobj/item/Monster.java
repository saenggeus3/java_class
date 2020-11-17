package myobj.item;

abstract public class Monster {
	
	int hp;
	int damage;
	int defense;
	int ml;
	
	public Monster() {
		hp=100;
	}
	
	public Monster(int ml) {
		this.hp = hp*ml;
	}
	abstract public void respawn(int ml);
	abstract public void monAtk(Monster m,Sword s);
	abstract public void drop();
	abstract public void skill(Monster m, Sword s);
	
	

}


class Warrior extends Monster{
	public Warrior(int ml) {
		this.hp = 500*ml;
		this.damage = 20;
		this.defense = 10;
		this.ml = ml;
	}
	
	@Override
	public void monAtk(Monster m,Sword s) {
		System.out.println("몬스터의 공격!");
		System.out.println("나의 hp : "+s.user_hp);
		System.out.println("받은 데미지 : "+(m.damage));
		s.user_hp -= m.damage;
		if(s.user_hp<1) {
			System.out.println("나의 hp : 0");
			System.out.println("사망");
		}else {
			System.out.println("나의 hp : "+s.user_hp);
		}
	}

	@Override
	public void drop() {
		
		
	}

	@Override
	public void skill(Monster m, Sword s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void respawn(int ml) {
		
	}
}



class Mage extends Monster{
	public Mage(int ml) {
		this.hp = 200*ml;
		this.damage = 50;
		this.defense = 5;
		this.ml = ml;
	}

	@Override
	public void monAtk(Monster m, Sword s) {
		System.out.println("몬스터의 공격!");
		System.out.println("나의 hp : "+s.user_hp);
		System.out.println("받은 데미지 : "+(m.damage));
		s.user_hp -= m.damage;
		if(s.user_hp<1) {
			System.out.println("나의 hp : 0");
			System.out.println("사망");
		}else {
			System.out.println("나의 hp : "+s.user_hp);
		}
	}

	@Override
	public void drop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void skill(Monster m, Sword s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void respawn(int ml) {
		// TODO Auto-generated method stub
		
	}
}



class Archer extends Monster{
	public Archer(int ml) {
		this.hp = 300*ml;
		this.damage = 30;
		this.defense = 5;
		this.ml = ml;
	}

	@Override
	public void monAtk(Monster m, Sword s) {
		System.out.println("몬스터의 공격!");
		System.out.println("나의 hp : "+s.user_hp);
		System.out.println("받은 데미지 : "+(m.damage));
		s.user_hp -= m.damage;
		if(s.user_hp<1) {
			System.out.println("나의 hp : 0");
			System.out.println("사망");
		}else {
			System.out.println("나의 hp : "+s.user_hp);
		}
	}

	@Override
	public void drop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void skill(Monster m, Sword s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void respawn(int ml) {
		// TODO Auto-generated method stub
		
	}
}












