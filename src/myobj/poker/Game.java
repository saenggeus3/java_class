package myobj.poker;

import java.util.List;

public class Game {
	
	
	
	public static void gameStart(List<Card> user, List<Card> com,List<Card> deck) {
		
		user=Hand.hand(deck);
		com=Hand.hand(deck);
		
		System.out.println(user.toString());
		
		HandRanking.hand_sort(user);
		HandRanking.hand_sort(com);
		
		HandRanking user_hand = new HandRanking();
		user_hand.hand_check(user);
		
	}
	
	

}
