package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_count_random_fruit {
	
	public static void main(String[] args) {
		
		// ũ�� 100�� �迭�� ���� ���� ���ڿ��� ����
		// �����ϴ� ���� : apple, banana, orange, peach, kiwi
		
		// �� ���� �� ��� �����ߴ��� ��� ����Ͽ� ���
		
		Random ran = new Random();
		
		String[] fruit = new String[] {"apple", "banana", "orange", "peach", "kiwi"};
		int[] count = new int[5];
		// enum�� ����
		int apple = 0;
		int banana = 1;
		int orange = 2;
		int peach = 3;
		int kiwi = 4;

		String[] random_fruit = new String[100];
		
		for (int i = 0; i < random_fruit.length; i++) {
			int random = ran.nextInt(5);
			random_fruit[i] = fruit[random];
			count[random]++;
		}
		
		
		for (int i = 0; i < fruit.length; i++) {
			System.out.printf("%S : %d ��\n",fruit[i],count[i]);
		}
		
		System.out.println();
		
		for (int i = 1; i < random_fruit.length+1; i++) {
			System.out.print(random_fruit[i-1]+ " ");
			if(i%10==0) {
				System.out.println();
			}
		}
		
		
		
		//System.out.println(fruit[(int)(Math.random()*100)]);
		
		
		
		System.out.println("�ٳ����� Ƚ�� : " + count[banana]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
