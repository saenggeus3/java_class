import java.util.ArrayList;
import java.util.Collections;

public class D0_ArrayList {
	
	// Java collections
	// java에서 기본적으로 제공하는 자료구조 인터페이스
	// collections 인터페이스를 구현한 클래스로는 List, Set이 있음
	
	// ArrayList
	// 배열과 다르게 크기가 자동으로 조절되는 배열 클래스
	// 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근할 때 가장 유리함
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		// ArrayList의 add(item) : 데이터를 리스트의 맨 뒤에 순차적으로 추가함
		list.add("홍길동");
		list.add("전우치");
		list.add("임꺽정");
		list.add("김두한");
		
		//add(index, item) : 원하는 위치에 데이터를 집어넣음
		list.add(2, "이순신");
		
		System.out.println(list);
		
		// ArrayList의 get(index) : 배열처럼 인덱스로 데이터를 꺼낼 수 있음
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		// ArrayList에 타입을 지정해주지 않으면 모든 타입이 들어갈 수 있는 ArrayList가됨
		// 모든타입이 들어있기 때문에 꺼낼 때 어떤 타입으로 꺼낼지 알기 힘들어짐
		// object 모든 타입의 부모타입
		// 어떤 값이 들어와도 전부 받을 수 있음
		Object name = list.get(2);
		System.out.println(name);
		
		// 타입을 지정한 ArrayList 생성하기
		ArrayList<String> fn_list = new ArrayList<String>();
		// <>로 타입을 지정해주면 ArrayList의 모든 메서드 타입이 바뀜
		// 타입을 지정할 때 사용하는 <>를 제네릭이라고 부름
		fn_list.add("apple");
		fn_list.add("strawberry");
		System.out.println(fn_list);
		
		// size() : 리스트의 크기를 반환
		System.out.println(list.size());
		
		// remove(index) : 원하는 위치의 아이템(요소/element)을을 삭제(삭제하면서 삭제한 아이템을 반환)
		System.out.println("삭제된 아이템 반환 : " + list.remove(0));
		// remove(item) : 원하는 값을 하나만 삭제
		
		fn_list.add(0, "apple");
		fn_list.add("apple");
		fn_list.add("apple");
		fn_list.add("apple");
		
		System.out.println(fn_list.remove("apple"));
		System.out.println(fn_list);
		
		int count = 0;
		while(fn_list.remove("apple")) {
			System.out.println("사과가 삭제되었습니다."+count++);
		}
		System.out.println("삭제 완료");
		
		// ArrayList와 반복문을 함께 사용하면 아주편함
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 리스트도 forEach를 사용할 수 있음
		for (String fn : fn_list) {
			System.out.println("fruit name : " + fn);
		}
		
		ArrayList<Person> plist = new ArrayList<Person>();
		
		plist.add(new Dentist());
		plist.add(new Doctor());
		plist.add(new Police());
		
		for(Person p : plist) {
			p.sayHi();
		}
		
		// 컬렉션은 Collections의 기능을 사용할 수 있음
		Collections.addAll(fn_list, "apple", "apple"); // T = String    T... 은 갯수제한없이 사용가능하단의미
		System.out.println(fn_list);
		System.out.println("apple의 등장횟수 : "
				+ Collections.frequency(fn_list,"apple"));
		
		//컬렉션 최대/최소값 구하기
		System.out.println(Collections.max(fn_list));
		System.out.println(Collections.min(fn_list));
		
		//순서대로 정렬 - sort(Collection)
		Collections.sort(fn_list);
		System.out.println(fn_list);
		
		//거꾸로 정렬 - reverse(Collection)
		Collections.reverse(fn_list);
		System.out.println(fn_list);
		
		//두 요소의 위치를 교체 - swap (Collection, i , j)
		Collections.swap(fn_list, 0, fn_list.size()-1);
		System.out.println(fn_list);
		
		for (int i = 0; i < 5; i++) {
			Collections.rotate(fn_list, -1);
			System.out.println("rotate" + i + " : " + fn_list);
		}
		
		
		Collections.shuffle(fn_list);
		System.out.println("shuffled : "+fn_list);
		
		// 원하는 값으로 컬렉션 초기화
		Collections.fill(fn_list, "banana");
		System.out.println(fn_list);
		
		
		
		
		
	}
	
	
}
