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
		
		// 객체배열내부 요소들을 비교하여 객체를 정렬      매개변수 Comparator<객체>() 의 값을 양수,음수,0 으로 받아 정렬함
		//Collections.sort(stuList); //Comparable 인터페이스를 상속받아 compareTo메서드를 오버라이딩
		//Collections.sort(stuList, new StudentComparatorA()); // 새로운 comparator 클래스를 생성해서 적용
		Collections.sort(stuList, new Comparator<Student>() { // 익명 comparator를 구현해서 적용
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
