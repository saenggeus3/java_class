package myobj.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HandRanking {
	
	int result=0;
	
	int flush = 0;
	int four = 0;
	int fullhouse = 0;
	int triple = 0;
	int pair = 0;
	int straight = 1;
	int mountain = 0;
	int stf = 1;
	int rsf = 0;
	
	
	int top = -1;
	List<Integer> pair_top = new ArrayList<Integer>();
	int triple_top = -1;
	int four_top = -1;
	int flush_top = -1;
	List<Integer> straightTmp = new ArrayList<Integer>();
	List<Card> stfTmp = new ArrayList<>();
	
	int[] suit = new int[4];
	int[] num = new int[13];
	
	
	public static void hand_sort(List<Card> hand) {
			
		Collections.sort(hand, new Comparator<Card>() { // 익명 comparator를 구현해서 적용
		@Override
		public int compare(Card o1, Card o2) {
			int value = o1.check_num - o2.check_num;
			return value == 0?
					o1.check_suit - o2.check_suit : value;
		}
	
		});
		
			
	}
	
	
	public void hand_check(List<Card> hand){
		
		
		for (int i = 0; i < hand.size(); i++) {
			suit[hand.get(i).check_suit]++;
			num[hand.get(i).check_num]++;
		}
		
		for (int i = 0; i < suit.length; i++) {
			if(suit[i]==5) {
				flush++;
				for (int j = 0; j < hand.size(); j++) {
					if (hand.get(j).check_suit==i && flush_top<hand.get(j).check_num) {
						flush_top=hand.get(j).check_num;
					}
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]==4) {
				four++;
				four_top=i;
				
			}else if(num[i]==3) {
				triple++;
				triple_top=i;
			}else if(num[i]==2) {
				pair++;
				pair_top.add(i);
			}
		}
		
		//버그!
//		for (int i = 0; i < hand.size()-1; i++) {
//			if(hand.get(i).check_num==hand.get(i+1).check_num+1 
//					&& hand.get(i).check_suit == hand.get(i).check_suit) {
//				stf++;
//				stfTmp.add(hand.get(i));
//			}else {
//				stf=1;
//				stfTmp.remove(stf);
//			}
//			if(hand.get(i).check_num==hand.get(i+1).check_num+1){
//				straight++;
//				straightTmp.add(i);
//			}else{
//				straight=1;
//				straightTmp.removeAll(straightTmp);
//				
//			}
//		}
		
		if (stf==4 && num[0]>0) {
			for (int j = 0; j < num[0]; j++) {
				if(hand.get(j).check_suit==stfTmp.get(j).check_suit) {
					rsf++;
				}
			}
		}else if(straight==4&&num[0]>0) {
			mountain++;
		}
		
	}
	
	public int handRank() {
		
		if(rsf>0) {
			
		}
		
		return result;
	}
	
	




	

}
