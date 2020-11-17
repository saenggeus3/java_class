import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class E10_GlobalMessageClient {
	
	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("localhost", 3455);
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			while(true) {
				// 서버에서 보낸 메세지를 기다림
				System.out.println(br.readLine());
			}
			
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
