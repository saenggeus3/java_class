package default_package;


public class B14_Array2 {
	
	public static void main(String[] args) {
		
		//�迭 �ȿ��� �迭�� ���� �� ����
		//������ ���� Ÿ�Կ��� null�� �� �� ����
		//�迭 ������ ���� �����ϴ� ���� �ƴ϶� �迭�� ���� �ּҸ� ������ ��, �迭�� ������ ����Ÿ��
		
		int[] scores = {9, 123, 456, 789};
		
		int[][] arr2 = {
				new int[5], // ����ִ� 5��¥�� int[] �迭
				null, // ���� �迭�� ����
				{1,2,3,4,5},
				new int[] {1,2,3}
		};
		
		
		//System.out.println(arr2.length);
		//System.out.println(arr2[0].length);
		
		// ���̸� Ȱ���Ͽ� n���� �迭�� n�� �ݺ������� ��� Ž���� �� �ִ�
		for (int i = 0; i < arr2.length; i++) {
			int[] arr = arr2[i];
			
			if(arr != null) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr2[i][j]);
				}
			}else {
				System.out.print("null");
			}
			System.out.println();
		}
		
		
		
		// Ȱ�� ��
		int[][] scores2 = {
				{80,90,100},
				{50,60,70},
				{90,90,90},
				{70,70,70}
		};
		
		// 1 : ���׶��
		// 2 : �׸�
		// 3 : x
		
		int[][] map = {
				{2,2,3,3,3},
				{2,2,3,3,3},
				{2,2,3,3,3,5,5,5,5,1,1,1},
				{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
				{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
		};
		
		for (int i = 0; i < map.length; i++) {
			
			for (int j = 0; j < map[i].length; j++) {
				switch (map[i][j]) {
				case 1:
					System.out.print("�� ");
					break;
				case 2:
					System.out.print("�� ");
					break;
				case 3:
					System.out.print("  ");
					break;

				default:
					break;
				}
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
