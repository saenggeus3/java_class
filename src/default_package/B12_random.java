package default_package;
import java.util.Random;

public class B12_random {
	
	public static void main(String[] args) {
		
		
		//Math.random()
		//0����1�̸��� ���� �������� ����
		//�ڿ� ���Ѽ� �̸������� ���� �������� ������ 
		
		int random = (int)(Math.random()*100);
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println((int)(Math.random() * 21 + 80));
//		}
		
		// Random Ŭ���� �̿�
		// ������ �� ���ϴ� �õ��ȣ�� ������ �� ����
		// ���� �õ� ��ȣ�� �����ϸ� ���� ���� ����
		// �õ��ȣ�� �������� ������ �������� �õ尡 ���õ�
		
		Random ran1 = new Random(10);
		
		//random.nextInt(bound) : ���ϴ� ������ ������ ��ȯ�Ѵ�
		// 0 ~ bound�̸��� ������ ��ȯ��
		// bound���� �������� ������ int��ü �������� ���� ����
		System.out.println(ran1.nextInt(30));
		System.out.println(ran1.nextInt());
		
		
		//���� : 3000�̻� 5000������ ���� ������ 100�� �̰� �׵��� ���Ӵ� ���� ū �� �� ���� �������� ���
		
		int max = 0, min = 0;
		
		for (int i = 0; i < 100; i++) {
			int num = (int)(Math.random() * 2001 + 3000);
			
			//ó������ �񱳴���� �����Ƿ� �׳� ����
			if(i == 0) {
				max = num;
				min = num;
			}else {
				// ���� ����� ������ �� ũ�� max���� ����
				//max = max < num ? num : max;
				max = Math.max(max, num);
				
				//���� ����� ������ �� ������ min���� ����
				//min = min > num ? num : min;
				min = Math.min(min, num);
			}
			
		}
		
		System.out.println(min +" " +max);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
