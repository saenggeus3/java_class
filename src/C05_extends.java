
public class C05_extends {
	
	// Ŭ���� ���
	// �̸� ������ Ŭ������ �״�� �����޾Ƽ� ����ϴ� ��
	// ������ִ� Ŭ������ �θ�Ŭ���� �Ǵ� super Ŭ������� ��
	// ��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� subŬ���� ��� ��
	// �ڽ� Ŭ������ �θ� Ŭ������ ���� ��� ����� �״�� ��������
	// �ڽ� Ŭ������ �θ𿡰� �������� ����� ������� �����ؼ� �� �� ���� (�������̵� override)
	// �ڽ� Ŭ������ �θ𿡰� ���� ����� ������� �߰��ؼ� �� �� ����
	
	public static void main(String[] args) {
		Person minsu = new Person("�μ�",10);
		
		minsu.sayHi();
		
		Police p1= new Police();
		Doctor d1 = new Doctor();
		Dentist de1 = new Dentist();
		
		p1.sayHi();
		d1.sayHi();
		
		//��ü�� ������
		// ��������� �����̱⵵ ������ ����̱⵵��
		// Person�� �䱸�ϴ� �ڸ��� Police�� �� �� ����
		// �䱸�ϴ� Ÿ�Կ� �ش�Ÿ���� �θ�ι��� Ÿ���� �� �� ����
		
		de1.scaling(minsu);
		de1.scaling(p1);
		
		// Police�� �θ��� Person�� ��� ������ ������ �ֱ� ������
		// �ƹ� �������� PersonŸ���� �ɼ� ���� (��ĳ����)
		// �θ�Ÿ������ �ö󰡴� ��ĳ������ �ƹ� ������ ����
		
		// Person�� �ڽ��� Police�� �𸣴� ����� ������ �� �ֱ� ������
		// �ڽ�Ÿ���� �� �� ���� (�ٿ�ĳ����)
		// �ٿ�ĳ������ Ư���� ��츦 �����ϰ�� �Ұ���
		Person person01 = new Police();
		Person person02 = new Dentist();
		// Police police02 = new Person();
		
		// ���� Police���� �ν��Ͻ��� �ٽ� Police�� �ٿ�ĳ���� �� �� ����
		Police police = (Police)person01;
		//Police police2 = (Police)person02; Dentist�� policeŸ������ ��ȯ�ɼ� ����
		
		
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
		System.out.printf("�ȳ� ���̸��� %s�̰�, ���̴� %d�� �̾�.\n",name,age);
	}
	
	
}


class Police extends Person{
	// ��ӹ��� ��ü�� �����ڿ��� �θ��� �����ڸ� ������� ȣ���ؾ� ��
	// �θ��� �����ڰ� �Ű������� �䱸�ϴ� �����ڹۿ� ���°��
	// �ݵ�� ���� ä���� �θ��� �����ڸ� ȣ���ؾ� ��
	
	String name;
	
	public Police() {
		super("�����",25);
		
		//this() : ���� �ν��Ͻ��� ���� Ŭ���� ������
		//super() : ���� �ν��Ͻ��� �θ� Ŭ���� ������
		
		System.out.println(super.name);
		System.out.println(this.name);
	}
	
	
}


class Doctor extends Person{
	// �θ��� �⺻�����ڰ� �ִ� �θ� Ŭ������ ��ӹ޴� ��� �ڵ����� �θ��� �⺻�����ڸ� ȣ����
	
	// PersonŬ������ sayHi()�� ���ļ� �����
	// ������ sayHi()�� ����ϰ� �ʹٸ� super.sayHi()�� ����� �� ����
	@Override
	public void sayHi() {
		System.out.printf("�ȳ��ϼ���. ���� %s�Դϴ�.\n",name);
	}
}

class Dentist extends Doctor{
	public void scaling(Person target) {
		System.out.printf("ġ���ǻ� %s�� %s���� �����ϸ��� ������ϴ�.\n",name,target.name);
	}
}















