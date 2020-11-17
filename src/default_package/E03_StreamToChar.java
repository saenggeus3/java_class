package default_package;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class E03_StreamToChar {
	
	// Reader/Writer�� ���� Ŭ��������
	// Stream���� ���� �����͸� ���ڷ� ��ȯ�ϴ� Ŭ�������̴�
	
	// ���α׷��Ӱ� �����͸� ���ڷ� ���ϰ� �ٷ�� ���� ��
	// InputStream/OutputStream�� Reader/WriterŬ������
	// �ѹ� �� ���μ� �����
	
	
	
	
	public static void main(String[] args) {
		
		// abstract class Reader
		// Reader�� ��ӹ޾� ������ Ŭ������
		// BufferedReader, InputStreamReader, FileReader ...
		// Stream���� ���� �����͸� ���ڷ� �籸���Ͽ� ���α׷��ӿ��� ������
		// �ڵ� �����͸� ���ڷ� �籸���ҽ� ����� Charset(���ڵ����)�� �˸°� �������� ������ ���ڰ� ����
		
		try {
			FileReader fr = new FileReader("D:\\java_io\\bufferedout.txt", Charset.forName("UTF-8"));
			FileInputStream fin = new FileInputStream("D:\\java_io\\bufferedout.txt");
			InputStreamReader ir = new InputStreamReader(fin,Charset.forName("UTF-8"));
			BufferedReader br = new BufferedReader(ir,2048);
			
			// ReaderŬ������ read�� ���� byte�� �ƴ϶�, ���� char�� ����
			int ch;
			while((ch = ir.read()) != -1) {
				System.out.print((char)ch);
			}
			
			ir.close();
			br.close();
			fr.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// abstract class Writer
		// ���Ͽ� ���ڸ� ������ �� charset�� ������ �� ����
		// ���α׷��Ӱ� �� �� ���ϰ� OutputStream �� �̿��� �� ����	
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\bufferedout.txt"); // ���� ������ ��θ� �ް�
			
			// OutputStream��Ŀ��� Writer�� ��ȯ (byte -> char)
			OutputStreamWriter ow = new OutputStreamWriter(fout, "UTF-8"); // ���� ������ ���ڵ������� ����
			
			//Writer�� ��ȯ�ϴ� ������ �����ϴ� Ŭ����
			FileWriter fw = new FileWriter("D:\\java_io\\bufferedout.txt", Charset.forName("UTF-8"));
			
			// Buffered : ���� ���
			BufferedWriter bw = new BufferedWriter(fw, 4096); // ����ҳ����� ���ۿ� ����
			
			// Print : ���α׷��ӿ��� ���� print�޼������ �̿��� �� ����
			PrintWriter pw = new PrintWriter(bw); // ���� ������ ���
			
			// �ֿܼ� ����ϴ� ���� ���Ͽ� ����� �� ����
			for (int i = 0; i < 100000; i++) {
				pw.printf("[%d/%d %d:%d] �ȳ��ϼ��� �ݰ����ϴ�.\n",1,2,3,4);
			}
			
			pw.close();
			ow.close();
			fout.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("������ ��ã�ҽ��ϴ�.");
		} catch (UnsupportedEncodingException e) {
			System.err.println("�߸��� ���ڵ� ����Դϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
