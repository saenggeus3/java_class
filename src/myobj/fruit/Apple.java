package myobj.fruit;

public class Apple {
	
	public int size;
	public int sweet;
	public int calorie;
	public int damage;
	public String color;
	public String birthday;
	
	public Apple(String color) {
		calorie = 300;
		if (!color.equals("red")) {
			throw new InvalidcolorException();
		}
	}
	
	public Apple eat() throws NoMoreCalorieException{
		
		try {
			if (calorie <= 0) {
				throw new NoMoreCalorieException();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());	
			return this;
		}
		
		System.out.println("ÇÑÀÔ");
		this.calorie -= 100;
		return this;
	}
	
	public static void main(String[] args) {
		try {
			new Apple("blue").eat().eat().eat().eat();
		} catch (NoMoreCalorieException e) {
			e.printStackTrace();
		}
	}

}
