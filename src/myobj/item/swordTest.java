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
			System.out.println("1.��ȭ�ϱ�");
			System.out.println("2.��������");
			System.out.println("3.������λ̱�");
			System.out.println("4.��ȭ�׽�Ʈ");
			System.out.println("5.����");
			System.out.println("6.�����ϱ�");
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
				System.out.println("���� ���� ��ȭ Ƚ�� :" + s1.num_reinforce);
				System.out.println("�� ���� ��ȭ Ƚ�� : " + n);
				System.out.println("�� ����� ���� ���� : "+ n2);
				break;
			case 5:
				Battle bt = new Battle();
				bt.StartBattle(s1, bt.SelectMonster());
				break;
			case 6:
				return;
			default:
				System.out.println("�߸����Է�");
			}
			System.out.println();
		}
	
	}

}
