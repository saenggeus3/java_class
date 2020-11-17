package quiz;

public class B03_charQuiz {
	
	public static void main(String[] args) {
		
		//char형 변수 a가 'q'또는'Q'일때 true
		char a = 'q';
		System.out.println((int)a=='q' || (int)a=='Q');
		
		//char형 변수 b가 공백이나 탭이 아닐 때 true
		char b = 'J';
		System.out.println((int)b != ' ' && (int)b !='	');
		
		//char형 변수 c가 문자('0'~'9')일 때 true
		char c = '2';
		System.out.println((int)c>='0' && (int)c<='9');
		
		//char형 변수 d가 영문자 일때 true
		char d = 'K' ;
		System.out.println((int)d >= 'A' && (int)d <= 'Z' || (int)d >= 'a' && (int)d <= 'z');
		
		// Hangul Jamo : 0x1100 - 0x11FF
		// Hangul syllables : 0xAC00 - 0xD7A3
		
		//char형 변수 e가 한글일 때 true
		char e = 'ㅜ';
		System.out.println((int)e >= '가' && (int)e <= '힣' || (int)e >= 'ㄱ' && (int)e <= 'ㆌ');
		
		//char형 변수 f가 일본어일 때 true
		char f = 'か';
		System.out.println((int)f >= 'ぁ' && (int)f <= 'ヿ');
		
		//System.out.println((int)' ' + " ? " + (int)'	');
		
	}

}
