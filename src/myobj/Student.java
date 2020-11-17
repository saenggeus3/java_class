package myobj;

public class Student implements Comparable<Student>{
	
		public int kor, eng, math;
		public String name;
		public double avg;
		public int total;
		
		int stu_count = 0;
		
		public Student() {
			kor=(int)(Math.random()*101);
			eng=(int)(Math.random()*101);
			math=(int)(Math.random()*101);
			total = kor+eng+math;
			avg = Math.round((total/3.0)*100)/100.0;
			name=String.format("테스트학생%04d", stu_count++);
		}
		
		public void name_total() {
			System.out.printf("%s : %d점\n",this.name,this.total);
		}
		
		@Override
		public String toString() {
		return "이름 : " + name + "  총합 : " + total;
		}

		//이 객채는 크기비교를 이런식으로 하갯다고 오버라이드
		@Override
		public int compareTo(Student next_student) {
			// 양수를 리턴 : 현재 객체가 다음는 객체보다 더 큼 (뒤로 가야함)
			// 음수를 리턴 : 현재 객체가 다음 객체보다 더 작음 (앞으로 가야함)
			// 0을 리턴 : 현재 객체와 다음 객체의 킉가 같음
			
			
			if (this.total > next_student.total) {
				//수학점수가 더 큰 학생이 뒤에 나오게 한다는 뜼
				return 1;
			}else if(this.total < next_student.total) {
				return -1;
			}else {
				return 0;
			}
			
		}

}
