import java.util.Arrays;

public class B13_Array {
	
	public static void main(String[] args) {
		
		// �迭
		// ����Ÿ���� ������ �ѹ��� ������ �����ϴ� ���
		// �ε����� Ȱ���� �ش� ��°�� ���� ������ �� ����
		// �迭�� �ݺ����� �Բ� Ȱ���ϸ� �ſ� ����
		// �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����
		// �迭�� �ʱ�ȭ�� �ڵ����� �Ǿ����� - ���� : 0 , �Ǽ� : 0.0, boolean : false, ������ : null 
		
		//���� 100���� ���� ����� ���
		int[] a = new int[100];
		
		a[0] = 10;
		a[1] = 55;
		a[99] = 99; // 100���� ������ٸ� �ε����� 99����������
		a[5] = 'A';
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[99]); 
		System.out.println(a[5]);
		
		// �迭�� �����ϴ� ���
		// 1 Ÿ��[] �迭�̸� = new Ÿ��[�迭ũ��];
		// 2 Ÿ��[] �迭�̸� = {��1, ��2, ��3, ...};
		// 3 Ÿ��[] �迭�̸� = new Ÿ��[] {��1, ��2, ��3, ...};
		
		// �Լ��߿� �迭�� �䱸�ϴ� �Լ����� ����
		String result = Arrays.toString(new int[] {'A','B','C'}); // Arrays.toString : ���޹��� �迭�� �������� ���ڿ��� ��ȯ(���x)
		
		String[] colors = {"red","blue","green","yellow"};
		
		boolean[] testResults = new boolean[] {
				true, false, true, true, false
		};
		
		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
		System.out.println(colors[3]);
		
		
		// �迭�� �ݺ��� Ȱ���ϱ�
		
		System.out.println("colors �迭�� ���� : " + colors.length);
		
		for (int index = 0; index < colors.length; index++) {
			System.out.printf("%d��° ���� : %s \n", index, colors[index]);
		}
		
		
		// String �� char�� �迭�� ��ȯ�ϱ�
		String msg = "hello, world";
		
		char[] msgArr = msg.toCharArray();
		
		for (int i = 0; i < msgArr.length; i++) {
			System.out.println(msgArr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
