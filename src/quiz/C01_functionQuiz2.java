package quiz;

import java.util.Arrays;

public class C01_functionQuiz2 {
	
	public static int[] range(int min,int max) {
		int[] result = new int[max-min];
		for (int i = 0; i < result.length; i++) {
			result[i]=min+i;
		}
		return result;
	}
	
	public static int[] range(int max) { 
		//같은 함수이름으로 다양한 형태의 함수를 정의할수 있음 (함수의 오버로딩)
		// 다른형태의 함수가 되기위해선 매개변수의 갯수 혹은 타입이 달라야함
		int[] result = new int[max];
		for (int i = 0; i < result.length; i++) {
			result[i]=i;
		}
		return result;
	}
	
	public static StringBuilder join(String[] strArr, String sep) {
		StringBuilder str = new StringBuilder("");
		for (int i = 0; i < strArr.length; i++) {
			
			if(i==0) {
				str.append(strArr[i]);
			}else {
				str.append(sep+strArr[i]);
			}
		}
		return str;
	}
	
	public static char getSymbol(int value) {
		char[] digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
		return digits[value];
	}
	
	public static int getValue(char digit) {
		char[] digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
		for (int i = 0; i < digits.length; i++) {
			if(digits[i]==digit) {
				return i;
			}
		}
		return -1;
	}
	
	public static String conversion_base(String num,int base_from,int base_to) {
		num=num.toUpperCase();
		
		if(base_from <2 || base_from > 36 || base_to< 2 || base_to > 36) {
			System.err.println("RadixError : 사용가능한 진법은 2부터 36입니다.");
			return null;
		}
		
		int pow = num.length() - 1;
		long real_value = 0;
		
		for (int i = pow; i > -1; i--) {
			char digit = num.charAt(pow-i);
			int value = getValue(digit);
			
			if(value >= base_from){
				System.err.println(base_from + "이상의 값을 지닌 문자가 있습니다.");
				return null;
			}
			
			System.out.println(digit);
			System.out.println("\t실제 값 : " + value);
			System.out.println("\t" + Math.pow(base_from, i) + "의 자리");
			
			real_value += value * Math.pow(base_from, i);
		}
		
		System.out.println(base_from + "진법 문자열 \"" + num + "\"의 값은 실제로 " + real_value + "입니다.");
		
		StringBuilder result = new StringBuilder();
		
		while(real_value > 0) {
			result.append(getSymbol((int)real_value % base_to));
			real_value /= base_to;
		}
		
		
		return result.reverse().toString();
	}
	
	
	
	public static void main(String[] args) {
		
		// 최소값과 최대값을 매개변수로 받으면, 그 사이의 모든 값을 포함하는 
		// int 배열을 생성하여 반환하는 range함수 (최소값이상,최대값미만)
		int[] intArr = range(5,10);
		System.out.println(Arrays.toString(intArr));
		
		// 최대값을 매개변수로 전달받으면, 0부터 최대값 미만의 모든 값을 포함하는 range2 함수
		int[] intArr2 = range(10);
		System.out.println(Arrays.toString(intArr2));
		
		// 문자열 배열을 전달 받으면, 해당 배열을 모두 "/"를 붙여 이어붙이는 join 함수를 만들어 보세요
		// ex: {"apple","banana"} -> "apple/banana"
		String[] strArr = new String[] {"apple","banana","orange"};
		System.out.println(join(strArr,"/"));
		
		// 문자열 타입의 숫자(num), 원래 진법(base_from), 바꾸려는 진법(base_to)을 전달받으면
		// base_from의 진법이었던 num을 base_to 진법의 문자열로 변환하여 반환하는 함수를 만들어 보세요
		// 만약 진법이 잘못된 경우 null을 반환
		// 반환할 수 있는 최대 진법은 36진법이고, 최소 진법은 2임
		
		
		
	//	System.out.println(conversion_base("ABCDEF",16,10));
		System.out.println(conversion_base("500",10,2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
