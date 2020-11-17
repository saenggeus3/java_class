package myobj;

import java.util.Comparator;

/**
 * 
 * Compare Student class by total score
 *
 */

public class StudentComparatorA implements Comparator<Student> {

	@Override
	public int compare(Student this_student, Student next_student) {
		if (this_student.avg < next_student.avg) {
			return 1;
		}else if(this_student.avg > next_student.avg) {
			return -1;
		}else {
			return 0;
		}
	}

}
