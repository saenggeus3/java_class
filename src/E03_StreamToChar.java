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
	
	// Reader/Writer가 붙은 클래스들은
	// Stream으로 읽은 데이터를 문자로 변환하는 클래스들이다
	
	// 프로그래머가 데이터를 문자로 편하게 다루고 싶을 때
	// InputStream/OutputStream을 Reader/Writer클래스로
	// 한번 더 감싸서 사용함
	
	
	
	
	public static void main(String[] args) {
		
		// abstract class Reader
		// Reader를 상속받아 구현한 클래스들
		// BufferedReader, InputStreamReader, FileReader ...
		// Stream으로 얻은 데이터를 문자로 재구성하여 프로그래머에게 제공함
		// 코드 데이터를 문자로 재구성할시 사용할 Charset(인코딩방식)을 알맞게 설정하지 않으면 글자가 깨짐
		
		try {
			FileReader fr = new FileReader("D:\\java_io\\bufferedout.txt", Charset.forName("UTF-8"));
			FileInputStream fin = new FileInputStream("D:\\java_io\\bufferedout.txt");
			InputStreamReader ir = new InputStreamReader(fin,Charset.forName("UTF-8"));
			BufferedReader br = new BufferedReader(ir,2048);
			
			// Reader클래스의 read는 다음 byte가 아니라, 다음 char를 읽음
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
		// 파일에 문자를 저장할 때 charset을 지정할 수 있음
		// 프로그래머가 좀 더 편리하게 OutputStream 을 이용할 수 있음	
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\bufferedout.txt"); // 받을 파일의 경로를 받고
			
			// OutputStream방식에서 Writer로 변환 (byte -> char)
			OutputStreamWriter ow = new OutputStreamWriter(fout, "UTF-8"); // 받은 파일의 인코딩형식을 설정
			
			//Writer로 변환하는 과정을 생략하는 클래스
			FileWriter fw = new FileWriter("D:\\java_io\\bufferedout.txt", Charset.forName("UTF-8"));
			
			// Buffered : 성능 향상
			BufferedWriter bw = new BufferedWriter(fw, 4096); // 출력할내용을 버퍼에 담음
			
			// Print : 프로그래머에게 편리한 print메서드들을 이용할 수 있음
			PrintWriter pw = new PrintWriter(bw); // 담은 내용을 출력
			
			// 콘솔에 출력하던 것을 파일에 출력할 수 있음
			for (int i = 0; i < 100000; i++) {
				pw.printf("[%d/%d %d:%d] 안녕하세요 반갑습니다.\n",1,2,3,4);
			}
			
			pw.close();
			ow.close();
			fout.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("파일을 못찾았습니다.");
		} catch (UnsupportedEncodingException e) {
			System.err.println("잘못된 인코딩 방식입니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
