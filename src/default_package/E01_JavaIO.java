package default_package;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E01_JavaIO {
	
	public static void main(String[] args) {
		
		// Java I/O (input and Output)
		// - 자바는 스트림을 이용해 입출력을 다룸
		// 프로그램으로 들어오는 모든 데이터들을 입력이라고 부름(Input)
		// 프로그램이 연산해서 내보내는 모든 데이터들을 출력이라고 부름 (Output)
		
		//Stream
		// java.io
		// 데이터들이 오가는 통로
		// 입력받을때 사용하는 통로를 InputStream이라고 부름
		// 출력할때 사용하는 OutputStream이라고 부름
		// 데이터가 Stream을 통해 이동할 때는 0과1로 변환하여 전송한다
		
		//OutputStream 클래스의 공통 메서드
		// write(int)
		// write(byte[])
		// flush 	-	모아놨던 데이터를 전송함
		// close	-	스트림을 닫음(메모리 해제)
		
		//InputStream 클래스의 공통 메서드
		// int read() : 다음 한 바이트를 읽어온다, EOf(end of file)에 도달하면 -1을 반환
		// close()	:	스트림을 닫음 (메모리 해제)
		
		
		//FileOutputStream
		// 파일에 출력하는데에 특화된 OutputStream
		// JAVA IO 클래스들은 대부분 필수적으로 처리해야하는 예외가 존재함
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\testout.txt");
			
			//int를 사용하는 방식
			fout.write(65);
			//byte[]를 사용하는 방식
			byte[] date = "안녕하세요".getBytes();
			fout.write(date);
			
			fout.close();
			// IO의 스트림들은 메모리를 gc가 수거해가지 않기 때문에 다 쓴 스트림은 반드시 닫아주어야함
		} catch (FileNotFoundException e) {
			System.out.println("파일을 못찾았습니다.");
		} catch (Exception e) {
			System.out.println("쓰다가 먼가 생긴 에러");		
		}
		
		
		//FileInputStream
		// 파일로부터 입력을 받는데 특화된 InputStream
		
		try {
			FileInputStream fin = new FileInputStream("D:\\java_io\\testout.txt");
			
			byte[] bytes = new byte[100];
			
			//읽은 값이 -1이 아닌동안 계속 읽어들임
			int ch = -1;
			int index = 0;
			while((ch=fin.read()) != -1) {
				bytes[index++] = (byte) ch;
			}
			
			System.out.println(Arrays.toString(bytes));
			System.out.println(new String(bytes)); // 한글코드를 디코딩하여 불러옴
			
			fin.close();
		} catch (FileNotFoundException e) {
			System.err.println("해당파일을 찾지 못했습니다.");
		} catch (IOException e) {
			System.err.println("io도중 에러발생");
		}
		
		// FileInputStream, FileoutputStream은 데이터를 코드로 읽어오기 때문에
		// 프로그래머가 원래 형태로 재조립하는 과정이 필요함
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
