package myobj.item;

public class Sword {
	
	// �ʵ�
	// ���ݷ�
	// ��ȭ��ġ
	// ��ȭȮ�� (��ȭ ��ġ������ �ٸ�)
	int damage;
	int reinforcement;	//��ġ
	int reinforce_probability;	//Ȯ��
	int num_reinforce;	//Ƚ��
	int max_reinforcement=20;
	int user_hp;
	
	// �޼���
	// ��ȭ�ϱ� (�������� ���� �������а� �����)
	// �ִ� ��ȭ �������� �����ϱ⿡ �ɸ� ��ȭ Ƚ���� ���
	// ���� (��󿡰� ���ݷ� ��ŭ�� �������� ����)
	// ����� �Ǵ� ��ü�� HP�� �־����
	
	// �ν��Ͻ� �޼��带 ���� ���� static�� ������
	// static �޼���� �ν��Ͻ� ������ Ȱ���� �� ����
	
	public Sword() {
		damage = (int)(Math.random()*99+1);
		reinforcement = 0;
		reinforce_probability = 0;
		num_reinforce = 0;
	}
	
	public void reinforce() {
		if(100-reinforce_probability<1 || reinforcement == max_reinforcement) {
			System.out.println("���̻� ��ȭ�� �� �����ϴ�");
			return;
		}
		
		if(probability(reinforce_probability)) {
			System.out.println();
			System.out.println("��ȭ����");
			reinforcement++;
			damage+=damage/10;
		}else {
			if(probability(50)) {
				System.out.println();
				System.out.println("��ȭ����");
			}else {
				System.out.println();
				System.out.println("��ȭ���� ����϶�");
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
		System.out.println("���ݷ� : " + damage);
		System.out.println("��ȭ��ġ : +"+reinforcement);
		if (0<100-reinforce_probability) {
			System.out.println("���簭ȭȮ�� : "+(100-reinforce_probability)+"%");
		}else {
			System.out.println("���簭ȭȮ�� : 0%");
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
		System.out.println("����!");
		System.out.println("���� hp : "+m1.hp);
		System.out.println("���� ������ : "+(s1.damage-m1.defense));
		m1.hp -= s1.damage-m1.defense;
		if(m1.hp<1) {
			System.out.println("���� hp : 0");
			System.out.println("óġ!");
		}else {
			System.out.println("���� hp : "+m1.hp);
		}
	}
	
	
	
}
