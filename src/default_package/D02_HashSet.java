package default_package;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {
	
	//Set
	// 집합을 구현해 놓은 클래스
	// 요소로 같은 값이 들어오는 것을 허용하지 않는다
	
	//Hash
	// 어떤 값을 넣었을 때 전혀 예측할 수 없는 값이 생성되어야 하는 알고리즘
	// 예측할 수 없는 값을 이용하므로 정렬이 불가능함
	// 생성된 값으로 원래 값을 찾는 것이 불가능에 가까움
	// 다시 원래값으로 돌아갈 수 없는 단방향성 알고리즘
	// 속도가 빠르고 보안성도 뛰어난 알고리즘
	
	public static void main(String[] args) {
		
		HashSet<Integer> even = new HashSet<Integer>();
		
		//Set에는 똑같은 데이터를 저장 할 수 없음
		even.add(10);
		even.add(10);
		even.add(20);
		even.add(20);
		even.add(30);
		even.add(30);
		even.add(40);
		
		// Hash를 이용하는클래스는 값이 순서대로 보관되지않음
		System.out.println(even);
		// HashSet은 index가 없기 때문에 하나만 꺼낼수가 없음
		
		ArrayList<String> animal_list = new ArrayList<String>();
		
		animal_list.add("lion");
		animal_list.add("lion");
		animal_list.add("lion");
		animal_list.add("cat");
		animal_list.add("cat");
		animal_list.add("dog");
		animal_list.add("dog");
		animal_list.add("eagle");
		animal_list.add("eagle");
		
		Collections.shuffle(animal_list);
		System.out.println(animal_list);
		
		//다른종류의 컬렉션을 Set으로 손쉽게 변경할 수 있음
		//중복이 제거되는 효과가 있음
		Set<String> animal_set = new HashSet<String>(animal_list);
		System.out.println(animal_set);
			
		Object[] animal_arr = animal_list.toArray();
		String first_animal = (String)animal_arr[0];
		System.out.println(first_animal);
		
		String[] animalArr = new String[animal_set.size()];
		animal_set.toArray(animalArr);
		String firstAnimal = animalArr[0];
		System.out.println(firstAnimal);
		
		// contains : 컬렉션에 해당 요소가 있는지 여부를 반환
		System.out.println(animal_list.contains("lion"));
		System.out.println(animal_set.contains("lion"));
		
		// size : 컬렉션 크기 반환
		System.out.println(animal_set.size());
		
		// remove : 컬렉션 요소 삭제 (삭제성공시 true반환)
		System.out.println(animal_set.remove("lion"));
				
		// 다른 컬렉션을 이용하는 메서드들
		Set<Character> alphabets01 = new HashSet<Character>();
		Set<Character> alphabets02 = new HashSet<Character>();
		
		Collections.addAll(alphabets01, 'A','B','C','D','E');
		Collections.addAll(alphabets02, 'D','E','F','G','H');
	
		System.out.println(alphabets01);
		System.out.println(alphabets02);
		
		// addAll(collection) : 다른 컬렉션의 모든 값을 추가함
		List<Character> alpha_all = new ArrayList<>();
		alpha_all.addAll(alphabets01);
		alpha_all.addAll(alphabets02);
		 System.out.println(alpha_all);
		 
		 // remavoAll(collection) 다른 컬렉션과 일치하는 모든 값을 제거함
		 Set<Character> to_remove = new HashSet<Character>();
		 Collections.addAll(to_remove,'A','D');
		 
		 alpha_all.removeAll(to_remove);
		 System.out.println(alpha_all);
		 
		 // retainAll(collection) 전달한 컬렉션과 일치하는 값만 유지함
		 ArrayList<Character> to_retain = new ArrayList<Character>();
		 
		 to_retain.add('E');
		 to_retain.add('G');
		 
		 alpha_all.retainAll(to_retain);
		 System.out.println(alpha_all);
		 
		 // containsALL(collecction) : 전달한 컬렉션의 모든 요소가 포함되어 있는지 확인한다
		 Collections.addAll(alpha_all,'A','B','C','D');
		 
		 Set<Character> must_contain = new HashSet<Character>();
		 
		 must_contain.add('A');
		 must_contain.add('B');
		 must_contain.add('C');
		 must_contain.add('D');
		 //alpha_all에 must_contain이 모두 포함되어있는지 확인
		 System.out.println(alpha_all.containsAll(must_contain));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
