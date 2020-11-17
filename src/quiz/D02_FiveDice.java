package quiz;


import dice.Dice;

public class D02_FiveDice {
	
	// 랜덤으로 5개의 주사위를 굴린다음
	
	// 풀하우스(같은 숫자가 2개/3개)
	// 스몰 스트레이트 (1234/2345/3456)
	// 라지 스트레이트 (12345/23456)
	// 4다이스 (같은 숫자 4개)
	// 5다이스 (같은 숫자 5개)
	
	// 를 구분하는 클래스를 작성하고 테스트
	// 다른파일에 작성한후 사용
	
	public static void main(String[] args) {
		
		Dice dice = new Dice();
		dice.dice_pedigree(dice.new_dice());
		
	}
}
