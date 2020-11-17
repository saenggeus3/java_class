package default_package;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E02_BufferedIO {
	
	// Buffered I/O
	// ���۸� �̿��� �б�/���� ������ ����Ű�� Ŭ����
	// ���۶�? �����͸� ��/����ϱ����� �ӽ÷� �����صδ� �迭
	
	// ���۸� �̿��ؾ��ϴ� ����
	// ���۾��� �б�/���⸦ �ϰԵǸ� ������� �ʹ� ���� �Ͼ
	
	// java programming�� ���°��
	// �⺻ OutputStream���� �ѱ��ھ� ���� 16ȸ�� ����� �߻�
	// �迭�� �����س��� �ѹ��� ���� 1���� ��¸����� ����
	
	
	public static void main(String[] args) {
		// dummy data
		StringBuffer text = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			text.append(i + "�ȳ��ϼ���\n");
		}
		
		// java.io.BufferedoutputStream
		// �����ڿ� OutputStream�� �䱸��
		// outputStream�� ����� ��Ҹ� �����ϴ� �뵵�� ���
		// BufferedOutputStream�� ���� ���׷��̵��� �뵵�� ���
		
		
		try {
			long start_time = System.currentTimeMillis();
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\bufferedout.txt");
			// ������ ũ�Ⱑ 1024�� ���
			// �����͸� �ش� OutputStream�� �� �� 1024����Ʈ�� �����Ͱ� �ٸ��̸� �����
			// Ȥ�� ���α׷��Ӱ� flush()�޼��带 ȣ���� �� ���
			// Ȥ�� close()�� �߻��ϸ� ���¸��� �����͸� �����
			BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);
			
			byte[] data = new String(text).getBytes();
			
			fout.write(data);
//			for (byte b : data) {
//				fout.write(b); �ѱ��ھ� ����Ҷ��� �ӵ����̸� Ȯ���ϱ����� ����Ʈ������ ������ ���
//			}
			
			bout.close();
			fout.close();
			System.out.println("��� ��" + (System.currentTimeMillis() - start_time));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		
		// java.io.BufferedInputStream
		// InputStream�� �����ڷ� �䱸��
		
		
		try {
			FileInputStream	fin = new FileInputStream("D:\\java_io\\bufferedout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin,1024);
			
			// read()�� �⺻ �����ε�
			// �ѹ���Ʈ�� int������ �о��
			
			// read(byte[]) �����ε�
			// ������ byte[]�� ũ�⸸ŭ�� byte�� ä����
			// ������ �迭�߿� �� byte�� ä�������� ��ȯ(len)
			
			// read(byte[], off, len)
			// ������ byte[]�迭�߿��� off���� len�������� �����͸� ä����
			// ������ �迭�� �� byte�� ä������ ��ȯ
			
//			byte[] buff = new byte[1024];
//			
//			int len;
//			int count = 0;
//			while((len = bin.read(buff)) != -1) {
//				System.out.print(new String(buff, 0, len));
//				System.out.print("\n" + count++ + "��° �б�\n");
//			}
			int b;
			while((b = bin.read()) != -1) {
				System.out.print((char)b);
			}
			
			bin.close();
			fin.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
