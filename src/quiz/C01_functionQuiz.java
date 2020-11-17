package quiz;

public class C01_functionQuiz {
	
	public static boolean alpha(String str) {
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) < 'a' || str.charAt(i) > 'z') {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static boolean multi3(int n) {
		return n%3==0;
	}
	
	public static String numcheck(int n) {
		return n % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
	}
	
	public static boolean prime(int n) {
		if(n==1) {
			return false;
		}
		
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int factorial(int n) {
		
		if(n==1) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
	
	public static int pow(int n, int n2) {
		int result = 1;
		
		if(n2==0) {
			return result;
		}
		
		for (int i = 0; i < n2; i++) {
			result = result*n;
		}
		
		return result;
	}
	
	public static int recursive_pow(int n, int n2) {
		if(n2==0) {
			return 1;
		}
		
		return n*recursive_pow(n, n2-1);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//���� �Լ��� ����
		
		// ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		System.out.println(alpha("ABC��"));
		
		// ������ ���ڰ� 3�� ����̸� true�� ��ȯ �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		System.out.println(multi3(13));
		
		// ���ڸ� �� �� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
		System.out.println(numcheck(-2));
		
		// ������ ���ڰ� �Ҽ����� �ƴ��� �Ǻ����ִ� �Լ� (boolean)
		System.out.println(prime(15));
		
		// ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
		// ���丮��(factorial) : (n)*(n-1)*(n-2) ... 3*2*1
		System.out.println(factorial(4));
		
		// ���� �ΰ��� �����ϸ� a�� b������ ��ȯ�ϴ� �Լ�
		// (0������ 1�� ��ȯ�ؾ���, Math.pow����)
		System.out.println(pow(2, 5));
		System.out.println(recursive_pow(2,5));
		

		
		
		
	}

}
