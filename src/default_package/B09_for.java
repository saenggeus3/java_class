package default_package;

public class B09_for {
	
	public static void main(String[] args) {
		
		// 반복문
		// for, while, do-while(x), for each
		// 똑같은 코드를 여러번 반복하고 싶을 때 사용
		
		/* for (초기값; 조건; 증가값){
		   		가운데 조건이 true인 동안 반복할 명령어들을 적음
		   }
		*/
		
		// 기본적인 형태
		// 원하는 횟수만큼 반복하는 방식
		// 초기값은 0을 주고, 조건에는 반복하고 싶은 횟수를 적음
		// 증가는 1씩함
		for (int i = 0; i < 5000; i++) {
			System.out.println("hi" + i);
		}
		
		// 초기값 증가값 조건수치는 마음대로 변경가능
		for (int i = 10; i < 33; i+=2) {
			System.out.println(i);
		}
		
		//초기값과 증가값의 위치를 마음대로 변경할 수 있음
		int num = 0;
		for (; num<100;) {
			System.out.println("맘대로" + num);
			num++;
		}
		
		//내부에 다른 문법도 자유롭게 사용할 수 있음
		for (int month = 1; month <= 12; month++) {
			switch (month) {
			case 1: case 2: case 12:
				System.out.println(month+"월은 겨울입니다.");
				break;

			default:
				System.out.println(month+"월은 아직 설정되지 않았습니다.");
				break;
			}
		}
		
		
		// 조건을 비워두면 무한 반복
		// break를 이용해 반복문을 탈출할 수 있음
		num =0;
		for (;;) {
			System.out.println(num+=9999);
			if(num>200000)break;
		}
		
		// continue를 이용하면 반복문을 스킵할 수 있다
		// continue를 만나면 아래내용을 실행하지않고 다음 반복으로 넘어감
		for (int i = 0; i < 100; i++) {
			System.out.printf("%-3d",i);
			if(i%10 != 9) continue;
			System.out.println();
		}
		
		// 반복문으로 총합 구하기
		// 총합을 저장할 변수를 선언하고 0으로 초기화 한다
		// 반복문을 통해 해당 변수에 값을 누적시킴
		
		int sum = 0;
		
		for (int i = 80; i <= 333; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}

}
