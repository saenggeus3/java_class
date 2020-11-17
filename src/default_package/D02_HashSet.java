package default_package;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {
	
	//Set
	// ������ ������ ���� Ŭ����
	// ��ҷ� ���� ���� ������ ���� ������� �ʴ´�
	
	//Hash
	// � ���� �־��� �� ���� ������ �� ���� ���� �����Ǿ�� �ϴ� �˰���
	// ������ �� ���� ���� �̿��ϹǷ� ������ �Ұ�����
	// ������ ������ ���� ���� ã�� ���� �Ұ��ɿ� �����
	// �ٽ� ���������� ���ư� �� ���� �ܹ��⼺ �˰���
	// �ӵ��� ������ ���ȼ��� �پ �˰���
	
	public static void main(String[] args) {
		
		HashSet<Integer> even = new HashSet<Integer>();
		
		//Set���� �Ȱ��� �����͸� ���� �� �� ����
		even.add(10);
		even.add(10);
		even.add(20);
		even.add(20);
		even.add(30);
		even.add(30);
		even.add(40);
		
		// Hash�� �̿��ϴ�Ŭ������ ���� ������� ������������
		System.out.println(even);
		// HashSet�� index�� ���� ������ �ϳ��� �������� ����
		
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
		
		//�ٸ������� �÷����� Set���� �ս��� ������ �� ����
		//�ߺ��� ���ŵǴ� ȿ���� ����
		Set<String> animal_set = new HashSet<String>(animal_list);
		System.out.println(animal_set);
			
		Object[] animal_arr = animal_list.toArray();
		String first_animal = (String)animal_arr[0];
		System.out.println(first_animal);
		
		String[] animalArr = new String[animal_set.size()];
		animal_set.toArray(animalArr);
		String firstAnimal = animalArr[0];
		System.out.println(firstAnimal);
		
		// contains : �÷��ǿ� �ش� ��Ұ� �ִ��� ���θ� ��ȯ
		System.out.println(animal_list.contains("lion"));
		System.out.println(animal_set.contains("lion"));
		
		// size : �÷��� ũ�� ��ȯ
		System.out.println(animal_set.size());
		
		// remove : �÷��� ��� ���� (���������� true��ȯ)
		System.out.println(animal_set.remove("lion"));
				
		// �ٸ� �÷����� �̿��ϴ� �޼����
		Set<Character> alphabets01 = new HashSet<Character>();
		Set<Character> alphabets02 = new HashSet<Character>();
		
		Collections.addAll(alphabets01, 'A','B','C','D','E');
		Collections.addAll(alphabets02, 'D','E','F','G','H');
	
		System.out.println(alphabets01);
		System.out.println(alphabets02);
		
		// addAll(collection) : �ٸ� �÷����� ��� ���� �߰���
		List<Character> alpha_all = new ArrayList<>();
		alpha_all.addAll(alphabets01);
		alpha_all.addAll(alphabets02);
		 System.out.println(alpha_all);
		 
		 // remavoAll(collection) �ٸ� �÷��ǰ� ��ġ�ϴ� ��� ���� ������
		 Set<Character> to_remove = new HashSet<Character>();
		 Collections.addAll(to_remove,'A','D');
		 
		 alpha_all.removeAll(to_remove);
		 System.out.println(alpha_all);
		 
		 // retainAll(collection) ������ �÷��ǰ� ��ġ�ϴ� ���� ������
		 ArrayList<Character> to_retain = new ArrayList<Character>();
		 
		 to_retain.add('E');
		 to_retain.add('G');
		 
		 alpha_all.retainAll(to_retain);
		 System.out.println(alpha_all);
		 
		 // containsALL(collecction) : ������ �÷����� ��� ��Ұ� ���ԵǾ� �ִ��� Ȯ���Ѵ�
		 Collections.addAll(alpha_all,'A','B','C','D');
		 
		 Set<Character> must_contain = new HashSet<Character>();
		 
		 must_contain.add('A');
		 must_contain.add('B');
		 must_contain.add('C');
		 must_contain.add('D');
		 //alpha_all�� must_contain�� ��� ���ԵǾ��ִ��� Ȯ��
		 System.out.println(alpha_all.containsAll(must_contain));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
