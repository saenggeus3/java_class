package default_package;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E01_JavaIO {
	
	public static void main(String[] args) {
		
		// Java I/O (input and Output)
		// - �ڹٴ� ��Ʈ���� �̿��� ������� �ٷ�
		// ���α׷����� ������ ��� �����͵��� �Է��̶�� �θ�(Input)
		// ���α׷��� �����ؼ� �������� ��� �����͵��� ����̶�� �θ� (Output)
		
		//Stream
		// java.io
		// �����͵��� ������ ���
		// �Է¹����� ����ϴ� ��θ� InputStream�̶�� �θ�
		// ����Ҷ� ����ϴ� OutputStream�̶�� �θ�
		// �����Ͱ� Stream�� ���� �̵��� ���� 0��1�� ��ȯ�Ͽ� �����Ѵ�
		
		//OutputStream Ŭ������ ���� �޼���
		// write(int)
		// write(byte[])
		// flush 	-	��Ƴ��� �����͸� ������
		// close	-	��Ʈ���� ����(�޸� ����)
		
		//InputStream Ŭ������ ���� �޼���
		// int read() : ���� �� ����Ʈ�� �о�´�, EOf(end of file)�� �����ϸ� -1�� ��ȯ
		// close()	:	��Ʈ���� ���� (�޸� ����)
		
		
		//FileOutputStream
		// ���Ͽ� ����ϴµ��� Ưȭ�� OutputStream
		// JAVA IO Ŭ�������� ��κ� �ʼ������� ó���ؾ��ϴ� ���ܰ� ������
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\testout.txt");
			
			//int�� ����ϴ� ���
			fout.write(65);
			//byte[]�� ����ϴ� ���
			byte[] date = "�ȳ��ϼ���".getBytes();
			fout.write(date);
			
			fout.close();
			// IO�� ��Ʈ������ �޸𸮸� gc�� �����ذ��� �ʱ� ������ �� �� ��Ʈ���� �ݵ�� �ݾ��־����
		} catch (FileNotFoundException e) {
			System.out.println("������ ��ã�ҽ��ϴ�.");
		} catch (Exception e) {
			System.out.println("���ٰ� �հ� ���� ����");		
		}
		
		
		//FileInputStream
		// ���Ϸκ��� �Է��� �޴µ� Ưȭ�� InputStream
		
		try {
			FileInputStream fin = new FileInputStream("D:\\java_io\\testout.txt");
			
			byte[] bytes = new byte[100];
			
			//���� ���� -1�� �ƴѵ��� ��� �о����
			int ch = -1;
			int index = 0;
			while((ch=fin.read()) != -1) {
				bytes[index++] = (byte) ch;
			}
			
			System.out.println(Arrays.toString(bytes));
			System.out.println(new String(bytes)); // �ѱ��ڵ带 ���ڵ��Ͽ� �ҷ���
			
			fin.close();
		} catch (FileNotFoundException e) {
			System.err.println("�ش������� ã�� ���߽��ϴ�.");
		} catch (IOException e) {
			System.err.println("io���� �����߻�");
		}
		
		// FileInputStream, FileoutputStream�� �����͸� �ڵ�� �о���� ������
		// ���α׷��Ӱ� ���� ���·� �������ϴ� ������ �ʿ���
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
