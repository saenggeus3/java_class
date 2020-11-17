import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;


public class E08_NetworkProgramming {
	
	//네트워크 프로그래밍
	// 2대이상의 컴퓨터가 자원을 함께 사용하는 프로그램을 만드는 것\
	// 다른 컴퓨터와 통신하기 위해 IP주소/프로토콜/포트번호 등의 개념을 이용함
	
	// ip주소
	// 다른 컴퓨터를 찾아가기 위한 주소
	// 각 자리수가 0-255 (0.0.0.0 ~ 255.255.255.255)
	
	// 프로토콜
	// 프로그램간에 의사소통을 하기 위한 규칙
	// TCP, FTP, TELNET, SMTP
	
	// 포트번호
	// 한 컴퓨터에서 여러가지 프로그램들중 하나를 선택하기 위한 번호
	// IP주소와 포트번호를 통해 상대편의 프로그램을 찾아갈 수 있음
	// 0 ~ 65535
	
	// MAC주소
	// 내부망에서 해당 컴퓨터를 정확하게 찾아가기 위한 번호
	
	public static void main(String[] args) {
		
		try {
			// 서버 소켓을 생성함
			ServerSocket ss = new ServerSocket(3456);
			HashMap<String, Integer> connect_count = new HashMap<>();
			
			int count = 0;
			
			while(true) {
			// accept메서드를 실행하면 연결이 될때까지 기다림
			// 누군가가 접속하면 접속한 사용자의 정보를 담고있는 Socket을 반환함
				System.out.println("[Server] 연결을 기다리는 중...");
				Socket s = ss.accept();
				
				System.out.printf("[Server] 메세지를 기다리는 중... (총 접속자 : %d명)\n",++count);
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				String msg = br.readLine();
				
				//Socket의 getInetAddress로 상대방의 IP주소를 알 수 있음
				//Socket에는 IP주소 이외에도 상대와의 연결에 필요한 다양한 정보들이 들어있음
				String ipaddr = s.getInetAddress().toString();
				
				System.out.printf("(%s) %s\n", ipaddr, msg);
				
				// 처음들어온 ip는 key로 값을0으로만들어 저장
				// 이미있는 ip는 접속할때마다 값에 1을 더함
				if (connect_count.containsKey(ipaddr)) {
					connect_count.put(ipaddr, connect_count.get(ipaddr)+1);
				}else {
					connect_count.put(ipaddr, 1);
				}
				
				
				if (count % 10 == 0) {
					System.out.println("(축)접속자 + count +명 돌파");
				}else if(count == 20) {
					break;
				}
				
			}
			
			System.out.println("프로그램을 종료합니다.");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
