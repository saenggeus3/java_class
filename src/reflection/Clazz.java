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
		
		// 클래스 클래스
		// 클래스의 정보를 담을 수 있는 클래스
		// 원하는 클래스를 불러서 해당 클래스에 속해있는 변수, 메서드를 사용할 수 있음
		myobj.fruit.Apple apple01 = new myobj.fruit.Apple("red");
		
		
		Class c = null;
		Class c2 = apple01.getClass();
		
		try {
			c = Class.forName("myobj.fruit.Apple");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 이름이 틀렸습니다.");
			System.exit(0);
		}
		
		
		System.out.println("forname으로 불러온 Class이름 : " + c.getName());
		System.out.println("forname으로 불러온 simpleName " + c.getSimpleName());
		System.out.println("getClass로 불러온 Class이름 : " + c2.getName());
		
		System.out.println("이게 인터페이스인가요? " + c.isInterface());
		System.out.println("이게 배열인가요? " + c.isArray());
		System.out.println("이게 기본형인가요? " + c.isPrimitive());
		
		Class c3;
		try {
			c3 = Class.forName("reflection.SimpleInterface");
			System.out.println("이게 인터페이스인가요? " + c3.isInterface());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Class 타입 변수에 저장된 클래스들은 설계도 형태로 존재하고 있음
		// 설계도를 빼오는 방법1 : forName메서드에 패키지명을 정확하게 입력함
		// 설계도를 빼오는 방법2 : 만들어진 인스턴스에서 getClass()메서드를 실행함
		
		for(Constructor con : c.getConstructors()) {
			System.out.println(con.getName());
			// Constructor.getParameterTypes()
			// 해당 생성자가 전달받아야하는 매개변수들을 배열 형태로 반환
			// 타입도 클래스이기 때문에, 클래스 타입 배열로 반환됨
			System.out.println(con.getParameterTypes());
			
		}
		
		
		
		// 클래스 이름으로 클래스를 불러온뒤 생성자를 골라서 인스턴스를 생성
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
			
			//Field 클래스로 알아낼 수 있는 정보들
			System.out.println("변수명 : " + calorie.getName());
			System.out.println("타입 : " + color.getType().getSimpleName());
			System.out.println("접근제어자 : " + java.lang.reflect.Modifier.toString(color.getModifiers()));
		} catch (NoSuchFieldException e) {
			System.out.println("그런필드없음 익셉션");
		} catch (SecurityException e) {
			System.out.println("안보임 익셉션");
		}
		
		for(Method m : c.getMethods()) {
			System.out.println("Accessible Method : " + m);
			
		}
		
	}
	
	
	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.printf("%d번째 파라미터의 타입 : %s(%s)\n",
					i, parameters[i].getSimpleName(), parameters[i].getName());
		}
	}
	
	
}
