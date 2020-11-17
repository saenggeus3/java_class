package default_package;
import java.util.Random;

public class B12_random {
	
	public static void main(String[] args) {
		
		
		//Math.random()
		//0에서1미만의 수를 랜덤으로 생성
		//뒤에 곱한수 미만까지의 수를 랜덤으로 생성함 
		
		int random = (int)(Math.random()*100);
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println((int)(Math.random() * 21 + 80));
//		}
		
		// Random 클래스 이용
		// 생성할 때 원하는 시드번호를 선택할 수 있음
		// 같은 시드 번호로 생성하면 같은 값이 나옴
		// 시드번호를 전달하지 않으면 무작위로 시드가 선택됨
		
		Random ran1 = new Random(10);
		
		//random.nextInt(bound) : 원하는 범위의 정수를 반환한다
		// 0 ~ bound미만의 정수를 반환함
		// bound값을 전달하지 않으면 int전체 범위에서 랜덤 정수
		System.out.println(ran1.nextInt(30));
		System.out.println(ran1.nextInt());
		
		
		//연습 : 3000이상 5000이하의 랜덤 정수를 100번 뽑고 그동안 나왓던 가장 큰 수 와 가장 작은수를 출력
		
		int max = 0, min = 0;
		
		for (int i = 0; i < 100; i++) {
			int num = (int)(Math.random() * 2001 + 3000);
			
			//처음에는 비교대상이 없으므로 그냥 저장
			if(i == 0) {
				max = num;
				min = num;
			}else {
				// 현재 저장된 값보다 더 크면 max값을 갱신
				//max = max < num ? num : max;
				max = Math.max(max, num);
				
				//현재 저장된 값보다 더 작으면 min값을 갱신
				//min = min > num ? num : min;
				min = Math.min(min, num);
			}
			
		}
		
		System.out.println(min +" " +max);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
