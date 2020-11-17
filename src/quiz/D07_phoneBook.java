package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class D07_phoneBook {
	
	// HashMap을 이용한 phoneBook을 구현해보세요
	
	// 그룹 / 전화번호 / 이름을 저장해야함
	// 그룹 이름을 키값으로 넣으면 해당그룹의 전화번호 목록이 나옴
	// 전화번호 목록에 전화번호를 키로 넣으면 이름이 나옴
	
	HashMap<String, HashMap<String, String>> phone_book;
	
	public D07_phoneBook() {
		 phone_book = new HashMap<>();
	}
	
	
	
	public Boolean addgroup(String group) {
		// 새로운 그룹을 추가하는 메서드
		
		if (phone_book.containsKey(group)) {
			System.err.println("이미 존재하는 그룹명입니다.");
			return false;
		}else {
			phone_book.put(group, new HashMap<String, String>());
			return true;
		}
		
//		for (Entry<String, HashMap<String, String>> tmp : phone_book.entrySet()) {
//			if (tmp.getKey().equals(group)) {
//				return;
//			}
//		}
//		phone_book.put(group, new HashMap<String, String>());
		
		
	}
	
	public void addnumber(String group , String name , String number) {
		// 존재하는 그룹에 새로운 전화번호를 등록하는 메서드
		for (Entry<String, HashMap<String, String>> tmp : phone_book.entrySet()) {
			if (tmp.getKey().equals(group)) {
				phone_book.get(group).put(number, name);
				return;
			}
		}
		addgroup(group);
		addnumber(group, name, number);
	}
	
	public void show_phone_book() {
		// 등록된 모든 전화번호를 보기좋게 출력하는 메서드
//		for (Entry<String, HashMap<String, String>> map : phone_book.entrySet()) {
//			System.out.println(map.getKey());
//			System.out.println(map.getValue());
//		}
		
		for(Entry<String, HashMap<String, String>> tmp : phone_book.entrySet()) {
			System.out.println(tmp.getKey());
			for (Entry<String, String> tmpvalue : tmp.getValue().entrySet()) {
				System.out.println("  " + tmpvalue.getValue() + " " + tmpvalue.getKey());
			}
			System.out.println();
		}
		
	}
	
	public void serch_name(String name) {
		// 이름의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
		System.out.println("입력한 이름 : "+ name);
		for(Entry<String, HashMap<String, String>> tmp : phone_book.entrySet()) {
			for (Entry<String, String> tmpvalue : tmp.getValue().entrySet()) {
				if (tmpvalue.getValue().contains(name)) {
					System.out.println(tmpvalue.getValue() + " " + tmpvalue.getKey());
				}
			}
		}
	}
	
	public void serch_number(String number) {
		// 전화번호의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
		System.out.println("입력한 번호 : "+ number);
		for(Entry<String, HashMap<String, String>> tmp : phone_book.entrySet()) {
			for (Entry<String, String> tmpvalue : tmp.getValue().entrySet()) {
				if (tmpvalue.getKey().contains(number)) {
					System.out.println(tmpvalue.getValue() + " " + tmpvalue.getKey());
				}
			}
		}
	}
	
	public Set<List<String>> serchByphoneNumber(String phone_frag){
		Set<List<String>> to_return = new HashSet<>();
		
		for (HashMap<String, String> groupMap : phone_book.values()) {
			
			for (String phoneNumber : groupMap.keySet()) {
				if (phoneNumber.contains(phone_frag)) {
					List<String> found = new ArrayList<>();
					found.add(groupMap.get(phoneNumber));
					found.add(phoneNumber);
					to_return.add(found);
				}
			}
		}
		
		return to_return;
	}
	
	
	
	public static void main(String[] args) {
		
		D07_phoneBook phoneBook = new D07_phoneBook();
		
		phoneBook.addgroup("학원");
		phoneBook.addgroup("학교");
		phoneBook.addgroup("가족");
		phoneBook.addnumber("학원", "김말숙", "01012341234");
		phoneBook.addnumber("학원", "김말숙", "01045671234");
		phoneBook.addnumber("학교", "홍길동", "01011111111");
		phoneBook.addnumber("가족", "김길동", "01022222222");
		
		
		phoneBook.addgroup("학원");
		phoneBook.show_phone_book();
		phoneBook.serch_name("김길");
		System.out.println();
		phoneBook.serch_number("1111");
		System.out.println();
		System.out.println(phoneBook.serchByphoneNumber("1111"));
	}
	
	
	
}
