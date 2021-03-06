package default_package;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {
	
	// 정규표현식 (Regular Expression)
	// 문자열의 패턴을 표현하는 방식
	// 해당 패턴과 일치하는 문자열을 검색할 수 있음
	
	// Pattern 클래스
	// 정규 표현식을 다루는 클래스
	
	// Matcher 클래스
	// 패턴을 이용하여 대상 문자열을 검색할 때 사용하는 클래스
	
	public static void main(String[] args) {
		
		String str = "sleep";
		
		// [] : 해당 위치의 한 글자에 어떤 문자들이 올 수 있는지 정의함
		System.out.println(Pattern.matches("sleep", str));
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
	
		
		// [] 내부에 정의할 수 있는 것
		// abc	:	a,b,c만허용
		// ^abc	:	a,b,c를 제외한 모두를 허용
		// a-z	:	a부터 z까지 허용
		// &&	:	교집합
		System.out.println(Pattern.matches("s[^1-9]eep", "sZeep"));
		System.out.println(Pattern.matches("s[a-zA-Z]eep", "sZeep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		
		// [] 없이 해당위치의 한 글자에 표현하는 것
		// .	:	해당 자리에 모든 문자를 허용
		
		// 여러문자를 간단하게 표현하는 것을
		// \d	:	해당 자리에 숫자들을 허용
		// \D	:	해당 자리에 숫자를 제외한 모든것을 허용
		// \s	:	해당 자리에 공백을 허용 [\t\n\r... 등의 모든 공백들]
		// \S	:	해당자리에 공백을 제외한 모든것을 허용
		// \w	:	일반적인 문자들을 허용	(a-z A-Z _ 0-9)
		// \W	:	일반적인 문자들을 제외한 모든것을 허용	^(a-z,A-Z,_,0-9)
		
		System.out.println(Pattern.matches("s.eep", "seeep"));
		System.out.println(Pattern.matches("s\\deep", "seeep"));	// 문자열내부이기때문에 \\로 \를 사용
		System.out.println(Pattern.matches("s\\Deep", "seeep"));
		System.out.println(Pattern.matches("s\\seep", "seeep"));
		System.out.println(Pattern.matches("..[\\d]..", "ab1de"));
		
		//해당 패턴이 적용될 문자의 개수를 정의하는 방법 		!!공백이 없어야함
		//Ex {n} 	:	앞에 있는 패턴이 n글자 일치해야함
		//Ex {n,m} 	:	앞에 있는 패턴이 최소 n글자 이상 최대 m글자 일치해야함
		//Ex {n,}	:	n글자 이상 일치해야함
		//Ex?		:	해당 문자가 2회이상이면 안됨
		//Ex+		:	해당 문자가 1회이상 존재해야함
		//Ex*		:	0번혹은 여러번
		System.out.println(Pattern.matches("....[\\d]{4}", "abde1234"));
		System.out.println("유효한 아이디 : " +
		Pattern.matches("[\\w가-힣]{2,8}", "ab가나e1B4"));
		System.out.println(Pattern.matches("[@]?", "@@"));
		System.out.println(Pattern.matches("[@]+", "@@"));
		System.out.println(Pattern.matches("[@]*", "@@"));
		
		String email = "abc@naver.com";
		System.out.println("이메일 패턴 : "
				+ Pattern.matches("[\\w]+[@][\\a-zA-Z0-9]+[.][a-zA-Z.]+", email));
		
		
		// Pattern.matches(regex, str)
		// 전달한 문자열이 정규표현식과 일치하면 true
		
		// Pettern.compile(regex)
		// 전달한 정규 표현식을 이용해 생성한 인스턴스를 반환
		Pattern email_regex = Pattern.compile("[\\w]+[@][\\a-zA-Z0-9]+[.][a-zA-Z.]+");
		
		//생성된 Pattern 인스턴스로 split하기
		Pattern split_regex = Pattern.compile("/");
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		// 생성된 Pattern 인스턴스로 Matcher생성
		// java.util.regex.Matcher
		// 해당 정규표현식과 일치하는 인덱스를 찾은 결과
		Pattern fruit_regex = Pattern.compile("[a-zA-Z[^/]]+");
		Matcher matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		//find : 정규표현식을 통해 찾은 것이 있으면 true
		while(matcher.find()) {
			System.out.println("찾은 것 :" + matcher.group());
			System.out.println(matcher.start() + " to "  + matcher.end());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
