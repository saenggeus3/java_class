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
	
	//�л�Ŭ������ ��ҷ� ���� ArrayList group�� �����ϰ�
	// �л��� 30�� �߰�
	
	// 30���� ������ �ڵ����� �����ǵ��� ��������
	
	// ��� �л��� �� ������ ��������� ���غ�����
	
	// ������� ���غ�����
	
	// �л��̸��� �׽�Ʈ�л�0000...
	
	public static void main(String[] args) {
		
		ArrayList<Student> group = new ArrayList<Student>();
		for (int i = 0; i < 30; i++) {
			group.add(new Student());
			System.out.print(group.get(i).name+"  \t");
			System.out.print("���� : " + group.get(i).total+" \t");
			System.out.println("��� : " + group.get(i).avg);
		}
		
		// println �Լ��� �ش� ��ü�� toString() �޼��带 ȣ����
		System.out.println("�� ��� : " + group_avg(group));
		
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
		name=String.format("�׽�Ʈ�л�%04d", stu_count++);
	}
	
	// toString()�� Object Ŭ������ �޼����̱� ������ ��簴ü�� ����������
	@Override
	public String toString() {
		//�� ��ü�� ���ڿ��� ǥ���Ѵٸ� �����ϱ�? �� ���� ���Ǹ� �ϴ� �޼���
		
		//String.formar()
		// printfó�� ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϴ� �޼���
		// Ŭ�����ڿ�.�� ��� ����ϴ� �Լ��� ����ƽ
		return String.format("[%s/%d/%.2f]", name, total, avg);
		
	}
	
	
}


