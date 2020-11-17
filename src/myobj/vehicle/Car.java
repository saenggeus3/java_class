package myobj.vehicle;

public class Car {
	
	public int size;
	public int speed;
	public int max_speed = 120;
	public int weight;
	public String color;
	
	public Car() {
		this(100,150);
	}
	
	public Car(int size , int max_speed) {
		this.size = size;
		this.max_speed = max_speed;
	}
	
	public Car(int max_speed) {
		this.max_speed = max_speed;
	}
	
	public void accel(int s) {
		if(speed+s>max_speed) {
			speed=max_speed;
			return;
		}
		speed+=s;
	}
	public void decel(int s) {
		if(speed-s<0) {
			braking();
			return;
		}
		speed-=s;
	}
	public void braking() {
		speed=0;
	}
	

}
