package quiz;

public class B02_conditionQuiz01 {
	
	public static void main(String[] args) {
		
		
		
		
		//1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
		int a=15;
		System.out.println(a>10 && a<20);
		//2. int�� ���� b�� ¦���� �� true
		int b = 10;
		System.out.println(b%2==0);
		//3. int�� ���� c�� 7�� ����� �� true
		int c = 49;
		System.out.println(c%7==0);
		//4. int�� ���� hour�� 0�̸� 24�̻��̾ƴϰ� 12�̻��� �� true	
		int hour = 18;
		System.out.println(!(0>hour) && !(hour>=24) && hour>=12);
		//5. int�� ���� d�� e�� ���̰� 30�� �� true
		int d = 50, e = 20;
		System.out.println(d-e==30 || e-d==-30);
		//6. int�� ���� year�� 400���� ������ �������ų� 
		//   �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
		int year = 2020;
		System.out.println(year%400==0 || (year%4==0 && !(year%100==0)));
		//7. �μ��� ö������ 2�� ������ true
		int m_age1 = 24, c_age2 = 22;
		System.out.println(m_age1-c_age2>=2);
		int m_bir = 02, c_bir = 5;
		//8. �μ��� ö������ ������ 3�� ������ true 
		System.out.println(c_bir-m_bir==3);
 		//9. boolean�� ���� powerOn�� false�� �� true
		boolean powerOn = false;
		System.out.println(!powerOn);
		
		//�ҹ��ڷ� �����ϴ� Ÿ�� - ���� ������
		//�빮�ڷ� �����ϴ� Ÿ�� - �ּҰ��� ������(������)
		//���������� ���� ���ϸ� �ּҰ��� ����
		//���ڿ��� ���� ���ϰ������ .equals() �� ���
		
		//10. ���ڿ� �������� str�� "yes"�� �� true
		String str = "yes";
		System.out.println(str.equals("yes"));
		
		
		//11. �ﰢ��A�� �����ﰢ���̸� true;
		int A_1 = 5 , A_2 = 3, A_3 = 4;
		System.out.println(
				Math.pow(A_1,2)+Math.pow(A_2,2)==Math.pow(A_3,2) ||
				Math.pow(A_1,2)+Math.pow(A_3,2)==Math.pow(A_2,2) || 
				Math.pow(A_3,2)+Math.pow(A_2,2)==Math.pow(A_1,2)
				);
		
		
	}

}
