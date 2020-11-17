package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class E04_SaveGame {
	
	// 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든후
	static int win = 0;
	static int lose = 0;
	static int draw = 0;
	static String filename = "D:\\java_io\\game\\winrate.txt";
	
	public static void data_in() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename,Charset.forName("UTF-8")));
			
			String[] data_win = br.readLine().split(": ");
			String[] data_lose = br.readLine().split(": ");
			String[] data_draw = br.readLine().split(": ");
			
			win = Integer.parseInt(data_win[1]);
			lose = Integer.parseInt(data_lose[1]);
			draw = Integer.parseInt(data_draw[1]);
			
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void data_out() {
		
		String tmp = String.format("승 : %d\n패 : %d\n무 : %d", win, lose, draw);
		
		try {
			PrintWriter pw = new PrintWriter(
					new BufferedWriter(
							new FileWriter(filename,Charset.forName("UTF-8"))
					)
			);
			pw.print(tmp);
			
			pw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static int game() {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		int user;
		int com = (int)(Math.random()*3)+1;
		String[] rockPaperScissors = new String[] {"가위","바위","보"};
		
		System.out.print("1가위 2바위 3보\n > ");
		user = sc.nextInt();
		
		System.out.printf("나 : %s\n컴퓨터  : %s\n",rockPaperScissors[user-1],rockPaperScissors[com-1]);
		
		if (user-com==0) {
			n=0;
		}else if(user-com==-1 || user-com==2) {
			n=-1;
		}else {
			n=1;
		}
		return n;
		
	}
	
	public static void win_rate(int result) {
		switch (result) {
		case -1:
			System.out.println("패배");
			lose++;
			break;
		case 0:
			System.out.println("무승부");
			draw++;
			break;
		case 1:
			System.out.println("승리");
			win++;
			break;

		default:
			break;
		}
	}
	
	// 프로그램 종료시 자동으로 플레이어의 전적을 파일에 저장
	// 프로그램 실행시 전적을 불러오도록 만듬
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 디렉토리 생성 메서드
		File dir = new File("D:\\java_io\\game");
		
		if (!dir.exists()) {
			dir.mkdir();
			try {
				PrintWriter pw = new PrintWriter(
						new BufferedWriter(
								new FileWriter(filename,Charset.forName("UTF-8"))
						)
				);
				String tmp = String.format("승 : %d\n패 : %d\n무 : %d", win, lose, draw);
				pw.print(tmp);
				
				pw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		data_in();
		
		while(true) {
			System.out.print("1.게임시작\n2.전적\n3.종료\n> ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				win_rate((game()));
				break;
			case 2:
				String tmp = String.format("%d승  %d패  %d무\n", win, lose, draw);
				System.out.println(tmp);
				break;
			case 3:
				data_out();
				sc.close();
				return;
			default:
				System.out.println("해당메뉴가 없습니다.");
				break;
			}
		}
		

		
	}

}
