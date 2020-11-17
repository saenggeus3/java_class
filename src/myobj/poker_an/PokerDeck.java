package myobj.poker_an;

import java.util.Collections;
import java.util.LinkedList;

public class PokerDeck {

	LinkedList<PokerCard> deck;
	public static final int DECKSIZE = 52;
	
	public PokerDeck() {
		deck = new LinkedList<PokerCard>();
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				deck.add(new PokerCard(rank,suit));
			}
		}
		Collections.shuffle(deck);
		//System.out.println("[System] New deck created and shuffled");
	}
	
	public PokerCard draw() {
		return deck.pop();
	}
	
	public static void main(String[] args) {
	}
	
}
