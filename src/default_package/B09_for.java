package default_package;

public class B09_for {
	
	public static void main(String[] args) {
		
		// �ݺ���
		// for, while, do-while(x), for each
		// �Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ���
		
		/* for (�ʱⰪ; ����; ������){
		   		��� ������ true�� ���� �ݺ��� ��ɾ���� ����
		   }
		*/
		
		// �⺻���� ����
		// ���ϴ� Ƚ����ŭ �ݺ��ϴ� ���
		// �ʱⰪ�� 0�� �ְ�, ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ����
		// ������ 1����
		for (int i = 0; i < 5000; i++) {
			System.out.println("hi" + i);
		}
		
		// �ʱⰪ ������ ���Ǽ�ġ�� ������� ���氡��
		for (int i = 10; i < 33; i+=2) {
			System.out.println(i);
		}
		
		//�ʱⰪ�� �������� ��ġ�� ������� ������ �� ����
		int num = 0;
		for (; num<100;) {
			System.out.println("�����" + num);
			num++;
		}
		
		//���ο� �ٸ� ������ �����Ӱ� ����� �� ����
		for (int month = 1; month <= 12; month++) {
			switch (month) {
			case 1: case 2: case 12:
				System.out.println(month+"���� �ܿ��Դϴ�.");
				break;

			default:
				System.out.println(month+"���� ���� �������� �ʾҽ��ϴ�.");
				break;
			}
		}
		
		
		// ������ ����θ� ���� �ݺ�
		// break�� �̿��� �ݺ����� Ż���� �� ����
		num =0;
		for (;;) {
			System.out.println(num+=9999);
			if(num>200000)break;
		}
		
		// continue�� �̿��ϸ� �ݺ����� ��ŵ�� �� �ִ�
		// continue�� ������ �Ʒ������� ���������ʰ� ���� �ݺ����� �Ѿ
		for (int i = 0; i < 100; i++) {
			System.out.printf("%-3d",i);
			if(i%10 != 9) continue;
			System.out.println();
		}
		
		// �ݺ������� ���� ���ϱ�
		// ������ ������ ������ �����ϰ� 0���� �ʱ�ȭ �Ѵ�
		// �ݺ����� ���� �ش� ������ ���� ������Ŵ
		
		int sum = 0;
		
		for (int i = 80; i <= 333; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}

}
