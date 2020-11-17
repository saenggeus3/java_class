import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {
	
	// ����ǥ���� (Regular Expression)
	// ���ڿ��� ������ ǥ���ϴ� ���
	// �ش� ���ϰ� ��ġ�ϴ� ���ڿ��� �˻��� �� ����
	
	// Pattern Ŭ����
	// ���� ǥ������ �ٷ�� Ŭ����
	
	// Matcher Ŭ����
	// ������ �̿��Ͽ� ��� ���ڿ��� �˻��� �� ����ϴ� Ŭ����
	
	public static void main(String[] args) {
		
		String str = "sleep";
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� ������
		System.out.println(Pattern.matches("sleep", str));
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
	
		
		// [] ���ο� ������ �� �ִ� ��
		// abc	:	a,b,c�����
		// ^abc	:	a,b,c�� ������ ��θ� ���
		// a-z	:	a���� z���� ���
		// &&	:	������
		System.out.println(Pattern.matches("s[^1-9]eep", "sZeep"));
		System.out.println(Pattern.matches("s[a-zA-Z]eep", "sZeep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		
		// [] ���� �ش���ġ�� �� ���ڿ� ǥ���ϴ� ��
		// .	:	�ش� �ڸ��� ��� ���ڸ� ���
		
		// �������ڸ� �����ϰ� ǥ���ϴ� ����
		// \d	:	�ش� �ڸ��� ���ڵ��� ���
		// \D	:	�ش� �ڸ��� ���ڸ� ������ ������ ���
		// \s	:	�ش� �ڸ��� ������ ��� [\t\n\r... ���� ��� �����]
		// \S	:	�ش��ڸ��� ������ ������ ������ ���
		// \w	:	�Ϲ����� ���ڵ��� ���	(a-z A-Z _ 0-9)
		// \W	:	�Ϲ����� ���ڵ��� ������ ������ ���	^(a-z,A-Z,_,0-9)
		
		System.out.println(Pattern.matches("s.eep", "seeep"));
		System.out.println(Pattern.matches("s\\deep", "seeep"));	// ���ڿ������̱⶧���� \\�� \�� ���
		System.out.println(Pattern.matches("s\\Deep", "seeep"));
		System.out.println(Pattern.matches("s\\seep", "seeep"));
		System.out.println(Pattern.matches("..[\\d]..", "ab1de"));
		
		//�ش� ������ ����� ������ ������ �����ϴ� ��� 		!!������ �������
		//Ex {n} 	:	�տ� �ִ� ������ n���� ��ġ�ؾ���
		//Ex {n,m} 	:	�տ� �ִ� ������ �ּ� n���� �̻� �ִ� m���� ��ġ�ؾ���
		//Ex {n,}	:	n���� �̻� ��ġ�ؾ���
		//Ex?		:	�ش� ���ڰ� 2ȸ�̻��̸� �ȵ�
		//Ex+		:	�ش� ���ڰ� 1ȸ�̻� �����ؾ���
		//Ex*		:	0��Ȥ�� ������
		System.out.println(Pattern.matches("....[\\d]{4}", "abde1234"));
		System.out.println("��ȿ�� ���̵� : " +
		Pattern.matches("[\\w��-�R]{2,8}", "ab����e1B4"));
		System.out.println(Pattern.matches("[@]?", "@@"));
		System.out.println(Pattern.matches("[@]+", "@@"));
		System.out.println(Pattern.matches("[@]*", "@@"));
		
		String email = "abc@naver.com";
		System.out.println("�̸��� ���� : "
				+ Pattern.matches("[\\w]+[@][\\a-zA-Z0-9]+[.][a-zA-Z.]+", email));
		
		
		// Pattern.matches(regex, str)
		// ������ ���ڿ��� ����ǥ���İ� ��ġ�ϸ� true
		
		// Pettern.compile(regex)
		// ������ ���� ǥ������ �̿��� ������ �ν��Ͻ��� ��ȯ
		Pattern email_regex = Pattern.compile("[\\w]+[@][\\a-zA-Z0-9]+[.][a-zA-Z.]+");
		
		//������ Pattern �ν��Ͻ��� split�ϱ�
		Pattern split_regex = Pattern.compile("/");
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		// ������ Pattern �ν��Ͻ��� Matcher����
		// java.util.regex.Matcher
		// �ش� ����ǥ���İ� ��ġ�ϴ� �ε����� ã�� ���
		Pattern fruit_regex = Pattern.compile("[a-zA-Z[^/]]+");
		Matcher matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		//find : ����ǥ������ ���� ã�� ���� ������ true
		while(matcher.find()) {
			System.out.println("ã�� �� :" + matcher.group());
			System.out.println(matcher.start() + " to "  + matcher.end());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
