package myobj.item;

import java.util.Scanner;

public class Battle {
	
	int ml = swordTest.ml;
	
	Monster warrior = new Warrior(ml);
	Monster mage = new Mage(ml);
	Monster archer = new Archer(ml);

	public Monster SelectMonster() {
		while(true) {
			System.out.println("1.전사");
			System.out.println("2.마법사");
			System.out.println("3.궁수");
			System.out.print(" > ");
			int n = new Scanner(System.in).nextInt();
			
			if(n==1) {
				return warrior;
			}else if(n==2) {
				return mage;
			}else if(n==3){
				return archer;
			}else {
				System.out.println("잘못된 입력");
			}
		}
		
		
	}
	
	public void StartBattle(Sword s1, Monster m) {
		while(true) {
			s1.atk(s1, m);
			if(m.hp<1) {
				swordTest.ml++;
				m = new Warrior(swordTest.ml);
				break;
			}
			m.monAtk(m, s1);
			if(s1.user_hp<0) {
				System.out.println();
				System.out.println("사망하셨습니다.");
				break;
			}
			System.out.println();
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	

}
