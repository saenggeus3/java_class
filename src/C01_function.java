import java.util.Arrays;

public class C01_function {
	
	// 함수 (function)
	// 기능을 미리 정의해두고 나중에 가져다 쓰는것
	// 함수 이름 뒤에 ()를 붙여 함수를 호출하면 함수의 실행 결과가 반환됨
	// 나중에 재사용 할 가능성이 있는 기능을 미리 만들어둠으로써 작업의 반복을 줄임
	
	// ex : 사과의 개수와 바구니의 크기를 전달받으면 필요한 바구니개수를 알려주는 함수
	public static int appleBasket(int appleNum, int basketSize) {
		
		int result;
		if(appleNum % basketSize == 0) {
			result = appleNum / basketSize;
		}else {
			result = appleNum / basketSize + 1;
		}
		return result; // 함수타입이 int 타입이므로 반환하는값도 int타입이여야함
	}
	
	// ex : 여러슈퍼의 사과 가격을 입력받으면 가장 싼 가격을 알려주는 함수
	public static int cheapPrice(int[] prices) {
		
		int result=0;
		
		for (int i = 0; i < prices.length; i++) {
			if (i==0) {
				result = prices[i];
			}else {
				result = Math.min(result, prices[i]);
			}
		}
		
		return result;
	}
	
	//ex : 사과들의 평균 가격을 알려주는 함수
	public static double avgPrice(int[] prices) {
		
		double result = 0;
		int sum = 0;
		
		for (int i = 0; i < prices.length; i++) {
			sum += prices[i];
		}
		result = sum/(double)prices.length;
		return result;
	}
	
	//ex : 전달한 사과 가격들을 10000원씩 증가시키는 함수
	public static void raisePrice(int[] prices) {
		for (int i = 0; i < prices.length; i++) {
			prices[i] += 10000;
		}
		// 리턴타입이 void인 함수는 아무것도 리턴하지 않는다.
		return;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int basket = appleBasket(12422, 7);
		System.out.println(basket);
		
		int[] app = {1000, 2000, 989, 1100, 990};
		int cheap = cheapPrice(app);
		System.out.println(cheap);
		System.out.println(avgPrice(app));
		
		raisePrice(app);
		raisePrice(app);
		raisePrice(app);
		
		System.out.println(Arrays.toString(app));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
