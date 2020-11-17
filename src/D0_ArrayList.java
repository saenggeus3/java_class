import java.util.ArrayList;
import java.util.Collections;

public class D0_ArrayList {
	
	// Java collections
	// java���� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
	// collections �������̽��� ������ Ŭ�����δ� List, Set�� ����
	
	// ArrayList
	// �迭�� �ٸ��� ũ�Ⱑ �ڵ����� �����Ǵ� �迭 Ŭ����
	// �迭�� ������ �����̱� ������ ���������� �����Ϳ� ������ �� ���� ������
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		// ArrayList�� add(item) : �����͸� ����Ʈ�� �� �ڿ� ���������� �߰���
		list.add("ȫ�浿");
		list.add("����ġ");
		list.add("�Ӳ���");
		list.add("�����");
		
		//add(index, item) : ���ϴ� ��ġ�� �����͸� �������
		list.add(2, "�̼���");
		
		System.out.println(list);
		
		// ArrayList�� get(index) : �迭ó�� �ε����� �����͸� ���� �� ����
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		// ArrayList�� Ÿ���� ���������� ������ ��� Ÿ���� �� �� �ִ� ArrayList����
		// ���Ÿ���� ����ֱ� ������ ���� �� � Ÿ������ ������ �˱� �������
		// object ��� Ÿ���� �θ�Ÿ��
		// � ���� ���͵� ���� ���� �� ����
		Object name = list.get(2);
		System.out.println(name);
		
		// Ÿ���� ������ ArrayList �����ϱ�
		ArrayList<String> fn_list = new ArrayList<String>();
		// <>�� Ÿ���� �������ָ� ArrayList�� ��� �޼��� Ÿ���� �ٲ�
		// Ÿ���� ������ �� ����ϴ� <>�� ���׸��̶�� �θ�
		fn_list.add("apple");
		fn_list.add("strawberry");
		System.out.println(fn_list);
		
		// size() : ����Ʈ�� ũ�⸦ ��ȯ
		System.out.println(list.size());
		
		// remove(index) : ���ϴ� ��ġ�� ������(���/element)���� ����(�����ϸ鼭 ������ �������� ��ȯ)
		System.out.println("������ ������ ��ȯ : " + list.remove(0));
		// remove(item) : ���ϴ� ���� �ϳ��� ����
		
		fn_list.add(0, "apple");
		fn_list.add("apple");
		fn_list.add("apple");
		fn_list.add("apple");
		
		System.out.println(fn_list.remove("apple"));
		System.out.println(fn_list);
		
		int count = 0;
		while(fn_list.remove("apple")) {
			System.out.println("����� �����Ǿ����ϴ�."+count++);
		}
		System.out.println("���� �Ϸ�");
		
		// ArrayList�� �ݺ����� �Բ� ����ϸ� ��������
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// ����Ʈ�� forEach�� ����� �� ����
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
		
		// �÷����� Collections�� ����� ����� �� ����
		Collections.addAll(fn_list, "apple", "apple"); // T = String    T... �� �������Ѿ��� ��밡���ϴ��ǹ�
		System.out.println(fn_list);
		System.out.println("apple�� ����Ƚ�� : "
				+ Collections.frequency(fn_list,"apple"));
		
		//�÷��� �ִ�/�ּҰ� ���ϱ�
		System.out.println(Collections.max(fn_list));
		System.out.println(Collections.min(fn_list));
		
		//������� ���� - sort(Collection)
		Collections.sort(fn_list);
		System.out.println(fn_list);
		
		//�Ųٷ� ���� - reverse(Collection)
		Collections.reverse(fn_list);
		System.out.println(fn_list);
		
		//�� ����� ��ġ�� ��ü - swap (Collection, i , j)
		Collections.swap(fn_list, 0, fn_list.size()-1);
		System.out.println(fn_list);
		
		for (int i = 0; i < 5; i++) {
			Collections.rotate(fn_list, -1);
			System.out.println("rotate" + i + " : " + fn_list);
		}
		
		
		Collections.shuffle(fn_list);
		System.out.println("shuffled : "+fn_list);
		
		// ���ϴ� ������ �÷��� �ʱ�ȭ
		Collections.fill(fn_list, "banana");
		System.out.println(fn_list);
		
		
		
		
		
	}
	
	
}
