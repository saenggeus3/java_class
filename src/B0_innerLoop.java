
public class B0_innerLoop {
	
	public static void main(String[] args) {
		
		// 반복문 내부에 반복문 사용
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("================================== 바깥 반복문 %d\n",i);
			for (int j = 0; j < 5; j++) {
				System.out.printf("---------------- 안쪽 반복문 %d-%d\n",i,j);
				for (int k = 0; k < 2; k++) {
					System.out.printf("++++++++++++ 제일 안쪽 반복문 %d-%d-%d\n",i,j,k);
				}
			}
			
		}
		
		for (int dan = 2; dan < 10; dan++) {
			System.out.printf("+ + + %d단 + + +\n",dan);
			for (int gop = 1; gop < 10; gop++) {
				System.out.printf("%d x %d = %d\n",dan,gop,dan*gop);
			}
			System.out.println();
		}
		
	}

}
