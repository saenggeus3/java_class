package reflection;

import java.lang.module.ModuleDescriptor.Exports.Modifier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import myobj.fruit.Apple;
import myobj.fruit.NoMoreCalorieException;



public class Clazz {
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, NoMoreCalorieException {
		
		// Ŭ���� Ŭ����
		// Ŭ������ ������ ���� �� �ִ� Ŭ����
		// ���ϴ� Ŭ������ �ҷ��� �ش� Ŭ������ �����ִ� ����, �޼��带 ����� �� ����
		myobj.fruit.Apple apple01 = new myobj.fruit.Apple("red");
		
		
		Class c = null;
		Class c2 = apple01.getClass();
		
		try {
			c = Class.forName("myobj.fruit.Apple");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� �̸��� Ʋ�Ƚ��ϴ�.");
			System.exit(0);
		}
		
		
		System.out.println("forname���� �ҷ��� Class�̸� : " + c.getName());
		System.out.println("forname���� �ҷ��� simpleName " + c.getSimpleName());
		System.out.println("getClass�� �ҷ��� Class�̸� : " + c2.getName());
		
		System.out.println("�̰� �������̽��ΰ���? " + c.isInterface());
		System.out.println("�̰� �迭�ΰ���? " + c.isArray());
		System.out.println("�̰� �⺻���ΰ���? " + c.isPrimitive());
		
		Class c3;
		try {
			c3 = Class.forName("reflection.SimpleInterface");
			System.out.println("�̰� �������̽��ΰ���? " + c3.isInterface());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Class Ÿ�� ������ ����� Ŭ�������� ���赵 ���·� �����ϰ� ����
		// ���赵�� ������ ���1 : forName�޼��忡 ��Ű������ ��Ȯ�ϰ� �Է���
		// ���赵�� ������ ���2 : ������� �ν��Ͻ����� getClass()�޼��带 ������
		
		for(Constructor con : c.getConstructors()) {
			System.out.println(con.getName());
			// Constructor.getParameterTypes()
			// �ش� �����ڰ� ���޹޾ƾ��ϴ� �Ű��������� �迭 ���·� ��ȯ
			// Ÿ�Ե� Ŭ�����̱� ������, Ŭ���� Ÿ�� �迭�� ��ȯ��
			System.out.println(con.getParameterTypes());
			
		}
		
		
		
		// Ŭ���� �̸����� Ŭ������ �ҷ��µ� �����ڸ� ��� �ν��Ͻ��� ����
		Object apple02 = c.getConstructor(Class.forName("java.lang.String")).newInstance("red");
		System.out.println(((myobj.fruit.Apple)apple02).eat());
		
		Object apple03 = c.getConstructor(
				Class.forName("java.lang.Integer"),
				Class.forName("java.lang.String")
				).newInstance(900, "green");
		
		((myobj.fruit.Apple)apple03).eat();
		
		try {
			Field calorie = c.getDeclaredField("calorie");
			Field color = c.getDeclaredField("color");
			
			//Field Ŭ������ �˾Ƴ� �� �ִ� ������
			System.out.println("������ : " + calorie.getName());
			System.out.println("Ÿ�� : " + color.getType().getSimpleName());
			System.out.println("���������� : " + java.lang.reflect.Modifier.toString(color.getModifiers()));
		} catch (NoSuchFieldException e) {
			System.out.println("�׷��ʵ���� �ͼ���");
		} catch (SecurityException e) {
			System.out.println("�Ⱥ��� �ͼ���");
		}
		
		for(Method m : c.getMethods()) {
			System.out.println("Accessible Method : " + m);
			
		}
		
	}
	
	
	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.printf("%d��° �Ķ������ Ÿ�� : %s(%s)\n",
					i, parameters[i].getSimpleName(), parameters[i].getName());
		}
	}
	
	
}
