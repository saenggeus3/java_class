import java.util.Arrays;

public class B13_Array {
	
	public static void main(String[] args) {
		
		// 배열
		// 같은타입의 변수를 한번에 여러개 선언하는 방법
		// 인덱스를 활용해 해당 번째의 값에 접근할 수 있음
		// 배열은 반복문과 함께 활용하면 매우 편함
		// 배열은 한번 크기가 정해지면 크기를 변경할 수 없음
		// 배열은 초기화가 자동으로 되어있음 - 정수 : 0 , 실수 : 0.0, boolean : false, 참조형 : null 
		
		//변수 100개를 쉽게 만드는 방법
		int[] a = new int[100];
		
		a[0] = 10;
		a[1] = 55;
		a[99] = 99; // 100개를 만들었다면 인덱스는 99번까지있음
		a[5] = 'A';
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[99]); 
		System.out.println(a[5]);
		
		// 배열을 선언하는 방법
		// 1 타입[] 배열이름 = new 타입[배열크기];
		// 2 타입[] 배열이름 = {값1, 값2, 값3, ...};
		// 3 타입[] 배열이름 = new 타입[] {값1, 값2, 값3, ...};
		
		// 함수중에 배열을 요구하는 함수들이 있음
		String result = Arrays.toString(new int[] {'A','B','C'}); // Arrays.toString : 전달받은 배열을 보기좋은 문자열로 반환(출력x)
		
		String[] colors = {"red","blue","green","yellow"};
		
		boolean[] testResults = new boolean[] {
				true, false, true, true, false
		};
		
		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
		System.out.println(colors[3]);
		
		
		// 배열과 반복문 활용하기
		
		System.out.println("colors 배열의 길이 : " + colors.length);
		
		for (int index = 0; index < colors.length; index++) {
			System.out.printf("%d번째 색깔 : %s \n", index, colors[index]);
		}
		
		
		// String 을 char형 배열로 변환하기
		String msg = "hello, world";
		
		char[] msgArr = msg.toCharArray();
		
		for (int i = 0; i < msgArr.length; i++) {
			System.out.println(msgArr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
