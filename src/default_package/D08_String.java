package default_package;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D08_String {

	public static void main(String[] args) {
		String str = "apple/banana/orange/sagwa";
		
		//split : ���ڿ��� �ش� ���� �������� �߶� ���ڿ� �迭�� ��ȯ��
		String[] fruits = str.split("/");
		System.out.println(Arrays.toString(fruits));
		
		//join : ������ ���ڸ� �̿��Ͽ� �迭�� ��ħ
		System.out.println(String.join(",", fruits));
		
		//replace : ��ġ�ϴ� ���ڿ��� ���ϴ� ���ڿ��� ��ü��
		str = "abc123@naver.com";
		str = str.replace("@naver.com", "@gmail.com");
		System.out.println(str);
		
		//replaceAll : 	�ش� ����ǥ���İ� ��ġ�ϴ� ���ڿ���
		//				��� ���ϴ� ���ڿ��� ��ü�� ����� ��ȯ
		str = "My name is Bob. My name is Sue. My name is John";
		System.out.println(str.replaceAll("is", "was"));
		
		// format : ������ �̿��� ���ϴ� ���ڿ��� ������
		System.out.println(String.format("%d�� %d�� %d.%d", 1, 2, 3, 123));
		
		//contains : ���ڿ��� �ش� ���ڿ��� ���ԵǾ��ִ��� �˻�
		System.out.println(str.contains("bob"));
		System.out.println(str.toLowerCase().contains("bob"));
		
		//equialsIgnoreCase() : ��ҹ��ڿ� ������� ��ġ�ϴ��� �˻���
		System.out.println("Apple".equalsIgnoreCase("aPPLE"));
		
		//startsWith(seq) : ���ڿ��� �ش� ���ڿ��� �����ϴ��� �˻���
		str = "image-fruit-apple.jpg";
		System.out.println(str.startsWith("image"));
		//endsWith(seq) : ���ڿ��� �ش� ���ڿ��� �������� �˻���
		System.out.println(str.endsWith(".jpg"));
		
		//getBytes : ���ڿ��� byteŸ�� �迭�� ������
		str = "ABCDEFG";
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));
		
		str = "�ȳ��ϼ���";
		
		try {
			//���ڿ��� �ڵ�ȭ�� (���ڵ�)
			byte[] utf8_bytes = str.getBytes("UTF-8");
			byte[] euc_bytes = str.getBytes("EUC-KR");
			
			System.out.println(Arrays.toString(utf8_bytes));
			System.out.println(Arrays.toString(euc_bytes));
			
			//�ڵ���� ���ڿ��� ��ȯ�� (���ڵ�)
			//���ڵ��Ҷ� ����ߴ� ������� ���ڵ����������� �ѱ��� ����
			System.out.println(new String(utf8_bytes,"UTF-8"));
			System.out.println(new String(euc_bytes,"EUC-KR"));
			
		} catch (Exception e) {
			System.out.println("���������ʴ� ���ڵ��Դϴ�." + e.getMessage());
		}
		
		
		//getChars : char[]�� ���ڿ��� ���ϴ� �κ��� �����
		str = "Hello java python c-lang!!";
		
		char[] buffer = new char[10];
		
		str.getChars(6, 16, buffer, 0);
		System.out.println(buffer);
		
		//substring : ���ڿ��� ���ϴ� �κ��� ���ڿ��� ��ȯ��
		System.out.println(str.substring(6)); //begin�� ������ ������
		System.out.println(str.substring(6, 16));
		
		//compareTo : Comparable �������̽� �޼���
		System.out.println("compare result : " +"car".compareTo("jet"));
		
		//trim : ���ڿ� �ٱ����� ������ ������
		str = "   good bye  ";
		System.out.println(str);
		System.out.println(str.trim());
		
		//valueOf : �ٸ� Ÿ���� ���� ���ڿ��� ��ȯ�� (�ش� ��ü�� toString ����� ��ȯ����)
		String ott = String.valueOf(123);
		System.out.println(ott);
		
		//StringTokenizer
		// ���ڿ��� �ڸ��µ��� Ưȭ�� Ŭ����
		// split�� ���������� ������ �� ����
		
		str = "99/88/77/66/55/44/33/22/11";
		// boolean������ �ڸ��� ����ߴ� ���ڿ��� ��ū������� �����Ҽ�����
		// ���������� �����
		StringTokenizer st = new StringTokenizer(str,"/");
		StringTokenizer st1 = new StringTokenizer(str,"/",true);

		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		System.out.println("��ū���� : " + st.countTokens());
		//Tokens�� StringŸ������ ��ȯ�Ѵ�
		//Elements�� ObjectŸ������ ��ȯ�Ѵ�
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
