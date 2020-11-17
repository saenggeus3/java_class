package default_package;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E02_BufferedIO {
	
	// Buffered I/O
	// 버퍼를 이용해 읽기/쓰기 성능을 향상시키는 클래스
	// 버퍼란? 데이터를 입/출력하기전에 임시로 저장해두는 배열
	
	// 버퍼를 이용해야하는 이유
	// 버퍼없이 읽기/쓰기를 하게되면 입출력이 너무 자주 일어남
	
	// java programming을 쓰는경우
	// 기본 OutputStream으로 한글자씩 쓰면 16회의 출력이 발생
	// 배열에 저장해놓고 한번에 쓰면 1번의 출력만으로 끝남
	
	
	public static void main(String[] args) {
		// dummy data
		StringBuffer text = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			text.append(i + "안녕하세요\n");
		}
		
		// java.io.BufferedoutputStream
		// 생성자에 OutputStream을 요구함
		// outputStream은 출력할 장소를 선택하는 용도로 사용
		// BufferedOutputStream은 성능 업그레이드의 용도로 사용
		
		
		try {
			long start_time = System.currentTimeMillis();
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\bufferedout.txt");
			// 버퍼의 크기가 1024인 경우
			// 데이터를 해당 OutputStream에 쓸 때 1024바이트의 데이터가 다모이면 출력함
			// 혹은 프로그래머가 flush()메서드를 호출할 때 출력
			// 혹은 close()가 발생하면 여태모인 데이터를 출력함
			BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);
			
			byte[] data = new String(text).getBytes();
			
			fout.write(data);
//			for (byte b : data) {
//				fout.write(b); 한글자씩 출력할때의 속도차이를 확인하기위해 바이트단위로 꺼내서 출력
//			}
			
			bout.close();
			fout.close();
			System.out.println("출력 끝" + (System.currentTimeMillis() - start_time));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		
		// java.io.BufferedInputStream
		// InputStream을 생성자로 요구함
		
		
		try {
			FileInputStream	fin = new FileInputStream("D:\\java_io\\bufferedout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin,1024);
			
			// read()의 기본 오버로딩
			// 한바이트를 int값으로 읽어옴
			
			// read(byte[]) 오버로딩
			// 전달한 byte[]의 크기만큼의 byte를 채워줌
			// 전달한 배열중에 몇 byte를 채웠는지를 반환(len)
			
			// read(byte[], off, len)
			// 전달한 byte[]배열중에서 off부터 len까지에만 데이터를 채워줌
			// 전달한 배열에 몇 byte를 채웠는지 반환
			
//			byte[] buff = new byte[1024];
//			
//			int len;
//			int count = 0;
//			while((len = bin.read(buff)) != -1) {
//				System.out.print(new String(buff, 0, len));
//				System.out.print("\n" + count++ + "번째 읽기\n");
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
