package quiz;

public class B10_Gugudan {
	
	public static void main(String[] args) {
		
		//1 �������� ������ ���� ���η� ���
		// 2�� : 2x1=2 2x2=4 ...
		// 3�� : 3x1=3 3x2=6 ...
		
		for (int i = 2; i < 10; i++) {
			System.out.printf("%2d�� :   ",i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%dx%d=%d\t",i,j,i*j);
			}
			System.out.println();
		}
		
		//2 �������� ������ ���� ���η� ���
		// 2��		3��		...
		// 2x1=2	3x1=3	...
		
		System.out.println();
		
		for (int i = 2; i < 10; i++) {
			
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
				
			for (int j = 2; j < 10; j++) {
				if (i==0) {
					System.out.printf("%d��\t",j);
				}else {
				System.out.printf("%dx%d=%d\t",j,i,i*j);
				}
			}
			System.out.println();
		}
		
	}

}
