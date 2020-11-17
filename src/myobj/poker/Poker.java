package myobj.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
	
	// PokerHand 클래스 구현
	
	// 다섯장의 pokerCard를가짐
	
	// 다섯장의 pokerCard의 숫자/무늬를 통해 족보를 완성
	
	// 다른 pokerHand 인스턴스와 족보를 통한 크기비교가 가능해야함
	
	// 다섯장중 원하는 카드 하나만 공개하는 기능이있어야함
	
	// 카드를 한장씩 추가하는 기능이있어야함
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		List<Card> user = new ArrayList<Card>();
		List<Card> com = new ArrayList<Card>();
		
		
		while(true) {
			List<Card> deck = Deck.deck();
			Collections.shuffle(deck);
			System.out.println("1.게임시작\n2.종료");
			System.out.print("> ");
			input = sc.nextInt();
			switch (input) {
			case 1:
				Game.gameStart(user, com, deck);
				break;
			case 2:
				return;

			default:
				break;
			}
		}
		
	}

}
