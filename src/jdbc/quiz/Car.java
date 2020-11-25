package jdbc.quiz;


public class Car{
	private static final String USECHAR = "가나다라마거너더러머버서어저고노도로모보소오조구누두루무부수우주아바사자하허호";
	int manufactureNum;
	int carType = (int)(Math.random()*99)+1;
	char use = USECHAR.charAt((int)(Math.random()*(USECHAR.length()-1))+1);
	String serial;
	String licensePlate;
	
	
	String useName = "일반";
	String typeName;
	StringBuilder serialN = new StringBuilder();
	
	
	public Car(int MN) {
		manufactureNum = MN;
		
		for (int i = 0; i < 4; i++) {
			serialN.append((int)(Math.random()*9));
		};
		serial = serialN.toString();
		
		StringBuilder lp = new StringBuilder();
		
		if(carType < 10) {
			lp.append('0');
			lp.append(carType);
		}else {
			lp.append(carType);
		}
		lp.append(use+" ");
		lp.append(serial);
		
		licensePlate = lp.toString();
		
		if(carType < 70) {
			typeName = "승용차";
		}else if(carType < 80) {
			typeName = "승합차";
		}else if(carType < 98) {
			typeName = "화물차";
		}else {
			typeName = "특수차량";
		}
		
		char[] business = {'아','바','사','자'};
		char[] rent = {'하','허','호'};
		
		for (int i = 0; i < business.length; i++) {
			if(use == business[i]) {
				useName = "영업용";
				break;
			}
		}
		
		for (int i = 0; i < rent.length; i++) {
			if (use == rent[i]) {
				useName = "랜트용";
			}
		}
		
		
		
	}
	
}
