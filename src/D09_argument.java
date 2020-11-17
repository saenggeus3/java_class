
public class D09_argument {
	
	public static void main(String[] args) {
		
		//Eclipse에서 argument 테스트하기
		
		// 해당파일 우클릭
		// Run and Debug -> Edit
		// Arguments에 원하는 값 추가
		
		System.out.println("받은 실행 옵션 : " + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(i+"번째 프로그램 실행 옵션 : " + args[i]);
		}
		
		
	}

}
