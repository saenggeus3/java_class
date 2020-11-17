package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import myobj.fruit.Mango;

public class D04_MaxMango {

	//생성시 칼로리가 랜덤으로 설정되는 망고클래스를 생성
	//백개의 망고 인스턴스중 가장 칼로리가 높은 망고를 선택
	//칼로리가 같은경우 더 높은 당도를 가진 인스턴스를 선택
	
	public static void main(String[] args) {
		
		Mango mango = new Mango();
		
		List<Mango> mango_list = new ArrayList<Mango>();
		
		for (int i = 0; i < 10; i++) {
			mango_list.add(new Mango());
			mango_list.get(i).print_mango();
		}
		
		System.out.println("가장높은칼로리 : " + Collections.max(mango_list).calorie);
		
		
	}
	
}
