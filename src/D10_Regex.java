import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {
	
	// Á¤±ÔÇ¥Çö½Ä (Regular Expression)
	// ¹®ÀÚ¿­ÀÇ ÆĞÅÏÀ» Ç¥ÇöÇÏ´Â ¹æ½Ä
	// ÇØ´ç ÆĞÅÏ°ú ÀÏÄ¡ÇÏ´Â ¹®ÀÚ¿­À» °Ë»öÇÒ ¼ö ÀÖÀ½
	
	// Pattern Å¬·¡½º
	// Á¤±Ô Ç¥Çö½ÄÀ» ´Ù·ç´Â Å¬·¡½º
	
	// Matcher Å¬·¡½º
	// ÆĞÅÏÀ» ÀÌ¿ëÇÏ¿© ´ë»ó ¹®ÀÚ¿­À» °Ë»öÇÒ ¶§ »ç¿ëÇÏ´Â Å¬·¡½º
	
	public static void main(String[] args) {
		
		String str = "sleep";
		
		// [] : ÇØ´ç À§Ä¡ÀÇ ÇÑ ±ÛÀÚ¿¡ ¾î¶² ¹®ÀÚµéÀÌ ¿Ã ¼ö ÀÖ´ÂÁö Á¤ÀÇÇÔ
		System.out.println(Pattern.matches("sleep", str));
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
	
		
		// [] ³»ºÎ¿¡ Á¤ÀÇÇÒ ¼ö ÀÖ´Â °Í
		// abc	:	a,b,c¸¸Çã¿ë
		// ^abc	:	a,b,c¸¦ Á¦¿ÜÇÑ ¸ğµÎ¸¦ Çã¿ë
		// a-z	:	aºÎÅÍ z±îÁö Çã¿ë
		// &&	:	±³ÁıÇÕ
		System.out.println(Pattern.matches("s[^1-9]eep", "sZeep"));
		System.out.println(Pattern.matches("s[a-zA-Z]eep", "sZeep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		
		// [] ¾øÀÌ ÇØ´çÀ§Ä¡ÀÇ ÇÑ ±ÛÀÚ¿¡ Ç¥ÇöÇÏ´Â °Í
		// .	:	ÇØ´ç ÀÚ¸®¿¡ ¸ğµç ¹®ÀÚ¸¦ Çã¿ë
		
		// ¿©·¯¹®ÀÚ¸¦ °£´ÜÇÏ°Ô Ç¥ÇöÇÏ´Â °ÍÀ»
		// \d	:	ÇØ´ç ÀÚ¸®¿¡ ¼ıÀÚµéÀ» Çã¿ë
		// \D	:	ÇØ´ç ÀÚ¸®¿¡ ¼ıÀÚ¸¦ Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
		// \s	:	ÇØ´ç ÀÚ¸®¿¡ °ø¹éÀ» Çã¿ë [\t\n\r... µîÀÇ ¸ğµç °ø¹éµé]
		// \S	:	ÇØ´çÀÚ¸®¿¡ °ø¹éÀ» Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
		// \w	:	ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Çã¿ë	(a-z A-Z _ 0-9)
		// \W	:	ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë	^(a-z,A-Z,_,0-9)
		
		System.out.println(Pattern.matches("s.eep", "seeep"));
		System.out.println(Pattern.matches("s\\deep", "seeep"));	// ¹®ÀÚ¿­³»ºÎÀÌ±â¶§¹®¿¡ \\·Î \¸¦ »ç¿ë
		System.out.println(Pattern.matches("s\\Deep", "seeep"));
		System.out.println(Pattern.matches("s\\seep", "seeep"));
		System.out.println(Pattern.matches("..[\\d]..", "ab1de"));
		
		//ÇØ´ç ÆĞÅÏÀÌ Àû¿ëµÉ ¹®ÀÚÀÇ °³¼ö¸¦ Á¤ÀÇÇÏ´Â ¹æ¹ı 		!!°ø¹éÀÌ ¾ø¾î¾ßÇÔ
		//Ex {n} 	:	¾Õ¿¡ ÀÖ´Â ÆĞÅÏÀÌ n±ÛÀÚ ÀÏÄ¡ÇØ¾ßÇÔ
		//Ex {n,m} 	:	¾Õ¿¡ ÀÖ´Â ÆĞÅÏÀÌ ÃÖ¼Ò n±ÛÀÚ ÀÌ»ó ÃÖ´ë m±ÛÀÚ ÀÏÄ¡ÇØ¾ßÇÔ
		//Ex {n,}	:	n±ÛÀÚ ÀÌ»ó ÀÏÄ¡ÇØ¾ßÇÔ
		//Ex?		:	ÇØ´ç ¹®ÀÚ°¡ 2È¸ÀÌ»óÀÌ¸é ¾ÈµÊ
		//Ex+		:	ÇØ´ç ¹®ÀÚ°¡ 1È¸ÀÌ»ó Á¸ÀçÇØ¾ßÇÔ
		//Ex*		:	0¹øÈ¤Àº ¿©·¯¹ø
		System.out.println(Pattern.matches("....[\\d]{4}", "abde1234"));
		System.out.println("À¯È¿ÇÑ ¾ÆÀÌµğ : " +
		Pattern.matches("[\\w°¡-ÆR]{2,8}", "ab°¡³ªe1B4"));
		System.out.println(Pattern.matches("[@]?", "@@"));
		System.out.println(Pattern.matches("[@]+", "@@"));
		System.out.println(Pattern.matches("[@]*", "@@"));
		
		String email = "abc@naver.com";
		System.out.println("ÀÌ¸ŞÀÏ ÆĞÅÏ : "
				+ Pattern.matches("[\\w]+[@][\\a-zA-Z0-9]+[.][a-zA-Z.]+", email));
		
		
		// Pattern.matches(regex, str)
		// Àü´ŞÇÑ ¹®ÀÚ¿­ÀÌ Á¤±ÔÇ¥Çö½Ä°ú ÀÏÄ¡ÇÏ¸é true
		
		// Pettern.compile(regex)
		// Àü´ŞÇÑ Á¤±Ô Ç¥Çö½ÄÀ» ÀÌ¿ëÇØ »ı¼ºÇÑ ÀÎ½ºÅÏ½º¸¦ ¹İÈ¯
		Pattern email_regex = Pattern.compile("[\\w]+[@][\\a-zA-Z0-9]+[.][a-zA-Z.]+");
		
		//»ı¼ºµÈ Pattern ÀÎ½ºÅÏ½º·Î splitÇÏ±â
		Pattern split_regex = Pattern.compile("/");
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		// »ı¼ºµÈ Pattern ÀÎ½ºÅÏ½º·Î Matcher»ı¼º
		// java.util.regex.Matcher
		// ÇØ´ç Á¤±ÔÇ¥Çö½Ä°ú ÀÏÄ¡ÇÏ´Â ÀÎµ¦½º¸¦ Ã£Àº °á°ú
		Pattern fruit_regex = Pattern.compile("[a-zA-Z[^/]]+");
		Matcher matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		//find : Á¤±ÔÇ¥Çö½ÄÀ» ÅëÇØ Ã£Àº °ÍÀÌ ÀÖÀ¸¸é true
		while(matcher.find()) {
			System.out.println("Ã£Àº °Í :" + matcher.group());
			System.out.println(matcher.start() + " to "  + matcher.end());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
