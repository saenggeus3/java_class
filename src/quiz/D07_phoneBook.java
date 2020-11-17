package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class D07_phoneBook {
	
	// HashMap�� �̿��� phoneBook�� �����غ�����
	
	// �׷� / ��ȭ��ȣ / �̸��� �����ؾ���
	// �׷� �̸��� Ű������ ������ �ش�׷��� ��ȭ��ȣ ����� ����
	// ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű�� ������ �̸��� ����
	
	HashMap<String, HashMap<String, String>> phone_book;
	
	public D07_phoneBook() {
		 phone_book = new HashMap<>();
	}
	
	
	
	public Boolean addgroup(String group) {
		// ���ο� �׷��� �߰��ϴ� �޼���
		
		if (phone_book.containsKey(group)) {
			System.err.println("�̹� �����ϴ� �׷���Դϴ�.");
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
		// �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
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
		// ��ϵ� ��� ��ȭ��ȣ�� �������� ����ϴ� �޼���
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
		// �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
		System.out.println("�Է��� �̸� : "+ name);
		for(Entry<String, HashMap<String, String>> tmp : phone_book.entrySet()) {
			for (Entry<String, String> tmpvalue : tmp.getValue().entrySet()) {
				if (tmpvalue.getValue().contains(name)) {
					System.out.println(tmpvalue.getValue() + " " + tmpvalue.getKey());
				}
			}
		}
	}
	
	public void serch_number(String number) {
		// ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
		System.out.println("�Է��� ��ȣ : "+ number);
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
		
		phoneBook.addgroup("�п�");
		phoneBook.addgroup("�б�");
		phoneBook.addgroup("����");
		phoneBook.addnumber("�п�", "�踻��", "01012341234");
		phoneBook.addnumber("�п�", "�踻��", "01045671234");
		phoneBook.addnumber("�б�", "ȫ�浿", "01011111111");
		phoneBook.addnumber("����", "��浿", "01022222222");
		
		
		phoneBook.addgroup("�п�");
		phoneBook.show_phone_book();
		phoneBook.serch_name("���");
		System.out.println();
		phoneBook.serch_number("1111");
		System.out.println();
		System.out.println(phoneBook.serchByphoneNumber("1111"));
	}
	
	
	
}
