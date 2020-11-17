package myobj.poker_an;

import java.util.ArrayList;
import java.util.Collections;

public class PokerCard {
	
	Rank rank;
	Suit suit;
	
	public PokerCard(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	@Override
	public String toString() {
		return suit.getSuitPic()+ "" + rank.getSimpleName();
	}
	
	public static void main(String[] args) {
	
	}

}
