package default_package;
import java.util.Scanner;

public class B05_charAt {
	
	public static void main(String[] args) {
		
		//���ڿ�.charAt(index)
		// ���ڿ����� ���ϴ� ��°�� ���ڸ� ��ȯ
		// charAt�� ��ȯŸ���� char
		// ù ��° ���ڰ� 0�� �ε���
		
		//���ڿ�.length()
		// ���ڿ��� ����ڷ� �̷�����ִ����� �˷���
		// ��ȯŸ���� int
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ƹ��ܾ� �Է� > ");
		String word = sc.nextLine();
		
		System.out.println(word);
		System.out.println(word.charAt(0));

		System.out.println(word.charAt(1));
		
		if(word.length() >= 5) {
			System.out.println(word.charAt(5));
		}else {
			System.out.println("ã�� ���ڰ� �������� �ʽ��ϴ�");
		}
		
		
		
	}

}
