package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import myobj.fruit.Mango;

public class D04_MaxMango {

	//������ Į�θ��� �������� �����Ǵ� ����Ŭ������ ����
	//�鰳�� ���� �ν��Ͻ��� ���� Į�θ��� ���� ���� ����
	//Į�θ��� ������� �� ���� �絵�� ���� �ν��Ͻ��� ����
	
	public static void main(String[] args) {
		
		Mango mango = new Mango();
		
		List<Mango> mango_list = new ArrayList<Mango>();
		
		for (int i = 0; i < 10; i++) {
			mango_list.add(new Mango());
			mango_list.get(i).print_mango();
		}
		
		System.out.println("�������Į�θ� : " + Collections.max(mango_list).calorie);
		
		
	}
	
}
