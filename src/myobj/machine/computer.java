package myobj.machine;

public class computer implements Electronics {

	boolean power = false;
	
	@Override
	public void powerSupply(int elect) {
		power = !power;
	}

	@Override
	public void powerConsum() {
		System.out.println("���»��");
	}

	@Override
	public void work() {
		if(power) {
			System.out.println("��ǻ�ͻ����");
		}
		
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

}
