package quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class E03_JoinMember {
	
	// ����ڰ� �ڽ��� �������� ���������� �Է��ϸ�
	// �� ������ ������� �̸����� �� ���Ͽ� ����
	
	// java_io/member/���丮�� ����
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {

			
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			String age = sc.nextLine();
			System.out.print("���� : ");
			String local = sc.nextLine();
			System.out.print("��ȭ��ȣ : ");
			String number = sc.nextLine();
			
			String member = "D:\\java_io\\member\\"+name+".txt";
			
			FileWriter fw = new FileWriter(member,Charset.forName("UTF-8"));
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw,true);
			
			

			
			pw.println(name+ "/" + age + "/" + local + "/" + number);
			
			
			
			
			
			pw.close();
			bw.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// ������� �̸��� ���޹����� �ش� ����ڰ� ���Ե� ȸ���̶�� ���Ͽ��� ������ �о� ���
		// ���� ���Ե��� ���� ����̶�� ���Ե��� �ʾҴٰ� ����ϴ� �޼��带 �ۼ�
		
		// java_io/member/���丮�� ����
		
		System.out.println();
		System.out.println();
		
		System.out.print("ã�� �̸� �Է� : ");
		String sname = sc.nextLine();
		
		try {
			String member = "D:\\java_io\\member\\"+sname+".txt";
			FileInputStream fi = new FileInputStream(member);
			InputStreamReader is = new InputStreamReader(fi,Charset.forName("UTF-8"));
			
			StringBuilder sb = new StringBuilder();
			
			int i;
				while((i = is.read()) != -1) {
					sb.append(((char)i));
//					System.out.println((char)i);
					if (i==(int)'\n') {
						if (sb.toString().startsWith(sname)) {
							System.out.println(sb.toString());
						}
						sb = new StringBuilder();
					}
					
			}
			
			is.close();
			fi.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("���ԵǾ����� �ʽ��ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		// ����� ������� ������ ������ �� �ִ� �޼��带 ����
		
		
		
		
		try {
			System.out.print("������ �̸� �Է� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			String age = sc.nextLine();
			System.out.print("���� : ");
			String local = sc.nextLine();
			System.out.print("��ȭ��ȣ : ");
			String number = sc.nextLine();
			
			String member = "D:\\java_io\\member\\"+sname+".txt";
			
			FileWriter fw = new FileWriter(member,Charset.forName("UTF-8"));
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw,true);
			
			

			
			pw.println(name+ "/" + age + "/" + local + "/" + number);
			
			
			
			
			
			pw.close();
			bw.close();
			fw.close();
			
			
		} catch (FileNotFoundException e) {
			System.err.println("���ԵǾ����� �ʽ��ϴ�.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
