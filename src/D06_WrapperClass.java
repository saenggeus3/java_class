
public class D06_WrapperClass {
	
	public static void main(String[] args) {
		
		//wrapperClass
		// 기본형 타입들을 참조형 타입으로 사용하고 싶을때 사용함
		// 각 타입들에 대한 유용한 기능들이 모여있음
		
		// 기본형 : byte, short, char, int, long, float, double
		// 잠초형 : Byte, Short, Character, Integer, Long, Float, Double
		
		int a = 10;
		//Integer b = new Integer(10); // JDK9이후로 deprecated
		Integer b = 10;
		
		
		// typeValue() 시리즈 : 참조형에 저장된 값을 원하는 기본 타입으로 반환함
		System.out.println(b.byteValue());
		System.out.println(b.doubleValue());
		
		
		//parse 시리즈 : 문자열에 저장된 값을 원하는 타입으로 변환함
		String str = "10";
		
		System.out.println(Integer.parseInt(str));
		System.out.println(Integer.parseInt(str,16));
		System.out.println(Double.parseDouble(str));
		System.out.println(Byte.parseByte(str));
		
		
		//비교 (참조형끼리의 비교 = 주소값 비교)
		System.out.println(new Integer(10) == new Integer(10));
		System.out.println(new Integer(10).equals(new Integer(10)));
		
		// Wrapper클래스의 toString을 통해 진법 변환이 가능함 (radix(진법)생략시 10진법)
		System.out.println(Integer.toString(123,10));
		System.out.println(Integer.toString(123,16).toUpperCase());
		System.out.println(Integer.toString(123,8).toUpperCase());
		
		// 문자열을 Boolean으로 변환
		Boolean b1 = Boolean.valueOf("true");
		
		System.out.println(b1);
		
		// 해당진법의 숫자를 char타입으로 반환
		//ex : 36진법의 35에 해당하는 문자를 반환
		System.out.println(Character.forDigit(35, 36));
		
		
	}

}
