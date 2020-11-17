package myobj.item;

import java.util.Scanner;

public class swordTest {
	static int ml = 1;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Sword s1 = new Sword();
		Monster m1 = new Warrior(ml);
		s1.user_hp = 100;
		while(true) {
			int n = 0;
			int n2 = 0;
			System.out.println("1.강화하기");
			System.out.println("2.무기정보");
			System.out.println("3.무기새로뽑기");
			System.out.println("4.강화테스트");
			System.out.println("5.공격");
			System.out.println("6.종료하기");
			System.out.print("> ");
			
			int input = sc.nextInt();
			switch (input) {
			case 1:
				s1.reinforce();
				System.out.println();
				s1.stat();
				break;
			case 2:
				System.out.println();
				s1.stat();
				break;
			case 3:
				s1 = new Sword();
				break;
			case 4:
				while(true) {
					if(s1.reinforcement==s1.max_reinforcement) {
						break;
					}
					if(100-(s1.reinforce_probability)<1) {
						s1 = new Sword();
						n2++;
					}
					s1.reinforce();
					n++;
				}
				s1.stat();
				System.out.println("현재 무기 강화 횟수 :" + s1.num_reinforce);
				System.out.println("총 무기 강화 횟수 : " + n);
				System.out.println("총 사용한 무기 개수 : "+ n2);
				break;
			case 5:
				Battle bt = new Battle();
				bt.StartBattle(s1, bt.SelectMonster());
				break;
			case 6:
				return;
			default:
				System.out.println("잘못된입력");
			}
			System.out.println();
		}
	
	}

}
