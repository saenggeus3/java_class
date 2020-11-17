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
			name=String.format("�׽�Ʈ�л�%04d", stu_count++);
		}
		
		public void name_total() {
			System.out.printf("%s : %d��\n",this.name,this.total);
		}
		
		@Override
		public String toString() {
		return "�̸� : " + name + "  ���� : " + total;
		}

		//�� ��ä�� ũ��񱳸� �̷������� �ϰ��ٰ� �������̵�
		@Override
		public int compareTo(Student next_student) {
			// ����� ���� : ���� ��ü�� ������ ��ü���� �� ŭ (�ڷ� ������)
			// ������ ���� : ���� ��ü�� ���� ��ü���� �� ���� (������ ������)
			// 0�� ���� : ���� ��ü�� ���� ��ü�� ���� ����
			
			
			if (this.total > next_student.total) {
				//���������� �� ū �л��� �ڿ� ������ �Ѵٴ� ��
				return 1;
			}else if(this.total < next_student.total) {
				return -1;
			}else {
				return 0;
			}
			
		}

}
