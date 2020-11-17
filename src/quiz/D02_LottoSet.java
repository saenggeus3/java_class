package quiz;

import java.util.HashSet;
import java.util.Set;

public class D02_LottoSet {

	//1부터 45의 중복없는 숫자 6개로 이루어진 HashSet을 생성
	
	
	
	public static void main(String[] args) {
		
		System.out.println(lotto());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static Set<Integer> lotto() {
		Set<Integer> lotto_set = new HashSet<Integer>();
		while(lotto_set.size()!=6) {
			lotto_set.add((int) ((Math.random()*45)+1));
		}
		return lotto_set;
	}
	
	
	
	
	
	
}
