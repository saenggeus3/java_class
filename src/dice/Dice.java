package dice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dice {
	
	int[] reroll_count = new int[6];
	int[] dice_count = new int[6];
	ArrayList<Integer> dice = new ArrayList<Integer>();
	static int totalDice = 5;
	Scanner sc = new Scanner(System.in);
	
	public Dice() {
		
	}
	
	public ArrayList<Integer> new_dice() {
		for (int i = 0; i < totalDice; i++) {
			int tmp = (int)(Math.random()*6)+1;
			dice.add(tmp);
			dice_count[tmp-1]++;
		}
		
		
		return dice;
	}
	
	public void dice_remove() {
		dice.removeAll(dice);
		dice_count = new int[6];
	}
	
	public void reroll() {
		
		while(true) {
			System.out.println("1. �ֻ��� �ٽõ�����\n2. �Ϸ�");
			System.out.print("> ");
			int input = sc.nextInt();
			System.out.println();
			if (input == 1) {
				try {
					System.out.println("�������� �ֻ�����ȣ�� ������ ���ڸ� �Է��ϼ���");
					System.out.print("�ٽ� ���� �ֻ��� ��ȣ ���� : ");
					input = sc.nextInt()-1;
					if (reroll_count[input]==0) {
						reroll_count[input]++;
						dice_count[dice.get(input)-1]--;
						dice.remove(input);
						int tmp = (int)(Math.random()*6)+1;
						dice.add(input, tmp);
						dice_count[tmp-1]++;
					}else {
						System.out.println("�ش��ֻ����� ���� ��ȸ�� ��� ���");
					}
					System.out.println(dice+"\n");
				} catch (Exception e) {
					
				}
				
			}else if(input == 2){
				break;
			}else {
				System.out.println("�߸��� �Է�");
			}
		}
		
	}
	
	public void dice_pedigree(ArrayList<Integer> dice) {
		System.out.println(dice);
		
		reroll();
		
		int triple = 0;
		int pair = 0;
		int straight = 1;
		
		for (int i = 0; i < dice_count.length; i++) {
			if(dice_count[i]==5) {
				System.out.println("5���̽�!\n");
				dice_remove();
				return;
			}else if(dice_count[i]==4) {
				System.out.println("4���̽�!\n");
				dice_remove();
				return;
			}else if(dice_count[i]==3) {
				triple++;
			}else if(dice_count[i]==2) {
				pair++;
			}
			
		}
		
		for (int i = 0; i < dice_count.length-1; i++) {
			if(dice_count[i]>0 && dice_count[i+1]>0) {
				straight++;
			}else {
				straight=1;
			}
		}
		
		if(triple>0 && pair>0) {
			System.out.println("Ǯ�Ͽ콺!\n");
			dice_remove();
			return;
		}else if(straight==5) {
			System.out.println("���� ��Ʈ����Ʈ!\n");
			dice_remove();
			return;
		}else if(straight==4) {
			System.out.println("���� ��Ʈ����Ʈ!\n");
			dice_remove();
			return;
		}
		
		System.out.println("��������");
		dice_remove();
		
	}
	
	

}
