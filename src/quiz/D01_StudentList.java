package quiz;

import java.util.ArrayList;
import java.util.Collections;

public class D01_StudentList {
	
	public static double group_avg(ArrayList<Student> group) {
		double group_avg=0;
		for (int i = 0; i < group.size(); i++) {
			group_avg+=group.get(i).avg;
		}
		return Math.round((group_avg/(double)group.size()*100))/100.0;
	}
	
	//학생클래스를 요소로 갖는 ArrayList group을 생성하고
	// 학생을 30명 추가
	
	// 30명의 점수가 자동으로 설정되도록 만들어보세요
	
	// 모든 학생의 총 점수와 평균점수를 구해보세요
	
	// 반평균을 구해보세요
	
	// 학생이름은 테스트학생0000...
	
	public static void main(String[] args) {
		
		ArrayList<Student> group = new ArrayList<Student>();
		for (int i = 0; i < 30; i++) {
			group.add(new Student());
			System.out.print(group.get(i).name+"  \t");
			System.out.print("총점 : " + group.get(i).total+" \t");
			System.out.println("평균 : " + group.get(i).avg);
		}
		
		// println 함수는 해당 객체의 toString() 메서드를 호출함
		System.out.println("반 평균 : " + group_avg(group));
		
	}
	
	
}

class Student{
	int kor, eng, math;
	String name;
	double avg;
	int total;
	
	static int stu_count = 0;
	
	public Student() {
		kor=(int)(Math.random()*101);
		eng=(int)(Math.random()*101);
		math=(int)(Math.random()*101);
		total = kor+eng+math;
		avg = Math.round((total/3.0)*100)/100.0;
		name=String.format("테스트학생%04d", stu_count++);
	}
	
	// toString()은 Object 클래스의 메서드이기 때문에 모든객체가 가지고있음
	@Override
	public String toString() {
		//이 객체를 문자열로 표현한다면 무엇일까? 에 대한 정의를 하는 메서드
		
		//String.formar()
		// printf처럼 서식을 이용하여 원하는 문자열을 생성하는 메서드
		// 클래스뒤에.을 찍고 사용하는 함수는 스테틱
		return String.format("[%s/%d/%.2f]", name, total, avg);
		
	}
	
	
}


