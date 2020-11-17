package default_package;


public class B14_Array2 {
	
	public static void main(String[] args) {
		
		//배열 안에도 배열을 넣을 수 있음
		//참조형 변수 타입에는 null이 들어갈 수 있음
		//배열 변수도 값을 저장하는 것이 아니라 배열의 시작 주소를 저장함 즉, 배열도 참조형 변수타입
		
		int[] scores = {9, 123, 456, 789};
		
		int[][] arr2 = {
				new int[5], // 비어있는 5개짜리 int[] 배열
				null, // 아직 배열이 없음
				{1,2,3,4,5},
				new int[] {1,2,3}
		};
		
		
		//System.out.println(arr2.length);
		//System.out.println(arr2[0].length);
		
		// 길이를 활용하여 n차원 배열은 n중 반복문으로 모두 탐색할 수 있다
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
		
		
		
		// 활용 예
		int[][] scores2 = {
				{80,90,100},
				{50,60,70},
				{90,90,90},
				{70,70,70}
		};
		
		// 1 : 동그라미
		// 2 : 네모
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
					System.out.print("ㅇ ");
					break;
				case 2:
					System.out.print("ㅁ ");
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
