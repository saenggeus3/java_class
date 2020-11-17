package myobj.poker_an;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;




public class PokerHand  implements Comparable<PokerHand>{
	
	ArrayList<PokerCard> hands;
	
	boolean[] opens;
	
	public PokerHand(int handSize) {
		hands = new ArrayList<PokerCard>(handSize);
		opens = new boolean[handSize];
		for (int i = 0; i < handSize; i++) {
			if (i < 2) {
				opens[i] = false;
			}else {
				opens[i] = true;
			}
		}
	}

	public void add(PokerCard card) {
		hands.add(card);
	}
	
	public void show() {
		for (int i = 0; i < hands.size(); i++) {
			System.out.print(i+1 + "번째 카드: ");
			if (opens[i]) {
				System.out.print(hands.get(i));
			}else {
				System.out.print("NOT OPENED");
			}
			System.out.println();
		}
	}
	
	public void open(int hand_index) {
		opens[hand_index] = !opens[hand_index];
	}
	public void openAllCard() {
		Arrays.fill(opens, true);
	}
	
	Set<Rank> getRankSet(){
		Set<Rank> ranks = new HashSet<>();
		
		for (PokerCard hand : hands) {
			ranks.add(hand.rank);
		}
		return ranks;
	}
	
	public static void main(String[] args) {
		int round = 0;
		while(true) {
			round++;
			PokerDeck deck = new PokerDeck();
			PokerHand player01 = new PokerHand(5);
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());
			
			
			PokerHand player02 = new PokerHand(5);
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			
			System.out.println("player01's hand");
			player01.openAllCard();
			player01.show();
			System.out.println("player02's hand");
			player02.openAllCard();
			player02.show();
			
			ArrayList<PokerHand> players = new ArrayList<PokerHand>();
			players.add(player01);
			players.add(player02);
			
			System.out.println("이긴 사람 : " + Collections.max(players).hands);
			break;
			//Collections.max(players);
			
			
			
			
			//player01.openAllCard();
			//player01.show();
		
		
//			PokerHandRanking power = new PokerHandRanking();
//			power.check(player01);
//			
//			HandRank hr = power.handrank;
//			//System.out.println(round);
//			if (hr != null && power.handrank.equals(HandRank.ROYAL_FLUSH)) {
//				player01.openAllCard();
//				player01.show();
//				
//				System.out.println(power.handrank);
//				System.out.println(round);
//				break;
//				
//			}
			
		}
	}
	
	@Override
	public int compareTo(PokerHand o) {
		PokerHandRanking rank1 = new PokerHandRanking(o);
		PokerHandRanking rank2 = new PokerHandRanking(this);
		
		System.out.println("플레이어 1 : " + rank1.getHandrank());
		System.out.println("플레이어 2 : " + rank2.getHandrank());
		
		
		return rank2.getHandrank().compareTo(rank1.getHandrank());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
