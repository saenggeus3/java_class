package quiz;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;



public class E04_SaveGame_an {
	
	static class Game {
		
		public final static String SAVEPATH;
		public final static File SAVEDIR;
		public final static File SAVEFILE;
		
		static {
			SAVEPATH = "D:\\java_io\\game_an\\save.sav";
			SAVEDIR = new File("D:\\java_io\\game_an");
			SAVEFILE = new File(SAVEDIR,"save.sav");
			
		}
		
		int win;
		int draw;
		int lose;
		int money;
		
		// input
		FileInputStream fin = null;
		DataInputStream din = null;
		BufferedReader br = null;
		
		//output
		FileOutputStream fout = null;
		DataOutputStream dout = null;
		
		
		public Game(){
			File dir = SAVEDIR;
			if(!dir.exists()) {
				dir.mkdirs();
			}
			
			// �� ���� �ν��Ͻ��� �����Ǹ� ���Ͽ��� ������ ���� ��
			// �������� �ʱ�ȭ��
			try {
				fin = new FileInputStream(new File(SAVEPATH));
				din = new DataInputStream(fin);
				
				win = din.readInt();
				draw = din.readInt();
				lose = din.readInt();
				money = din.readInt();
				
			} catch (FileNotFoundException e) {
				//������ ó�� �������� �� �߻��ϴ� ����
				System.out.println("ó�� ���� ���̺������� �����մϴ�.");
				try {
					fout = new FileOutputStream(new File(dir,"save.sav"));
					dout = new DataOutputStream(fout);
					
					dout.writeInt(0);	// win
					dout.writeInt(0);	// draw	
					dout.writeInt(0);	// lose
					dout.writeInt(5000);// money
					
					// �����͸� ���� �ν��Ͻ� �������� �ʱ�ȭ
					win = 0;
					draw = 0;
					lose = 0;
					money = 5000;
					
				} catch (FileNotFoundException e1) {
					System.out.println("���̺� ���� �������� �����߻� " + e1.getMessage());
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally {
					if(dout != null)
						try {
							dout.close();
							if(fout != null) fout.close();
						} catch (Exception e1) {}
					
				}
			}catch (IOException e){
					e.printStackTrace();
			}finally {
				try {
					if (din != null) din.close();
					if (fin != null) din.close();
				} catch (IOException e) {
					// TODO: handle exception
				}

			}
		}
		public void print_game() {
			System.out.println("�÷��̾��� ���� ����");
			System.out.printf("%d�� %d�� %d��\t%d�� ������\n",win,draw,lose,money);
		}
		
		public void execute_game() {
			br = new BufferedReader(new InputStreamReader(System.in)) ;
			int user_select = -1;
			int com_select = (int)(Math.random()*3);
			while(true) {
				
				try {
					System.out.print("����(0), ����(1), ��(2) > ");
					user_select = Integer.parseInt(br.readLine());
					
					if (user_select < 0 || user_select > 2) {
						throw new NumberFormatException("������ ������ϴ�.");
					}
					
					break;
				} catch(NumberFormatException e) {
					System.out.println("���μ������ּ���");
				} catch (IOException e) {
					System.out.println("�ٽ��Է����ּ���");
				}
			}
			int timer = 300;
			try {
				System.err.print("��");
				Thread.sleep(timer);
				 System.err.print("��");
				 Thread.sleep(timer);
				 System.err.print("��");
				 Thread.sleep(timer);
				 System.err.print("��");
				 Thread.sleep(timer);
				 System.err.println("��!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("����� ���� : " + user_select);
			System.out.println("��ǻ�� ���� : " + com_select);
			
			if (user_select == com_select) {
				draw++;
			}else if(user_select == (com_select+1)%3) {
				win++;
				money+=500;
				System.out.println("���� �¸� ! (+500)");
			}else if((user_select+1)%3==com_select) {
				lose++;
				money -= 500;
				System.out.println("���� �й�! (-500)");
			}
			print_game();
			
		}
		
		public void save() {
			
			try {
				fout = new FileOutputStream(SAVEPATH);
				dout = new DataOutputStream(fout);
				
				dout.writeInt(win);
				dout.writeInt(draw);
				dout.writeInt(lose);
				dout.writeInt(money);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if(fout != null) fout.close();
					if(dout != null) dout.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			
			
			
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		

		Game game = new Game();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			game.execute_game();
			System.out.println("����Ͻðڽ��ϱ�? (Y/N)");
			if (!"Y".equals(br.readLine())) {
				game.save();
				System.out.println("����Ǿ����ϴ�");
				break;
			}
		}

		
	}
	


}