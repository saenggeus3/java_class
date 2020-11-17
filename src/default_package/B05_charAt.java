package default_package;
import java.util.Scanner;

public class B05_charAt {
	
	public static void main(String[] args) {
		
		//문자열.charAt(index)
		// 문자열에서 원하는 번째의 문자를 반환
		// charAt의 반환타입은 char
		// 첫 번째 문자가 0번 인덱스
		
		//문자열.length()
		// 문자열이 몇글자로 이루어져있는지를 알려줌
		// 반환타입은 int
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아무단어 입력 > ");
		String word = sc.nextLine();
		
		System.out.println(word);
		System.out.println(word.charAt(0));

		System.out.println(word.charAt(1));
		
		if(word.length() >= 5) {
			System.out.println(word.charAt(5));
		}else {
			System.out.println("찾는 글자가 존재하지 않습니다");
		}
		
		
		
	}

}
