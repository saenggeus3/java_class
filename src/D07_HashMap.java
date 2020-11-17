import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class D07_HashMap {
	
	// Map
	// key/value�� �� ��Ʈ�� �̷�� �ڷᱸ��
	// key���� ���� value�� ã�� �ڷᱸ��
	// key�� �ߺ��� ������� ����
	
	public static void main(String[] args) {
		// map�� key/Value ���� �̷�� ������ ���׸��� �� �� ����
		Map<String, String> map1 = new HashMap<>();
		
		
		// put�޼��带 �̿��� �����͸� �����Ѵ�
		// key�� �ش� �������� ī�װ�(�Ӽ�, property, attribute)�� �ǹ���
		// Value�� �ش� �׸��� ���� ������
		map1.put("�̸�", "������");
		map1.put("����", "5��");
		map1.put("����", "���޶�Ͼ�");
		map1.put("����", "ġ�Ϳ�"); // ���� key�� �̿��ϸ� ���� ������
		map1.put("������ ����", "5��");
		
		// get �޼��忡 key���� ������ ���ϴ� �׸��� ���� ����
		System.out.println(map1.get("����"));
		
		// �ݺ������� MapȰ���ϱ�
		// keySet	: Ű��� �̷���� Set�� ��ȯ��
		// values	: Value��� �̷���� Collection�� ��ȯ��
		// entrySet	; Entry<K, V>��� �̷���� set�� ��ȯ��
		
		System.out.println("map1�� Key : " + map1.keySet());
		System.out.println("map1�� Value : " + map1.values());
		System.out.println("map1�� entry : " + map1.entrySet());
		
		// keySet���� �ݺ���
		for (String key : map1.keySet()) {
			System.out.println(key + "-"
					+ "" + map1.get(key));
		}
		// values�� ������
		// Key�� value�� ã�°��� ������ value�� key�� ã�� ���� �Ұ�����
		for (String value : map1.values()) {
			System.out.println(value);
		}
		// entrySet���� ������
		for (Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " / " + entry.getValue());
		}
		
		HashMap<String, String> map2 = new HashMap<>(); // ����Ÿ�� Ű�� �迭�̶� �ٸ��Ծ��� ���� ����� ����������
		map2.put("TEST1", "ABC");
		map2.put("TEST2", "ABCD");
		map2.put("TEST3", "ABCDE");
		
		// containsKey
		System.out.println(map1.containsKey("������ ����"));
		// containsValue
		System.out.println(map1.containsValue("5��"));
		
		// putAll�� �ٸ� Map�� �����͸� �߰��� �� ����
		map1.putAll(map2);
		System.out.println(map1);
		
		// remove�޼���� ���ϴ� �����͸� ���� �� ����
		// key�� ������ ����� ��� : ��� ������ ���� ��ȯ��
		// key�� value��θ� ������ ����� ��� key�� value�� ���� ��� ��ġ�Ҷ� �����ǰ� �������̴��� �ȵ̴��� ��ȯ��
		System.out.println(map1.remove("����", "6��"));
		System.out.println(map1);
		System.out.println(map1.remove("����", "5��"));
		System.out.println(map1);
		
		// get�޼���� �����ͳ� Ű�� ���� ��� null�� ��ȯ�Ǿ� NullPointerException�� �߻��� ����������
		// getorDefault �޼��带 �̿��� null���� ��ȯ�Ǵ� ��Ȳ�̶�� �⺻���� ��ȯ�� �� ����
		System.out.println(map1.getOrDefault("������ �̸�", "�⺻��"));
		System.out.println(map1.get("������ ����"));
		
		// MapŸ�� ���ο� MapŸ�� �ֱ�
		HashMap<String, HashMap<String, String>> phone_book = new HashMap<>();
		
		// ���ο� �ؽ��� �ν��Ͻ��� ������ �����ϸ�, Ű������ �ش� �ؽ����� ������ �ְ� ��
		phone_book.put("�п�",new HashMap<>());
		phone_book.put("����", new HashMap<>());
		phone_book.put("����б�", new HashMap<>());
		phone_book.put("���б�", new HashMap<>());
		phone_book.put("���Ƹ�", new HashMap<>());
		HashMap<String, String> group_map =  phone_book.get("�п�");
		
		//Ű������ �̸����ٴ� ��ȭ��ȣ���� ���� ����ϴ� ���� ���� (�ߺ����� Ű�� ����� �� ���⶧��)
		group_map.put("010-1234-1234","�踻��");
		group_map.put("010-5678-5678","�踻��");
		
		System.out.println(phone_book);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
