package myobj.poker;

import java.util.ArrayList;
import java.util.List;

public class Hand  {
	
private static int max_hand = 5;
	
	public static List<Card> hand(List<Card> deck) {
		
		List<Card> hand = new ArrayList<Card>();
		
		for (int i = 0; i < max_hand; i++) {
			hand.add(deck.remove(0));
		}
		
		System.out.println();
		
		return hand;
	}
	
	public static void draw(List<Card> hand,List<Card> deck) {
		hand.add(deck.remove(0));
	}
	
	
	

}
