import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class E10_GlobalMessage {
	
	public static void main(String[] args) {
		
		ArrayList<Socket> clients = new ArrayList<>();
		
		//Socket�� key������ �̿��� OutputStream�� ������
		// ���� �޼����� ���� �� : Key�� Socket�� ����
		// ��ü �޼����� ���� �� : ����� ��� out�� �޼��� ����
		HashMap<Socket, PrintWriter>  send_map = new HashMap<>();
		
		try {
			ServerSocket ss = new ServerSocket(3455);
			
			int count = 0;
			while(true) {
				System.out.println("������ ��ٸ����� ...");
				// ���ӿ� ������ Ŭ���̾�Ʈ���� List�� �����Ͽ� ������
				Socket user = ss.accept();
				clients.add(user);
				OutputStreamWriter osw = new OutputStreamWriter(user.getOutputStream());
				BufferedWriter bw = new BufferedWriter(osw);
				PrintWriter pw = new PrintWriter(bw);
				send_map.put(user, pw);
				
				for (PrintWriter out : send_map.values()) {
					pw.printf("<%s>���� ä�ù濡 �����ϼ̽��ϴ�.\n", user.getInetAddress());
					pw.flush();
				}
				
				
				if (count++ == 30) {
					System.out.println("������ ����Ǿ����ϴ�.");
					break;
				}
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
