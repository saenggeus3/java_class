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
	 * 비교대상 망고를 생성하는 생성자
	 */
	public Mango(int calorie, int sweet, int id) {
		this.calorie = calorie;
		this.sweet = sweet;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		// 이 객체를 유일하게 구분하려면 어떻게 해야하는지를 구분하는 함수
		// (기본 동작은 해당 인스턴스의 주소값을 해쉬값으로 사용)
		return super.hashCode();
	}

	
	public void print_mango() {
		System.out.printf("칼로리:%d 당도:%d\n",calorie,sweet);
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
