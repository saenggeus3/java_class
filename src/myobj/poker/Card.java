package myobj.poker;

public class Card {
	
	String num;
	String suit;
	int check_num;
	int check_suit;
	
	public Card() {
		// TODO Auto-generated constructor stub
	}
	
	public Card(String num, String suit, int check_num, int check_suit) {
			this.num = num;
			this.suit = suit;
			this.check_num = check_num;
			this.check_suit = check_suit;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s%s ",suit,num);
	}


}
