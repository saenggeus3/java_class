package quiz;


import java.util.Random;
import java.util.Scanner;

//다른함수에서도 변수를 사용할수있도록 함수 밖에 변수를 선언할 수 있음


public class B12_BlackJack {
	//public static String[][] deck; 전역변수 선언 다른함수에서도 사용가능
	
	public static boolean input() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		while(true) {
			System.out.println("hit\to or 1\nstand\tx or 2");
			System.out.print("> ");
			char ch = sc.next().charAt(0);
			System.out.println();
			if(ch=='o' || ch=='1') {
				return true;
			}else if(ch=='x' || ch=='2') {
				return false;
			}
		}
	}
	
	public static String[][] Shuffle(String[] strArr) {
		
		String[][] deck = new String[4][strArr.length];
		Random ran = new Random();
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < strArr.length; j++) {
				if(i==0) {
					deck[i][j]="♠"+strArr[j];
				}else if(i==1) {
					deck[i][j]="♥"+strArr[j];
				}else if(i==2) {
					deck[i][j]="♦"+strArr[j];
				}else {
					deck[i][j]="♣"+strArr[j];
				}
				
			}
		}
		
		for (int i = 0; i < 500; i++) {
			int ran1 = ran.nextInt(4);
			int ran2 = ran.nextInt(strArr.length);
			String tmp = deck[0][0];
			deck[0][0] = deck[ran1][ran2];
			deck[ran1][ran2] = tmp;
		}
		
		return deck;
	}
	
	public static void table(String[] com , String[] user,int player) {
		System.out.print("컴퓨터\t:  ");
		for (int i = 0; i < com.length; i++) {
			if(com[i]==null) break;
			if(i==0) {
				System.out.print("■■ ");
			}else {
				System.out.print(com[i] + " ");
			}
			
		}
		System.out.println();
		System.out.print("플레이어\t:  ");
		for (int i = 0; i < user.length; i++) {
			if(user[i]==null) break;
			System.out.print(user[i] + " ");
		}
		System.out.println("  -   " + player);
	}
	
	public static void endtable(String[] com , String[] user) {
		System.out.print("컴퓨터\t:  ");
		for (int i = 0; i < com.length; i++) {
			if(com[i]==null) break;
				System.out.print(com[i] + " ");
			
			
		}
		System.out.println();
		System.out.print("플레이어\t:  ");
		for (int i = 0; i < user.length; i++) {
			if(user[i]==null) break;
			System.out.print(user[i] + " ");
		}
		System.out.println();
	}
	
	
	
	public static void userturn() {}
	
	
	public static int game(String[][] deck,int betting) {
		Scanner sc = new Scanner(System.in);
		
		int player = 0;
		String[] playerCard = new String[10];
		int playerCount = 0;
		int playera = 0;
		
		int com = 0;
		String[] comCard = new String[10];
		int comCount = 0;
		int coma = 0;
		
		int row = 0, col = 0;
		
		for (int i = 0; i < 2; i++) {
			comCard[comCount] = deck[row][col];
			col++;
			comCount++;
			
			if(comCard[comCount-1].charAt(1)=='A' && coma==0) {
				com += 11;
				coma++;
			}else if(comCard[comCount-1].charAt(1)=='A'){
				com += 1;
			}else if(comCard[comCount-1].charAt(1)=='1' || comCard[i].charAt(1)>'9'){
				com += 10;
			}else {
				com += (comCard[comCount-1].charAt(1)-48);
			}
			
			
			playerCard[playerCount] = deck[row][col];
			col++;
			playerCount++;
			
			
			if(playerCard[playerCount-1].charAt(1)=='A' && playera==0) {
				player += 11;
				playera++;
			}else if(playerCard[playerCount-1].charAt(1)=='A'){
				player += 1;
			}else if(playerCard[playerCount-1].charAt(1)=='1' || playerCard[i].charAt(1)>'9'){
				player += 10;
			}else {
				player += (playerCard[playerCount-1].charAt(1)-48);
			}
			
		}
		table(comCard,playerCard,player);
		
		
		while(input()) {
			
			playerCard[playerCount] = deck[row][col];
			col++;
			playerCount++;
			
			if(playerCard[playerCount-1].charAt(1)=='A' && player<11) {
				player += 11;
				playera++;
			}else if(playerCard[playerCount-1].charAt(1)=='A'){
				player += 1;
			}else if(playerCard[playerCount-1].charAt(1)=='1' || playerCard[playerCount-1].charAt(1)>'9'){
				player += 10;
			}else {
				player += (playerCard[playerCount-1].charAt(1)-48);
			}
			
			
			if(player>21 && playera>0) {
				player-=10;
				playera--;
			}else if(player>21) {
				System.out.println("burst!!!\n");
				break;
			}
			if(col==deck[row].length-1) {
				col=0;
				row++;
			}
			table(comCard,playerCard,player);
			System.out.println();
		}
		
		if(player<22) {
			while(com<17) {
				comCard[comCount] = deck[row][col];
				col++;
				comCount++;
				
				if(comCard[comCount-1].charAt(1)=='A' && com<21) {
					com += 11;
					coma++;
				}else if(comCard[comCount-1].charAt(1)=='A'){
					com += 1;
				}else if(comCard[comCount-1].charAt(1)=='1' || comCard[comCount-1].charAt(1)>'9'){
					com += 10;
				}else {
					com += (comCard[comCount-1].charAt(1)-48);
				}
				
				if(col==deck[row].length-1) {
					col=0;
					row++;
				}
				if(com>21 && coma>0) {
					com-=10;
					coma--;
				}
			}
		}
		endtable(comCard,playerCard);
		System.out.println();
		
		if(player<=21 && player>com || com>21) {
			System.out.println("승리!!!");
			System.out.println("====================\n");
			return 1;
		}else if(player == com){
			System.out.println("무승부");
			System.out.println("====================\n");
			return 2;
		}else {
			betting=0;
			System.out.println("패배");
			System.out.println("====================\n");
			return 3;
		}
		
	};
	
	public static void main(String[] args) {
		
		// 블랙잭
		
		// 딜러(컴퓨터)가 카드를 뽑음 - (컴퓨터는 뽑는 카드 합이 16이하일때 무조건 뽑고, 17이상이면 무조건 멈춤)
		// 사용자는 카드를 더 뽑을지 멈출지 결정함
		// 사용자가 멈추면 승패를 출력함
		// 사용자가 카드를 더뽑았을 때 컴퓨터보다 합이 낮거나 합이 21이 넘으면 패배
		
		// 처음에는 두장을 뽑음
		// A는 1일 될 수도 있고 11이 될 수 도있음
		// 카드풀 J,Q,K 는 10에 해당함
		// 각 카드는 문양별로 한장씩 존재
		// 문자열의 순서를 뒤섞고, 순서대로 뽑는 방식
		
		//♠♥♦♣
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		String[] card = new String[] {"A","2","3","4","5","6","7","8","9","10","K","Q","J"};
		
		int money = 5000;
		
		
		boolean exit = true;
		while(exit) {
			System.out.println("1.게임시작\n2.종료\n3.보유금액초기화");
			System.out.println("                          현재보유금액 : "+money);
			System.out.print("> ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				String[][] deck = Shuffle(card);
				System.out.print("배팅할 금액 입력 : ");
				int betting = sc.nextInt();
				System.out.println();
				if(money>=betting) {
					money-=betting;
					int result =game(deck,betting);
					if(result==1) {
						money+=+betting*2;
					}else if(result==2) {
						money+=betting;
					}
				
				}else {
					System.out.println("보유한 금액보다 배팅액수가 높습니다");
					System.out.println();
				}
				break;
			case 2:
				exit = false;
				break;
			case 3:
				money = 5000;
				break;
			default:
				System.out.print("잘못된입력\n");
				break;
			}
			
		}
		
		
		
		
		
		
	}

}
