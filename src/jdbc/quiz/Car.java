package jdbc.quiz;


public class Car{
	private static final String USECHAR = "�����ٶ󸶰ųʴ����ӹ���������뵵�θ𺸼ҿ��������η繫�μ����־ƹٻ�������ȣ";
	int manufactureNum;
	int carType = (int)(Math.random()*99)+1;
	char use = USECHAR.charAt((int)(Math.random()*(USECHAR.length()-1))+1);
	String serial;
	String licensePlate;
	
	
	String useName = "�Ϲ�";
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
			typeName = "�¿���";
		}else if(carType < 80) {
			typeName = "������";
		}else if(carType < 98) {
			typeName = "ȭ����";
		}else {
			typeName = "Ư������";
		}
		
		char[] business = {'��','��','��','��'};
		char[] rent = {'��','��','ȣ'};
		
		for (int i = 0; i < business.length; i++) {
			if(use == business[i]) {
				useName = "������";
				break;
			}
		}
		
		for (int i = 0; i < rent.length; i++) {
			if (use == rent[i]) {
				useName = "��Ʈ��";
			}
		}
		
		
		
	}
	
}
