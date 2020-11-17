
public class C05_extends {
	
	// 클래스 상속
	// 미리 만들어둔 클래스를 그대로 물려받아서 사용하는 것
	// 상속해주는 클래스를 부모클래스 또는 super 클래스라고 함
	// 상속받는 클래스를 자식 클래스 또는 sub클래스 라고 함
	// 자식 클래스는 부모 클래스가 가진 모든 기능을 그대로 물려받음
	// 자식 클래스는 부모에게 물려받은 기능을 마음대로 수정해서 쓸 수 있음 (오버라이드 override)
	// 자식 클래스는 부모에게 없던 기능을 마음대로 추가해서 쓸 수 있음
	
	public static void main(String[] args) {
		Person minsu = new Person("민수",10);
		
		minsu.sayHi();
		
		Police p1= new Police();
		Doctor d1 = new Doctor();
		Dentist de1 = new Dentist();
		
		p1.sayHi();
		d1.sayHi();
		
		//객체의 다형성
		// 김경찰씨는 경찰이기도 하지만 사람이기도함
		// Person을 요구하는 자리에 Police가 들어갈 수 있음
		// 요구하는 타입에 해당타입을 부모로받은 타입이 들어갈 수 있음
		
		de1.scaling(minsu);
		de1.scaling(p1);
		
		// Police는 부모인 Person의 모든 정보를 가지고 있기 때문에
		// 아무 문제없이 Person타입이 될수 있음 (업캐스팅)
		// 부모타입으로 올라가는 업캐스팅은 아무 문제가 없음
		
		// Person은 자식인 Police에 모르는 기능이 존재할 수 있기 때문에
		// 자식타입이 될 수 없음 (다운캐스팅)
		// 다운캐스팅은 특별한 경우를 제외하고는 불가능
		Person person01 = new Police();
		Person person02 = new Dentist();
		// Police police02 = new Person();
		
		// 원래 Police였던 인스턴스는 다시 Police로 다운캐스팅 될 수 있음
		Police police = (Police)person01;
		//Police police2 = (Police)person02; Dentist는 police타입으로 변환될수 없음
		
		
	}

}


class Person{
	String name;
	int age;
	
	public Person() {
		this("default name",0);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void sayHi() {
		System.out.printf("안녕 내이름은 %s이고, 나이는 %d살 이야.\n",name,age);
	}
	
	
}


class Police extends Person{
	// 상속받은 객체는 생성자에서 부모의 생성자를 가장먼저 호출해야 함
	// 부모의 생성자가 매개변수를 요구하는 생성자밖에 없는경우
	// 반드시 값을 채워서 부모의 생성자를 호출해야 함
	
	String name;
	
	public Police() {
		super("김경찰",25);
		
		//this() : 현재 인스턴스의 현재 클래스 생성자
		//super() : 현재 인스턴스의 부모 클래스 생성자
		
		System.out.println(super.name);
		System.out.println(this.name);
	}
	
	
}


class Doctor extends Person{
	// 부모의 기본생성자가 있는 부모 클래스를 상속받는 경우 자동으로 부모의 기본생성자를 호출함
	
	// Person클래스의 sayHi()를 고쳐서 사용함
	// 원래의 sayHi()를 사용하고 싶다면 super.sayHi()를 사용할 수 있음
	@Override
	public void sayHi() {
		System.out.printf("안녕하세요. 닥터 %s입니다.\n",name);
	}
}

class Dentist extends Doctor{
	public void scaling(Person target) {
		System.out.printf("치과의사 %s가 %s에게 스케일링을 해줬습니다.\n",name,target.name);
	}
}















