package myobj.fruit;

public class Mango implements Comparable<Mango>{
	
	public int size;
	public int sweet;
	public int calorie;
	public int id;
	
	private static int mango_id = 0;
	
	public Mango() {
		size = (int)(Math.random()*100)+1;
		sweet = (int)(Math.random()*10)+1;
		calorie = (int)(Math.random()*100)+200;
		id = mango_id++;
	}
	
	/** 
	 * �񱳴�� ���� �����ϴ� ������
	 */
	public Mango(int calorie, int sweet, int id) {
		this.calorie = calorie;
		this.sweet = sweet;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		// �� ��ü�� �����ϰ� �����Ϸ��� ��� �ؾ��ϴ����� �����ϴ� �Լ�
		// (�⺻ ������ �ش� �ν��Ͻ��� �ּҰ��� �ؽ������� ���)
		return super.hashCode();
	}

	
	public void print_mango() {
		System.out.printf("Į�θ�:%d �絵:%d\n",calorie,sweet);
	}

	@Override
	public String toString() {
		return String.format("%04X: %d/%d\n",id, calorie, sweet);
	}
	
	@Override
	public int compareTo(Mango next_mango) {
		if (this.sweet > next_mango.sweet) {
			return 1;
		}else if(this.sweet < next_mango.sweet) {
			return -1;
		}else if(this.calorie > next_mango.calorie) {
			return 1;
		}else if(this.calorie < next_mango.calorie) {
			return -1;
		}else {
			return 0;
		}
	}
	
	

}
