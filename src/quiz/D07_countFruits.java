package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D07_countFruits {
	
	private enum Fruit{
		APPLE,
		BANANA,
		ORANGE,
		KIWI
	}
	
	//다음 리스트를 이용해 각 과일이 몇갠지 저장한 Map을 생성
	
	static List<Fruit> fruits;
	static {
		fruits = new ArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			fruits.add(Fruit.values()[(int)(Math.random()*4)]);
		}
		
	}
	
	public static void main(String[] args) {
		
		Map<Fruit, Integer> fruitsMap = new HashMap<>();
		
		for (Fruit fruit : Fruit.values()) {
			int freq = Collections.frequency(fruits, fruit);
			fruitsMap.put(fruit, freq);
		}
		
		
//		for (Fruit fruit : Fruit.values()) {
//			fruitsMap.put(fruit, 0);
//		}
//		for(Fruit fruit : fruits) {
//			fruitsMap.put(fruit, fruitsMap.get(fruit)+1);
//		}
		
		
		System.out.println(fruitsMap);
		
		
		
	}

}
