import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.fruit.Mango;

public class D05_TreeSet {
	
	// TreeSet
	// �ߺ����� �����Ҽ�����
	// �����͸� ������ �� ������������ ������
	// ��ҷ� null�� ������� ����
	// ����ӵ��� ������� ������ ����/�˻� �ӵ��� ����
	// �ߺ����� + ���ϴ� ������ �κ����� ���� + ũ������
	
	public static void main(String[] args) {
		
		TreeSet<Mango> mango_tree = new TreeSet<>(new Comparator<Mango>() { // �͸� comparator���

			@Override
			public int compare(Mango o1, Mango o2) {
				// ���� �絵�� ���� ���� ��� ����� (Set)
				//���� �絵�� ���������� ����id�������� ����
				int sweet_value = o1.sweet - o2.sweet;
				// hashCode() �ش� ��ü�� �����ϰ� �����ϴ� �� (int id�� �����ϴ°Ͱ� ����ȿ��)
				return sweet_value == 0?
						o1.hashCode() - o2.hashCode() : sweet_value;
				
			}
		});
		
		for (int i = 0; i < 10; i++) {
			mango_tree.add(new Mango());
		}
		System.out.println(mango_tree.toString());
		System.out.println(mango_tree.size());
		
		// Comparable���� return 0�� ���� ��ü���� �ǹ��ϰ� Set�� ���� ��������
		// �ؽ��ڵ������ �����Ͽ� ���� �� ����
		TreeSet<Mango> basic_comp_tree = new TreeSet<>(); // MangoŬ�������� �������̵��� comparator ���
		
		for (int i = 0; i < 100; i++) {
			basic_comp_tree.add(new Mango());
		}
		System.out.println(basic_comp_tree.toString());
		System.out.println(basic_comp_tree.size());
		
		// TreeSet Ȱ��
		
		// descendingSet() : ������������ ���ĵ� Set�� ��ȯ
		System.out.println(basic_comp_tree.descendingSet());
		
		// HeadSet(toElement) : �� �պ��� ���ϴ� ��ġ���� Set�� ��ȯ
		Set<Mango> hSet = basic_comp_tree.headSet(new Mango(250,5,5));
		System.out.println(hSet.size());
		
		// tailSet(fromElement) : ���ϴ� ���غ��� �� ������������ Set�� ��ȯ
		Set<Mango> tSet = basic_comp_tree.tailSet(new Mango(500,5,500));
		System.out.println(tSet.size());
		
		// subSet(from, to) : ���ϴ� ���غ��� ���ϴ� ���ر����� Set�� ��ȯ
		SortedSet<Mango> result = mango_tree.subSet(new Mango(0, 7, 1000),new Mango(0, 9, 1000));
		System.out.println(result);
		
		// TreeSet��Ҹ� �ϳ��� �����ϱ�
		TreeSet<Integer> int_tree = new TreeSet<Integer>();
		
		int_tree.add(99);
		int_tree.add(1);
		int_tree.add(75);
		int_tree.add(3);
		int_tree.add(40);
		int_tree.add(11);
		
		// floor, ceiling
		//�ش� �� �������� ���� ����� ����/�������� �ϳ� ��ȯ
		//���� ���� �ִٸ� �ش� ���� ��ȯ�Ѵ�
		System.out.println(int_tree.ceiling(12));
		System.out.println(int_tree.floor(12));
		
		// lower, higher
		//�ش� �� �������� ���� ����� ����/�������� �ϳ� ��ȯ
		//������ ���� ���� ���� ������
		System.out.println(int_tree.higher(12));
		System.out.println(int_tree.floor(12));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
