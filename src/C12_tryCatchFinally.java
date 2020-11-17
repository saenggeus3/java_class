

public class C12_tryCatchFinally {
	
	//예외 처리
	// 우리가 에러라고 알고있는 빨간 글씨들을 예외(Exception)라고 부름
	// 단 문법적으로 틀린것은 예외가 아니라 에러(처리불가)
	// 프로그래머가 예외에 대한 적절한조치를 취해준다면 프로그램을 강제종료하지않고 계속해서 진행하게 됨
	
	// try
	// 예외가 발생할 수 있는 코드를 try문 내부에 포함시킴
	// 예외가 발생하지 않으면 모두 정상 실행됨
	// 예외가 발생한다면 해당예외를 받는 catch문으로 넘어가게 됨
	
	// catch
	// catch문은 여러개를 사용할 수 있음
	// 첫번째 매개변수로 해당 예외에 관한 정보를 담고있는 객체를 받음
	// Exception타입의 catch문은 모든 예외를 catch할 수 있음
	//	Exception : 모든 예외의 부모타입
	
	// finally
	// try문 내부의 예외 발생 여부와 관계없이 무조건 실행되는 영역
	
	public static void main(String[] args) {
		
		int[] abc = new int[10];
		
		try {
			System.out.println("try문의 시작");
			System.out.println(abc[0]); // 예외발생 코드
			System.out.println(Integer.parseInt("123")); // 예외발생코드2	
			System.out.println("try문의 끝");
			
		} catch (Exception e) {
			System.out.println("catch문 실행");		
		} finally {
			System.out.println(" /)/)");
			System.out.println("(.. )");
			System.out.println(" <  )");
		
		}
			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("catch문 실행");
//		} catch (NumberFormatException e) {
//			System.out.println("int 타입이 될 수 없음");
//		} 
		
		System.out.println("종료");
	}
	
	

}
