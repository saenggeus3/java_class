package myobj.poker;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	static String[] card = new String[] {"A","2","3","4","5","6","7","8","9","10","K","Q","J"};
	
	public static List<Card> deck() {
		int n = 0;
		int up = 0;
		List<Card> deck = new ArrayList<Card>();
		for (int i = 0; i < 52; i++) {
			
			if(up==0) {
				deck.add(new Card(card[n],"♠",n,3));
			}else if(up==1) {
				deck.add(new Card(card[n],"♦",n,2));
			}else if(up==2) {
				deck.add(new Card(card[n],"♥",n,1));
			}else {
				deck.add(new Card(card[n],"♣",n,0));
			}	
			
			n++;
			if (n%card.length==0) {
				n=0;
				up++;
			}
				
		}
		return deck;
	}
		

}
