package quiz;


import dice.Dice;

public class D02_FiveDice {
	
	// �������� 5���� �ֻ����� ��������
	
	// Ǯ�Ͽ콺(���� ���ڰ� 2��/3��)
	// ���� ��Ʈ����Ʈ (1234/2345/3456)
	// ���� ��Ʈ����Ʈ (12345/23456)
	// 4���̽� (���� ���� 4��)
	// 5���̽� (���� ���� 5��)
	
	// �� �����ϴ� Ŭ������ �ۼ��ϰ� �׽�Ʈ
	// �ٸ����Ͽ� �ۼ����� ���
	
	public static void main(String[] args) {
		
		Dice dice = new Dice();
		dice.dice_pedigree(dice.new_dice());
		
	}
}
