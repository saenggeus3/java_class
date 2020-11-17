package default_package;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import myobj.Student;
import myobj.StudentComparatorA;


public class D03_compar {
	
	public static void main(String[] args) {
		
		Student stu01 = new Student();
		List<Student> stuList = new ArrayList<Student>();
		
		stuList.add(new Student());
		stuList.add(new Student());
		stuList.add(new Student());
		stuList.add(new Student());
		
		// ��ü�迭���� ��ҵ��� ���Ͽ� ��ü�� ����      �Ű����� Comparator<��ü>() �� ���� ���,����,0 ���� �޾� ������
		//Collections.sort(stuList); //Comparable �������̽��� ��ӹ޾� compareTo�޼��带 �������̵�
		//Collections.sort(stuList, new StudentComparatorA()); // ���ο� comparator Ŭ������ �����ؼ� ����
		Collections.sort(stuList, new Comparator<Student>() { // �͸� comparator�� �����ؼ� ����
			@Override
			public int compare(Student o1, Student o2) {
				return (int)Math.ceil(o1.avg - o2.avg);
			}

		});
		
		for (int i = 0; i < stuList.size(); i++) {
			stuList.get(i).name_total();
			System.out.println(stuList.get(i).toString());
		}
		
		 
	}

}
