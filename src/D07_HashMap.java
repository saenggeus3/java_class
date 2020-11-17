import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class D07_HashMap {
	
	// Map
	// key/value가 한 세트는 이루는 자료구조
	// key값을 통해 value를 찾는 자료구조
	// key는 중복을 허용하지 않음
	
	public static void main(String[] args) {
		// map은 key/Value 쌍을 이루기 때문에 제네릭을 두 개 받음
		Map<String, String> map1 = new HashMap<>();
		
		
		// put메서드를 이용해 데이터를 저장한다
		// key는 해당 데이터의 카테고리(속성, property, attribute)을 의미함
		// Value는 해당 항목의 값을 저장함
		map1.put("이름", "꼬맹이");
		map1.put("나이", "5살");
		map1.put("견종", "포메라니안");
		map1.put("견종", "치와와"); // 같은 key를 이용하면 값을 수정함
		map1.put("주인의 나이", "5살");
		
		// get 메서드에 key값을 전달해 원하는 항목의 값을 꺼냄
		System.out.println(map1.get("견종"));
		
		// 반복문으로 Map활용하기
		// keySet	: 키들로 이루어진 Set을 반환함
		// values	: Value들로 이루어진 Collection을 반환함
		// entrySet	; Entry<K, V>들로 이루어진 set을 반환함
		
		System.out.println("map1의 Key : " + map1.keySet());
		System.out.println("map1의 Value : " + map1.values());
		System.out.println("map1의 entry : " + map1.entrySet());
		
		// keySet으로 반복문
		for (String key : map1.keySet()) {
			System.out.println(key + "-"
					+ "" + map1.get(key));
		}
		// values로 돌리기
		// Key로 value를 찾는것은 쉽지만 value로 key를 찾는 것은 불가능함
		for (String value : map1.values()) {
			System.out.println(value);
		}
		// entrySet으로 돌리기
		for (Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " / " + entry.getValue());
		}
		
		HashMap<String, String> map2 = new HashMap<>(); // 정수타입 키는 배열이랑 다를게없음 굳이 사용할 이유가없음
		map2.put("TEST1", "ABC");
		map2.put("TEST2", "ABCD");
		map2.put("TEST3", "ABCDE");
		
		// containsKey
		System.out.println(map1.containsKey("주인의 나이"));
		// containsValue
		System.out.println(map1.containsValue("5살"));
		
		// putAll로 다른 Map의 데이터를 추가할 수 있음
		map1.putAll(map2);
		System.out.println(map1);
		
		// remove메서드로 원하는 데이터를 지울 수 있음
		// key만 가지고 지우는 경우 : 방금 삭제한 값을 반환함
		// key와 value모두를 가지고 지우는 경우 key와 value의 값이 모두 일치할때 삭제되고 삭제가됫는지 안됫는지 반환함
		System.out.println(map1.remove("나이", "6살"));
		System.out.println(map1);
		System.out.println(map1.remove("나이", "5살"));
		System.out.println(map1);
		
		// get메서드로 데이터나 키가 없는 경우 null이 반환되어 NullPointerException이 발생할 위험이있음
		// getorDefault 메서드를 이용해 null값이 반환되는 상황이라면 기본값을 반환할 수 있음
		System.out.println(map1.getOrDefault("엄마의 이름", "기본값"));
		System.out.println(map1.get("엄마의 견종"));
		
		// Map타입 내부에 Map타입 넣기
		HashMap<String, HashMap<String, String>> phone_book = new HashMap<>();
		
		// 새로운 해쉬맵 인스턴스를 값으로 저장하면, 키값으로 해당 해쉬맵을 꺼낼수 있게 됨
		phone_book.put("학원",new HashMap<>());
		phone_book.put("가족", new HashMap<>());
		phone_book.put("고등학교", new HashMap<>());
		phone_book.put("중학교", new HashMap<>());
		phone_book.put("동아리", new HashMap<>());
		HashMap<String, String> group_map =  phone_book.get("학원");
		
		//키값으로 이름보다는 전화번호같은 값을 사용하는 것이 좋음 (중복값은 키로 사용할 수 없기때문)
		group_map.put("010-1234-1234","김말숙");
		group_map.put("010-5678-5678","김말숙");
		
		System.out.println(phone_book);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
