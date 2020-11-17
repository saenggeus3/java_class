import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class D03_LinkedList {
	
	//연결리스트
	// ArrayList보다 삽입/삭제에 유리한 리스트
	// 중간에 삽입이 일어났을 때 ArrayList는 모든 데이터를 뒤로 이동시켜야함(shift)
	// LinkedList는 연결된 노드만 바꾸면 되기 때문에 빠름
	// ArrayList는 데이터 보관, 읽기에 유리
	// LinkedList는 데이터 추가,생성 및 삭제에 유리함
	
	public static void main(String[] args) {
		
		LinkedList<String> mem = new LinkedList<String>();
		
		mem.add("회원1");
		mem.add("회원2");
		mem.add("회원3");
		
		mem.addFirst("맨앞");
		mem.addLast("맨끝");
		
		System.out.println(mem.getFirst());
		System.out.println(mem);
		
		//pop() : 맨앞의 데이터를 꺼내면서 삭제(FIFO)
		 System.out.println("pop시작");
		 for (int i= 0, len=mem.size(); i<len ; i++) {
			System.out.println("방금 꺼낸 값 : " + mem.pop());
			System.out.println("after pop : " +mem);
		}
		 
		mem.add("회원1");
		mem.add("회원2");
		mem.add("회원3");
		mem.add("회원4");
		mem.add("회원5");
		
		System.out.println(mem);
		
		//poll() : 첫번째 요소를 꺼내면서 사용(pop과 같은기능) // 큐
		System.out.println(mem.poll());
		System.out.println(mem);
		
		// pollLast() : 가장 최근에 추가한 요소를 요소를 꺼내면서 사용(LIFO) // 스택
		System.out.println(mem.pollLast());
		System.out.println(mem);
		
		
		// peek() : 삭제는하지 않고 맨 처음 요소 사용
		System.out.println(mem.peek()+mem.peekLast());
		System.out.println(mem);
		
		// 속도차이 테스트
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
		
		// ArrayList는 중간에 데이터를 추가하는 것이 느림
		long start = System.currentTimeMillis();
		System.out.println("ArrayList insertion Test 시작");
		for (int i = 0; i < 20; i++) {
			arr_list.addAll(10,toAdd);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList End " + (end-start) + "밀리초");
		
		// LinkedList는 중간에 데이터를 추가할 때 유리함
		start = System.currentTimeMillis();
		System.out.println("LinkedList insertion Test 시작");
		for (int i = 0; i < 20; i++) {
			linked_list.addAll(10,toAdd);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList End " + (end-start) + "밀리초");
		
		// 더 이상 추가/삭제가 일어나지않을 데이터를 ArrayList로 변환하여 보관
		List<Integer> to_store = new ArrayList<Integer>(linked_list);
		//가로로 긴 데이터는 이클립스콘솔에서 오류가생김
		
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
