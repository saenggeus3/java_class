import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.fruit.Mango;

public class D05_TreeSet {
	
	// TreeSet
	// 중복값을 저장할수없음
	// 데이터를 저장할 때 오름차순으로 저장함
	// 요소로 null을 허용하지 않음
	// 저장속도가 느린대신 데이터 접근/검색 속도가 빠름
	// 중복제거 + 원하는 범위의 부분집합 선택 + 크기정렬
	
	public static void main(String[] args) {
		
		TreeSet<Mango> mango_tree = new TreeSet<>(new Comparator<Mango>() { // 익명 comparator사용

			@Override
			public int compare(Mango o1, Mango o2) {
				// 같은 당도를 지닌 망고가 모두 사라짐 (Set)
				//같은 당도를 지녓을때는 망고id기준으로 정렬
				int sweet_value = o1.sweet - o2.sweet;
				// hashCode() 해당 객체를 유일하게 구분하는 값 (int id로 구분하는것과 같은효과)
				return sweet_value == 0?
						o1.hashCode() - o2.hashCode() : sweet_value;
				
			}
		});
		
		for (int i = 0; i < 10; i++) {
			mango_tree.add(new Mango());
		}
		System.out.println(mango_tree.toString());
		System.out.println(mango_tree.size());
		
		// Comparable에서 return 0은 같은 객체임을 의미하고 Set에 같이 들어가지못함
		// 해쉬코드등으로 구분하여 넣을 수 있음
		TreeSet<Mango> basic_comp_tree = new TreeSet<>(); // Mango클래스에서 오버라이드한 comparator 사용
		
		for (int i = 0; i < 100; i++) {
			basic_comp_tree.add(new Mango());
		}
		System.out.println(basic_comp_tree.toString());
		System.out.println(basic_comp_tree.size());
		
		// TreeSet 활용
		
		// descendingSet() : 내림차순으로 정렬된 Set을 반환
		System.out.println(basic_comp_tree.descendingSet());
		
		// HeadSet(toElement) : 맨 앞부터 원하는 위치까지 Set을 반환
		Set<Mango> hSet = basic_comp_tree.headSet(new Mango(250,5,5));
		System.out.println(hSet.size());
		
		// tailSet(fromElement) : 원하는 기준부터 맨 마지막까지의 Set을 반환
		Set<Mango> tSet = basic_comp_tree.tailSet(new Mango(500,5,500));
		System.out.println(tSet.size());
		
		// subSet(from, to) : 원하는 기준부터 원하는 기준까지의 Set을 반환
		SortedSet<Mango> result = mango_tree.subSet(new Mango(0, 7, 1000),new Mango(0, 9, 1000));
		System.out.println(result);
		
		// TreeSet요소를 하나만 선택하기
		TreeSet<Integer> int_tree = new TreeSet<Integer>();
		
		int_tree.add(99);
		int_tree.add(1);
		int_tree.add(75);
		int_tree.add(3);
		int_tree.add(40);
		int_tree.add(11);
		
		// floor, ceiling
		//해당 값 기준으로 가장 가까운 낮은/높은값을 하나 반환
		//같은 값이 있다면 해당 값을 반환한다
		System.out.println(int_tree.ceiling(12));
		System.out.println(int_tree.floor(12));
		
		// lower, higher
		//해당 값 기준으로 가장 가까운 낮은/높은값을 하나 반환
		//전달한 값과 같은 값은 무시함
		System.out.println(int_tree.higher(12));
		System.out.println(int_tree.floor(12));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
