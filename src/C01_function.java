import java.util.Arrays;

public class C01_function {
	
	// �Լ� (function)
	// ����� �̸� �����صΰ� ���߿� ������ ���°�
	// �Լ� �̸� �ڿ� ()�� �ٿ� �Լ��� ȣ���ϸ� �Լ��� ���� ����� ��ȯ��
	// ���߿� ���� �� ���ɼ��� �ִ� ����� �̸� ���������ν� �۾��� �ݺ��� ����
	
	// ex : ����� ������ �ٱ����� ũ�⸦ ���޹����� �ʿ��� �ٱ��ϰ����� �˷��ִ� �Լ�
	public static int appleBasket(int appleNum, int basketSize) {
		
		int result;
		if(appleNum % basketSize == 0) {
			result = appleNum / basketSize;
		}else {
			result = appleNum / basketSize + 1;
		}
		return result; // �Լ�Ÿ���� int Ÿ���̹Ƿ� ��ȯ�ϴ°��� intŸ���̿�����
	}
	
	// ex : ���������� ��� ������ �Է¹����� ���� �� ������ �˷��ִ� �Լ�
	public static int cheapPrice(int[] prices) {
		
		int result=0;
		
		for (int i = 0; i < prices.length; i++) {
			if (i==0) {
				result = prices[i];
			}else {
				result = Math.min(result, prices[i]);
			}
		}
		
		return result;
	}
	
	//ex : ������� ��� ������ �˷��ִ� �Լ�
	public static double avgPrice(int[] prices) {
		
		double result = 0;
		int sum = 0;
		
		for (int i = 0; i < prices.length; i++) {
			sum += prices[i];
		}
		result = sum/(double)prices.length;
		return result;
	}
	
	//ex : ������ ��� ���ݵ��� 10000���� ������Ű�� �Լ�
	public static void raisePrice(int[] prices) {
		for (int i = 0; i < prices.length; i++) {
			prices[i] += 10000;
		}
		// ����Ÿ���� void�� �Լ��� �ƹ��͵� �������� �ʴ´�.
		return;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int basket = appleBasket(12422, 7);
		System.out.println(basket);
		
		int[] app = {1000, 2000, 989, 1100, 990};
		int cheap = cheapPrice(app);
		System.out.println(cheap);
		System.out.println(avgPrice(app));
		
		raisePrice(app);
		raisePrice(app);
		raisePrice(app);
		
		System.out.println(Arrays.toString(app));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
