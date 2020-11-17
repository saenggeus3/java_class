package quiz;

import java.util.Arrays;

public class C01_functionQuiz2 {
	
	public static int[] range(int min,int max) {
		int[] result = new int[max-min];
		for (int i = 0; i < result.length; i++) {
			result[i]=min+i;
		}
		return result;
	}
	
	public static int[] range(int max) { 
		//���� �Լ��̸����� �پ��� ������ �Լ��� �����Ҽ� ���� (�Լ��� �����ε�)
		// �ٸ������� �Լ��� �Ǳ����ؼ� �Ű������� ���� Ȥ�� Ÿ���� �޶����
		int[] result = new int[max];
		for (int i = 0; i < result.length; i++) {
			result[i]=i;
		}
		return result;
	}
	
	public static StringBuilder join(String[] strArr, String sep) {
		StringBuilder str = new StringBuilder("");
		for (int i = 0; i < strArr.length; i++) {
			
			if(i==0) {
				str.append(strArr[i]);
			}else {
				str.append(sep+strArr[i]);
			}
		}
		return str;
	}
	
	public static char getSymbol(int value) {
		char[] digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
		return digits[value];
	}
	
	public static int getValue(char digit) {
		char[] digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
		for (int i = 0; i < digits.length; i++) {
			if(digits[i]==digit) {
				return i;
			}
		}
		return -1;
	}
	
	public static String conversion_base(String num,int base_from,int base_to) {
		num=num.toUpperCase();
		
		if(base_from <2 || base_from > 36 || base_to< 2 || base_to > 36) {
			System.err.println("RadixError : ��밡���� ������ 2���� 36�Դϴ�.");
			return null;
		}
		
		int pow = num.length() - 1;
		long real_value = 0;
		
		for (int i = pow; i > -1; i--) {
			char digit = num.charAt(pow-i);
			int value = getValue(digit);
			
			if(value >= base_from){
				System.err.println(base_from + "�̻��� ���� ���� ���ڰ� �ֽ��ϴ�.");
				return null;
			}
			
			System.out.println(digit);
			System.out.println("\t���� �� : " + value);
			System.out.println("\t" + Math.pow(base_from, i) + "�� �ڸ�");
			
			real_value += value * Math.pow(base_from, i);
		}
		
		System.out.println(base_from + "���� ���ڿ� \"" + num + "\"�� ���� ������ " + real_value + "�Դϴ�.");
		
		StringBuilder result = new StringBuilder();
		
		while(real_value > 0) {
			result.append(getSymbol((int)real_value % base_to));
			real_value /= base_to;
		}
		
		
		return result.reverse().toString();
	}
	
	
	
	public static void main(String[] args) {
		
		// �ּҰ��� �ִ밪�� �Ű������� ������, �� ������ ��� ���� �����ϴ� 
		// int �迭�� �����Ͽ� ��ȯ�ϴ� range�Լ� (�ּҰ��̻�,�ִ밪�̸�)
		int[] intArr = range(5,10);
		System.out.println(Arrays.toString(intArr));
		
		// �ִ밪�� �Ű������� ���޹�����, 0���� �ִ밪 �̸��� ��� ���� �����ϴ� range2 �Լ�
		int[] intArr2 = range(10);
		System.out.println(Arrays.toString(intArr2));
		
		// ���ڿ� �迭�� ���� ������, �ش� �迭�� ��� "/"�� �ٿ� �̾���̴� join �Լ��� ����� ������
		// ex: {"apple","banana"} -> "apple/banana"
		String[] strArr = new String[] {"apple","banana","orange"};
		System.out.println(join(strArr,"/"));
		
		// ���ڿ� Ÿ���� ����(num), ���� ����(base_from), �ٲٷ��� ����(base_to)�� ���޹�����
		// base_from�� �����̾��� num�� base_to ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ��� ����� ������
		// ���� ������ �߸��� ��� null�� ��ȯ
		// ��ȯ�� �� �ִ� �ִ� ������ 36�����̰�, �ּ� ������ 2��
		
		
		
	//	System.out.println(conversion_base("ABCDEF",16,10));
		System.out.println(conversion_base("500",10,2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
