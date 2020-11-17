import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class D03_LinkedList {
	
	//���Ḯ��Ʈ
	// ArrayList���� ����/������ ������ ����Ʈ
	// �߰��� ������ �Ͼ�� �� ArrayList�� ��� �����͸� �ڷ� �̵����Ѿ���(shift)
	// LinkedList�� ����� ��常 �ٲٸ� �Ǳ� ������ ����
	// ArrayList�� ������ ����, �б⿡ ����
	// LinkedList�� ������ �߰�,���� �� ������ ������
	
	public static void main(String[] args) {
		
		LinkedList<String> mem = new LinkedList<String>();
		
		mem.add("ȸ��1");
		mem.add("ȸ��2");
		mem.add("ȸ��3");
		
		mem.addFirst("�Ǿ�");
		mem.addLast("�ǳ�");
		
		System.out.println(mem.getFirst());
		System.out.println(mem);
		
		//pop() : �Ǿ��� �����͸� �����鼭 ����(FIFO)
		 System.out.println("pop����");
		 for (int i= 0, len=mem.size(); i<len ; i++) {
			System.out.println("��� ���� �� : " + mem.pop());
			System.out.println("after pop : " +mem);
		}
		 
		mem.add("ȸ��1");
		mem.add("ȸ��2");
		mem.add("ȸ��3");
		mem.add("ȸ��4");
		mem.add("ȸ��5");
		
		System.out.println(mem);
		
		//poll() : ù��° ��Ҹ� �����鼭 ���(pop�� �������) // ť
		System.out.println(mem.poll());
		System.out.println(mem);
		
		// pollLast() : ���� �ֱٿ� �߰��� ��Ҹ� ��Ҹ� �����鼭 ���(LIFO) // ����
		System.out.println(mem.pollLast());
		System.out.println(mem);
		
		
		// peek() : ���������� �ʰ� �� ó�� ��� ���
		System.out.println(mem.peek()+mem.peekLast());
		System.out.println(mem);
		
		// �ӵ����� �׽�Ʈ
		ArrayList<Integer> arr_list = new ArrayList<Integer>(10000000);
		
		for (int i = 0; i < 10000000; i++) {
			arr_list.add(i);
		}
		
		LinkedList<Integer> linked_list = new LinkedList<Integer>();
		
		for (int i = 0; i < 10000000; i++) {
			linked_list.add(i);
		}
		
		HashSet<Integer> toAdd = new HashSet<Integer>();
		
		for (int i = 0; i < 20; i++) {
			toAdd.add(i);
		}
		
		// ArrayList�� �߰��� �����͸� �߰��ϴ� ���� ����
		long start = System.currentTimeMillis();
		System.out.println("ArrayList insertion Test ����");
		for (int i = 0; i < 20; i++) {
			arr_list.addAll(10,toAdd);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList End " + (end-start) + "�и���");
		
		// LinkedList�� �߰��� �����͸� �߰��� �� ������
		start = System.currentTimeMillis();
		System.out.println("LinkedList insertion Test ����");
		for (int i = 0; i < 20; i++) {
			linked_list.addAll(10,toAdd);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList End " + (end-start) + "�и���");
		
		// �� �̻� �߰�/������ �Ͼ������ �����͸� ArrayList�� ��ȯ�Ͽ� ����
		List<Integer> to_store = new ArrayList<Integer>(linked_list);
		//���η� �� �����ʹ� ��Ŭ�����ֿܼ��� ����������
		
		start = System.currentTimeMillis();
		System.out.println("ArrayList Reading Test");
		for(int i : to_store) {
			int a = i + 10;
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList End " + (end-start) + "ms");
		
		start = System.currentTimeMillis();
		System.out.println("LinkedList Reading Test");
		for(int i : linked_list) {
			int a = i + 10;
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList End " + (end-start) + "ms");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}