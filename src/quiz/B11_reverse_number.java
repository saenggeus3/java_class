package quiz;

import java.util.Scanner;

public class B11_reverse_number {
	
	public static void main(String[] args) {
		
		// ����ڷκ��� ������ �ϳ� �Է¹ް�
		// �� ������ ���� �ڸ����� ������� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� > ");
		int input = sc.nextInt();
		
		if (input==0) {
			System.out.println("0");
		}else if (input<0) {
			input = input*-1;
			System.out.print("-");
			while(input>0) {
				System.out.print(input%10);
				input=input/10;
			}
		}else {
			while(input>0) {
				System.out.print(input%10);
				input=input/10;
			}
		}
		
		
		
	}

}
