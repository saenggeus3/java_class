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
			
			// 새 게임 인스턴스가 생성되면 파일에서 전적을 읽은 뒤
			// 변수들을 초기화함
			try {
				fin = new FileInputStream(new File(SAVEPATH));
				din = new DataInputStream(fin);
				
				win = din.readInt();
				draw = din.readInt();
				lose = din.readInt();
				money = din.readInt();
				
			} catch (FileNotFoundException e) {
				//게임을 처음 실행했을 때 발생하는 예외
				System.out.println("처음 실행 세이브파일을 생성합니다.");
				try {
					fout = new FileOutputStream(new File(dir,"save.sav"));
					dout = new DataOutputStream(fout);
					
					dout.writeInt(0);	// win
					dout.writeInt(0);	// draw	
					dout.writeInt(0);	// lose
					dout.writeInt(5000);// money
					
					// 데이터를 쓴뒤 인스턴스 변수들을 초기화
					win = 0;
					draw = 0;
					lose = 0;
					money = 5000;
					
				} catch (FileNotFoundException e1) {
					System.out.println("세이브 파일 생성도중 에러발생 " + e1.getMessage());
					
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
			System.out.println("플레이어의 현재 정보");
			System.out.printf("%d승 %d무 %d패\t%d원 보유중\n",win,draw,lose,money);
		}
		
		public void execute_game() {
			br = new BufferedReader(new InputStreamReader(System.in)) ;
			int user_select = -1;
			int com_select = (int)(Math.random()*3);
			while(true) {
				
				try {
					System.out.print("가위(0), 바위(1), 보(2) > ");
					user_select = Integer.parseInt(br.readLine());
					
					if (user_select < 0 || user_select > 2) {
						throw new NumberFormatException("범위를 벗어났습니다.");
					}
					
					break;
				} catch(NumberFormatException e) {
					System.out.println("재대로선택해주세요");
				} catch (IOException e) {
					System.out.println("다시입력해주세요");
				}
			}
			int timer = 300;
			try {
				System.err.print("가");
				Thread.sleep(timer);
				 System.err.print("위");
				 Thread.sleep(timer);
				 System.err.print("바");
				 Thread.sleep(timer);
				 System.err.print("위");
				 Thread.sleep(timer);
				 System.err.println("보!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("사용자 선택 : " + user_select);
			System.out.println("컴퓨터 선택 : " + com_select);
			
			if (user_select == com_select) {
				draw++;
			}else if(user_select == (com_select+1)%3) {
				win++;
				money+=500;
				System.out.println("유저 승리 ! (+500)");
			}else if((user_select+1)%3==com_select) {
				lose++;
				money -= 500;
				System.out.println("유저 패배! (-500)");
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
			System.out.println("계속하시겠습니까? (Y/N)");
			if (!"Y".equals(br.readLine())) {
				game.save();
				System.out.println("저장되었습니다");
				break;
			}
		}

		
	}
	


}